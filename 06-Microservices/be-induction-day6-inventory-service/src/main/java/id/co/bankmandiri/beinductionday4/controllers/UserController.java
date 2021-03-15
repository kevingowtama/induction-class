package id.co.bankmandiri.beinductionday4.controllers;

import id.co.bankmandiri.beinductionday4.adaptor.UserAdaptor;
import id.co.bankmandiri.beinductionday4.adaptor.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping
    public List<UserDTO> getUserList(){
        return UserAdaptor.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Integer id){
        return UserAdaptor.getUser(id);
    }

    @PostMapping
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO){
        return UserAdaptor.addUser(userDTO);
    }
}
