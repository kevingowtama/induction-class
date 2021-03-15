package id.co.bankmandiri.beinductionday4.adaptor;

import id.co.bankmandiri.beinductionday4.adaptor.dto.UserDTO;
import id.co.bankmandiri.beinductionday4.adaptor.dto.UserListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserAdaptor {

//    Error kalo pake bean RestTemplate
//
//    @Autowired
//    private static RestTemplate restTemplate;

    private static final RestTemplate localrest = new RestTemplate();
    private static final String API_URL = "http://localhost:8081/api/v1";

    public static UserDTO getUser(Integer id){

        return localrest.getForObject(API_URL + "/" + id , UserDTO.class);
    }

    public static List<UserDTO> getAllUsers(){

        return Arrays.asList(localrest.getForEntity(API_URL, UserDTO[].class).getBody());
    }

    public static ResponseEntity<UserDTO> addUser(UserDTO userDTO){

        List<UserDTO> list = new ArrayList<>();
        list.add(userDTO);

        return localrest.postForObject(API_URL, list, ResponseEntity.class);
    }

}
