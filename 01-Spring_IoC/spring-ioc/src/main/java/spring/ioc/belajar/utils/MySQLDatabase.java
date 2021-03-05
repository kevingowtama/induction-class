package spring.ioc.belajar.utils;

public class MySQLDatabase implements Database{
    @Override
    public String getDatabaseName(){
        return "MySQL";
    }
}

