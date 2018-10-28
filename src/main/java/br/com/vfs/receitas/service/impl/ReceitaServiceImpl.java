package br.com.vfs.receitas.service.impl;

import br.com.vfs.receitas.model.entity.Receita;
import br.com.vfs.receitas.service.ReceitaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Implementacao do contrato de servico de receitas
 */
@Service("receitaService")
public class ReceitaServiceImpl implements ReceitaService {

    public List<Receita> listarReceitas() {
        List<Receita> receitas = new ArrayList();
        Receita receita = new Receita();
        receita.setId(1);
        receita.setDescricao("primeira receita");
        receita.setValor(new BigDecimal("1000.43"));
        receita.setVencimento(Calendar.getInstance().getTime());
        receitas.add(receita);
        return receitas;
    }

    public void adicionarReceita(Receita receita) {

    }

    public void alterarReceita(Receita receita) {

    }

    public void excluirReceita(Integer id) {

    }
}
