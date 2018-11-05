package br.com.vfs.receitas.dao.impl;

import br.com.vfs.receitas.dao.ReceitaDao;
import br.com.vfs.receitas.model.entity.Receita;
import br.com.vfs.receitas.model.enums.OrderEnum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("receitaDao")
public class ReceitaDaoImpl extends AbstractDaoImpl<Receita, Integer> implements ReceitaDao {

    @Override
    protected Class<Receita> getEntity() {
        return Receita.class;
    }

    public List<Receita> listarTodosOrdenadoPorDataAsc() {
        return listarTodosOrdernado("vencimento", OrderEnum.ASC);
    }
}
