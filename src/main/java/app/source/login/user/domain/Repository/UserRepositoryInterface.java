package app.source.login.user.domain.Repository;

import app.source.login.user.domain.Entity.User;
import app.source.login.user.domain.ObjectMother.UserEmailMother;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public abstract class UserRepositoryInterface implements JpaRepository<User, Long> {
    public abstract User findByEmail(UserEmailMother email);

}
