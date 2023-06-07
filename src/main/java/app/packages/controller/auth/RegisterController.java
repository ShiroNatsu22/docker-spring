package packages.controller.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import packages.source.login.user.application.useCase.LoginUseCase;

@RestController
public class RegisterController {

    private final LoginUseCase useCase;

    public RegisterController(LoginUseCase useCase) {
        this.useCase = useCase;
    }

    @RequestMapping("/user/register")
    public String register(){
        return useCase.invoke("Email Test");
    }

}
