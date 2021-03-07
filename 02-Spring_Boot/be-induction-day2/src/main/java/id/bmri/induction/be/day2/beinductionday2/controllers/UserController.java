package id.bmri.induction.be.day2.beinductionday2.controllers;

import id.bmri.induction.be.day2.beinductionday2.models.UserRequest;
import id.bmri.induction.be.day2.beinductionday2.models.UserResponse;
import id.bmri.induction.be.day2.beinductionday2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getHome(){
        return "Hello World";
    }

    @GetMapping("/{id}")
    public UserResponse getUser(
            @PathVariable Integer id){

        return userService.getUser(id);
    }

    @GetMapping("/users")
    public List<UserResponse> getAllUsers(
            @RequestParam(defaultValue = "-1") Integer userTypeId
    ){
        if(userTypeId.equals(-1)){
            return userService.getAllUsers();
        }
        return userService.getAllUsers(userTypeId);
    }

    @PostMapping("/add")
    public UserResponse addUser(@RequestBody UserRequest userRequest){

        return userService.addUser(userRequest);
    }

    // bikin app spring dengan get & post, return terserah, tapi business logic di service
    // untuk GET sertakan requestparam dan pathvariable.
    // untuk POST sertakan :
    // 1. return http status ok
    // 2. return json
    // 3. return response error
    // model response dan model request
    // controller memanggil service dan return model response
}
