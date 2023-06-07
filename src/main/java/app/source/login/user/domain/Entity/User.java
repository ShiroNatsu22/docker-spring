package app.source.login.user.domain.Entity;


import jakarta.persistence.*;
import app.source.login.user.domain.ObjectMother.UserIdMother;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public final class User {

    @Id
    private String id;

    @Column(name="name")
    private String username;
/*
    @Column(name="password")
    private UserPasswordMother password;

    @Column(name="email")
    private UserEmailMother email;
*/
    public String id() {
        return this.id;
    }

    public String username() {
        return this.username;
    }
/*
    public void password(UserPasswordMother password) {
        this.password = password;
    }

    public void email(UserEmailMother email) {
        this.email = email;
    }*/


}