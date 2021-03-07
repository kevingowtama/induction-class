package spring.ioc.belajar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.ioc.belajar.config.AppConfig;
import spring.ioc.belajar.entities.User;
import spring.ioc.belajar.services.UserService;
import spring.ioc.belajar.utils.MySQLDatabase;
import spring.ioc.belajar.utils.OracleDatabase;

public class Main {



    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        MySQLDatabase mySQLDatabase = context.getBean(MySQLDatabase.class);
//        OracleDatabase oracleDatabase = context.getBean(OracleDatabase.class);

        UserService userService = context.getBean(UserService.class);

        User user1 = userService.createUserMySQL("Bambang", "asdjkl");
        User user2 = userService.createUserOracle("Ahmad", "123456");

        System.out.println(user1.getName());
        System.out.println(user1.getPassword());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
    }
}
