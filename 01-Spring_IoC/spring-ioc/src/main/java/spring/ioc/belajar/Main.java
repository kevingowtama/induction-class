package spring.ioc.belajar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.ioc.belajar.config.AppConfig;
import spring.ioc.belajar.entities.User;
import spring.ioc.belajar.utils.MySQLDatabase;
import spring.ioc.belajar.utils.OracleDatabase;

public class Main {

//    @Autowired
//    private MySQLDatabase mySQLDatabase;
//
//    @Autowired
//    private OracleDatabase oracleDatabase;


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MySQLDatabase mySQLDatabase = context.getBean(MySQLDatabase.class);
        OracleDatabase oracleDatabase = context.getBean(OracleDatabase.class);

        User user1 = new User(mySQLDatabase);
        User user2 = new User(oracleDatabase);

        System.out.println(user1.getDatabase().getDatabaseName());
        System.out.println(user2.getDatabase().getDatabaseName());
    }
}
