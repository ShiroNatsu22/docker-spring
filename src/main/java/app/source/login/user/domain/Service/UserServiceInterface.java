package app.source.login.user.domain.Service;

import org.springframework.stereotype.Component;
import app.source.login.user.domain.Entity.User;

@Component
public interface UserServiceInterface {
    void save(User user);
    User findUserByEmail(String email);

    String test (String email);
}
