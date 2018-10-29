package br.com.vfs.receitas.dao.impl;

import br.com.vfs.receitas.dao.ReceitaDao;
import br.com.vfs.receitas.model.entity.Receita;
import org.springframework.stereotype.Repository;

@Repository("receitaDao")
public class ReceitaDaoImpl extends AbstractDaoImpl<Receita, Integer> implements ReceitaDao {

    @Override
    protected Class<Receita> getEntity() {
        return Receita.class;
    }
}
