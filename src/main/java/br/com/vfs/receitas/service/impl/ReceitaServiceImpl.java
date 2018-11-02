package br.com.vfs.receitas.service.impl;

import br.com.vfs.receitas.dao.ReceitaDao;
import br.com.vfs.receitas.model.entity.Receita;
import br.com.vfs.receitas.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Implementacao do contrato de servico de receitas
 */
@Service("receitaService")
public class ReceitaServiceImpl implements ReceitaService {

    @Autowired
    private ReceitaDao receitaDao;

    @Transactional
    public List<Receita> listarReceitas() {
        return receitaDao.listarTodos();
    }

    @Transactional
    public void adicionarReceita(Receita receita) {
        receitaDao.incluir(receita);
    }

    @Transactional
    public void alterarReceita(Receita receita) {
        receitaDao.alterar(receita);
    }

    @Transactional
    public void excluirReceita(Integer id) {
        receitaDao.excluir(id);
    }

    @Transactional
    public Receita obterReceita(Integer id) {
        return receitaDao.obter(id);
    }
}
