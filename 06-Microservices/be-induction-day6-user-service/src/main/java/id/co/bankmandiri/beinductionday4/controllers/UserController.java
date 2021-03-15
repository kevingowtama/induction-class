package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.models.entities.Users;
import id.co.bankmandiri.beinductionday4.models.request.UserRequest;
import id.co.bankmandiri.beinductionday4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<Users> findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @GetMapping
    public List<Users> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public Users save(@RequestBody UserRequest userRequest) {
        return userService.save(userRequest);
    }
}
