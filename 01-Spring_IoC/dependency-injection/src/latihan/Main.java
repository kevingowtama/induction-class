package latihan;

public class Main {

    // Latihan Dependency Injection
    public static void main(String[] args) {
        User user1 = new User(new MySQLDatabase());
        User user2 = new User(new OracleDatabase());

        System.out.println(user1.getDatabase().getDatabaseName());
        System.out.println(user2.getDatabase().getDatabaseName());
    }
}
