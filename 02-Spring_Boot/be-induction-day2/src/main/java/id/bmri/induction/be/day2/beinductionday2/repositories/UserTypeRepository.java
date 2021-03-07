package id.bmri.induction.be.day2.beinductionday2.repositories;

import id.bmri.induction.be.day2.beinductionday2.data.UserData;
import id.bmri.induction.be.day2.beinductionday2.data.UserTypeData;
import id.bmri.induction.be.day2.beinductionday2.entities.User;
import id.bmri.induction.be.day2.beinductionday2.entities.UserType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserTypeRepository {

    public UserType getUserType(Integer id){
        UserType match = UserTypeData.userTypes.stream().filter(user -> user.getId().equals(id)).findAny().get();

        return match;
    }

    public List<UserType> getAllUserTypes(){
        return UserTypeData.userTypes;
    }
}
