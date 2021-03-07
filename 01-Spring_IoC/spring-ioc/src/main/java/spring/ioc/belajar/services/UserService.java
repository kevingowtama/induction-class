package spring.ioc.belajar.services;

import org.springframework.beans.factory.annotation.Autowired;
import spring.ioc.belajar.entities.User;
import spring.ioc.belajar.utils.MySQLDatabase;
import spring.ioc.belajar.utils.OracleDatabase;

public class UserService {

    @Autowired
    private MySQLDatabase mySQLDatabase;

    @Autowired
    private OracleDatabase oracleDatabase;

    public User createUserMySQL(String name, String password){
        User user = new User(mySQLDatabase);
        user.setName(name);
        user.setPassword(password);

        return user;
    }

    public User createUserOracle(String name, String password){
        User user = new User(mySQLDatabase);
        user.setName(name);
        user.setPassword(password);

        return user;
    }

}
