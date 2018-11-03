package br.com.vfs.receitas.model.request;

import java.math.BigDecimal;
import java.util.Date;

public class ReceitaRequest {

    private String descricao;
    private Date vencimento;
    private BigDecimal valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
