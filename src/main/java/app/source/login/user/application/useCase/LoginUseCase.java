package app.source.login.user.application.useCase;

import org.springframework.stereotype.Component;
import app.source.login.user.domain.Service.UserServiceInterface;

@Component
public class LoginUseCase {

    private final UserServiceInterface userService;

    public LoginUseCase(UserServiceInterface userService) {
        this.userService = userService;
    }

    public String invoke(String email) {
        return userService.test(email);
    }


}