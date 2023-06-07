package app.source.login.user.infrastructure.Service;

import app.source.login.user.domain.Entity.User;
import app.source.login.user.domain.ObjectMother.UserEmailMother;
import app.source.login.user.domain.ObjectMother.UserIdMother;
import app.source.login.user.domain.ObjectMother.UserNameMother;
import app.source.login.user.domain.ObjectMother.UserPasswordMother;
import app.source.login.user.domain.Repository.UserRepositoryInterface;
import app.source.login.user.domain.Service.UserServiceInterface;
import org.springframework.stereotype.Service;

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
