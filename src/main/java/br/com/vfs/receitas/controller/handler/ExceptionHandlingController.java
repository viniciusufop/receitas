package br.com.vfs.receitas.controller.handler;

import br.com.vfs.receitas.model.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionHandlingController {

    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR,
            reason="Erro interno")
    @ExceptionHandler({Exception.class})
    public Response databaseError() {
        Response response = new Response();
        response.setCodigo(0);
        response.setMensagem("Erro na execucao do fluxo do servidor");
        return response;
    }
}
