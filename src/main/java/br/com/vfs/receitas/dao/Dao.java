package br.com.vfs.receitas.dao;

import br.com.vfs.receitas.model.entity.EntityBase;
import br.com.vfs.receitas.model.enums.OrderEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Interface base do dao
 */
public interface Dao <Entidade extends EntityBase, Chave extends Serializable> {

    /**
     * Obter um elemento atraves da chave primaria
     * @param chave
     * @return Entidade
     */
    Entidade obter(Chave chave);

    /**
     * Incluir um novo elemento na tabela
     * @param entidade
     */
    void incluir(Entidade entidade);

    /**
     * Alterar um elemento na tabela
     * @param entidade
     */
    void alterar(Entidade entidade);

    /**
     * Excluir um elemento na tabela
     * @param chave
     */
    void excluir(Chave chave);

    /**
     * Listar todos os elementos da tabela
     * @return List<Entidade>
     */
    List<Entidade> listarTodos();
}
