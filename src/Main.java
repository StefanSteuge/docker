import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            String dbUrl = "jdbc:mysql://db:3306";
            Connection connection = DriverManager.getConnection(dbUrl,"root","password");

            if (connection!=null) {
                System.out.println("Successfully connected to MySQL database test");
            }
        }catch (Exception e) {
            System.out.println(String.format("Error: %s", e));
        }
    }
}