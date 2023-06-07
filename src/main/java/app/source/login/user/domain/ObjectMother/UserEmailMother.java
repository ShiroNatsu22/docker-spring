package app.source.login.user.domain.ObjectMother;


import app.source.shared.domain.StringValueObject;
import org.springframework.stereotype.Component;

public final class UserEmailMother extends StringValueObject {
    public UserEmailMother(String value) {
        super(value);
    }

    public UserEmailMother() {
        super("");
    }
}