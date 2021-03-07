package id.bmri.induction.be.day2.beinductionday2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String username;
    private String password;
    private Integer userTypeId;

}
