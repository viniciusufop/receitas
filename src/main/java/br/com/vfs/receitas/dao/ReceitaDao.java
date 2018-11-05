package br.com.vfs.receitas.dao;

import br.com.vfs.receitas.model.entity.Receita;

import java.util.List;

/**
 * Interface referente a tabela receita
 */
public interface ReceitaDao extends Dao<Receita, Integer>{
    /**
     * Retorna todas as receitas ordanadas por data
     * @return
     */
    List<Receita> listarTodosOrdenadoPorDataAsc();
}
