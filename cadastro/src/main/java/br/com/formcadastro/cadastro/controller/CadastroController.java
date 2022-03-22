package br.com.formcadastro.cadastro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {
    
    @RequestMapping("/cadastro/novo")
    public String novo(){
        return("NovoForm.html");
    }
}
