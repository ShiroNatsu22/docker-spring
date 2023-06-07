package packages.source.login.user.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import packages.source.login.user.domain.ObjectMother.UserEmailMother;
import packages.source.login.user.domain.Entity.User;

@Component
public abstract class UserRepositoryInterface implements JpaRepository<User, Long> {
    public abstract User findByEmail(UserEmailMother email);

}
