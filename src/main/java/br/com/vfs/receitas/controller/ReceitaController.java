package br.com.vfs.receitas.controller;

import br.com.vfs.receitas.model.entity.Receita;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController()
@RequestMapping("/v1/receitas")
public class ReceitaController {

    @GetMapping
    public ResponseEntity findAll(){
        List<Receita> receitas = new ArrayList();
        Receita receita = new Receita();
        receita.setId(1);
        receita.setDescricao("primeira receita");
        receita.setValor(new BigDecimal("1000.43"));
        receita.setVencimento(Calendar.getInstance().getTime());
        receitas.add(receita);
        return new ResponseEntity(receitas, HttpStatus.OK);
    }

}
