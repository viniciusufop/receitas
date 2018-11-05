package br.com.vfs.receitas.dao.impl;

import br.com.vfs.receitas.dao.Dao;
import br.com.vfs.receitas.model.entity.EntityBase;
import br.com.vfs.receitas.model.enums.OrderEnum;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Classe com as estrutura base do Dao
 * @param <Entidade>
 * @param <Chave>
 */
public abstract class AbstractDaoImpl<Entidade extends EntityBase, Chave extends Serializable> implements Dao<Entidade, Chave> {

    @Autowired
    private SessionFactory sessionFactory;

    protected abstract Class<Entidade> getEntity();

    public Entidade obter(Chave chave) {
        return sessionFactory.getCurrentSession().get(getEntity(), chave);
    }

    public void incluir(Entidade entidade) {
        sessionFactory.getCurrentSession().persist(entidade);
    }

    public void alterar(Entidade entidade) {
        sessionFactory.getCurrentSession().merge(entidade);
    }

    public void excluir(Chave chave) {
        Entidade entidade = obter(chave);
        sessionFactory.getCurrentSession().delete(entidade);
    }

    public List<Entidade> listarTodos() {
        return sessionFactory.getCurrentSession().createQuery("FROM "+getEntity().getSimpleName()).list();
    }

    /**
     * Listas todos os elementos ordenados por um campo
     * @param field
     * @param orderEnum
     * @return
     */
    protected List<Entidade> listarTodosOrdernado(String field, OrderEnum orderEnum) {
        return sessionFactory.getCurrentSession().createQuery(String.format("FROM %s ORDER BY %s %s", getEntity().getSimpleName(), field, orderEnum.name())).list();
    }
}
