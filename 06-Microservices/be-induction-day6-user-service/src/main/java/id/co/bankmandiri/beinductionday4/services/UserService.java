package id.co.bankmandiri.beinductionday4.services;

import id.co.bankmandiri.beinductionday4.models.entities.Users;
import id.co.bankmandiri.beinductionday4.models.request.UserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<Users> findById(Integer id);

    List<Users> findAll();

    Users save(UserRequest userRequest);
}
