package id.bmri.induction.be.day2.beinductionday2.services;

import id.bmri.induction.be.day2.beinductionday2.entities.User;
import id.bmri.induction.be.day2.beinductionday2.models.UserRequest;
import id.bmri.induction.be.day2.beinductionday2.models.UserResponse;
import id.bmri.induction.be.day2.beinductionday2.repositories.UserRepository;
import id.bmri.induction.be.day2.beinductionday2.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse getUser(Integer id){
        User user = userRepository.getUser(id);

        return ModelMapper.mapUser(user);
    }

    public List<UserResponse> getAllUsers(){
        return userRepository.getAllUsers()
                .stream()
                .map(user -> new UserResponse(user.getId(), user.getUsername(), user.getPassword(), user.getUserType()))
                .collect(Collectors.toList());
    }

    public List<UserResponse> getAllUsers(Integer userTypeId){
        return userRepository.getAllUsers()
                .stream()
                .map(user -> new UserResponse(user.getId(), user.getUsername(), user.getPassword(), user.getUserType()))
                .filter(userResponse -> userResponse.getUserType().getId().equals(userTypeId))
                .collect(Collectors.toList());
    }

    public UserResponse addUser(UserRequest userRequest){
        User user = userRepository.addUser(userRequest);

        return ModelMapper.mapUser(user);
    }


}
