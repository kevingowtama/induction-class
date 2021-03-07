package id.bmri.induction.be.day2.beinductionday2.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {
    private Integer id;
    private String username;
    private String password;
    private UserType userType;

    public User(Integer id, String username, String password, UserType userType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

}
