package packages.source.login.user.infrastructure.Service;

import org.springframework.stereotype.Service;
import packages.source.login.user.domain.Service.UserServiceInterface;
import packages.source.login.user.domain.Entity.User;

@Service
public class UserService implements UserServiceInterface {


    public UserService() {

    }

    @Override
    public void save(User user) {
        //make variables for all the fields
        /*user.id(new UserIdMother("abc"));
        user.email(new UserEmailMother("churroMontetruco@relajao.com"));
        user.password(new UserPasswordMother("123456"));
        user.username(new UserNameMother("churroMontetruco"));*/

        //userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return  new User();
    }

    @Override
    public String test(String email) {
        return "Hola " + email;
    }

}
