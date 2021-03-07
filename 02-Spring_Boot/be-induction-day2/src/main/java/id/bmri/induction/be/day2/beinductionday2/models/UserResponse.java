package id.bmri.induction.be.day2.beinductionday2.models;

import id.bmri.induction.be.day2.beinductionday2.entities.UserType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private Integer id;
    private String username;
    private String password;
    private UserType userType;

    public UserResponse(Integer id, String username, String password, UserType userType) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
}
