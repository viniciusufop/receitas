package br.com.vfs.receitas.controller;

import br.com.vfs.receitas.model.entity.Receita;
import br.com.vfs.receitas.model.request.ReceitaRequest;
import br.com.vfs.receitas.model.response.Response;
import br.com.vfs.receitas.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController()
@RequestMapping("/v1/receitas")
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Receita>> findAll(){
        return new ResponseEntity<List<Receita>>(receitaService.listarReceitas(), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity insert(@RequestBody ReceitaRequest receitaRequest){
        Receita receita = new Receita();
        receita.setDescricao(receitaRequest.getDescricao());
        receita.setValor(receitaRequest.getValor());
        receita.setVencimento(receitaRequest.getVencimento());
        receitaService.adicionarReceita(receita);
        Response response = new Response();
        response.setCodigo(1);
        response.setMensagem("Sucesso");
        return new ResponseEntity<Response>(response, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id){
        receitaService.excluirReceita(id);
        return getResponseEntity(HttpStatus.OK);
    }

    private ResponseEntity getResponseEntity(HttpStatus ok) {
        Response response = new Response();
        response.setCodigo(1);
        response.setMensagem("Sucesso");
        return new ResponseEntity<Response>(response, ok);
    }
}
