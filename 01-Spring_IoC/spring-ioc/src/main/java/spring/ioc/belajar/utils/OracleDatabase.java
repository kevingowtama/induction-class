package spring.ioc.belajar.utils;

public class OracleDatabase implements Database{
    @Override
    public String getDatabaseName(){
        return "Oracle";
    }

}
