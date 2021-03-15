package id.co.bankmandiri.beinductionday4.services.impl;

import id.co.bankmandiri.beinductionday4.models.entities.Users;
import id.co.bankmandiri.beinductionday4.models.request.UserRequest;
import id.co.bankmandiri.beinductionday4.repositories.UserRepository;
import id.co.bankmandiri.beinductionday4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<Users> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users save(UserRequest userRequest) {
        return userRepository.save(Users.builder()
                .name(userRequest.getName())
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .build()
        );
    }
}
