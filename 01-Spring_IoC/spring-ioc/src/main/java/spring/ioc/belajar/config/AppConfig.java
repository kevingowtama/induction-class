package spring.ioc.belajar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.ioc.belajar.entities.User;
import spring.ioc.belajar.utils.Database;
import spring.ioc.belajar.utils.MySQLDatabase;
import spring.ioc.belajar.utils.OracleDatabase;

@Configuration
public class AppConfig {

    @Bean
    public Database mySQLDatabase(){
        return new MySQLDatabase();
    }

    @Bean
    public Database oracleDatabase(){
        return new OracleDatabase();
    }

}
