package beneditorodrigo.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegurancaController {
    @GetMapping
    public String welcome(){
        return "Bem-vindo a segurança com Spring Security!";
    }
    @GetMapping("/users")
    public String users() {
        return "Nível de usuário autorizado!";
    }
    @GetMapping("/managers")
    public String managers() {
        return "Nível de administrador autorizado!";
    }
}
