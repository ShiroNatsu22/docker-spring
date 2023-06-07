package app.controller.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import app.source.login.user.application.useCase.LoginUseCase;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    private final LoginUseCase useCase;

    public RegisterController(LoginUseCase useCase) {
        this.useCase = useCase;
    }

    @RequestMapping("/user/register")
    public String register(){
        return useCase.invoke("Danielito");
    }

}
