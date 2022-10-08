package beneditorodrigo.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegurancaController {

    @GetMapping("/")
    public String index(){
        return "Olá! Estou seguro com Spring Boot!";
    }
}
