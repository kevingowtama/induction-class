package id.bmri.induction.be.day2.beinductionday2.repositories;

import id.bmri.induction.be.day2.beinductionday2.data.UserData;
import id.bmri.induction.be.day2.beinductionday2.entities.User;
import id.bmri.induction.be.day2.beinductionday2.entities.UserType;
import id.bmri.induction.be.day2.beinductionday2.models.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private UserTypeRepository userTypeRepository;

    public User getUser(Integer id){
        User match = UserData.users.stream().filter(user -> user.getId().equals(id)).findAny().get();

        return match;
    }

    public List<User> getAllUsers(){
        return UserData.users;
    }

    public User addUser(UserRequest userRequest){
        Integer id = UserData.users.size() + 1;
        UserType userType = userTypeRepository.getUserType(userRequest.getUserTypeId());

        User user = new User(id, userRequest.getUsername(), userRequest.getPassword(), userType);

        UserData.users.add(user);

        return user;
    }
}
