package id.bmri.induction.be.day2.beinductionday2.utils;

import id.bmri.induction.be.day2.beinductionday2.entities.User;
import id.bmri.induction.be.day2.beinductionday2.models.UserResponse;

public class ModelMapper {

    public static UserResponse mapUser(User user){

        return new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getUserType()
        );
    }
}
