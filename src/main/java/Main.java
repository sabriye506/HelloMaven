import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Maven");


        Connection connection = null;

        String url = "jdbc:sqlite:Resources/student.db";
        try{
            connection = DriverManager.getConnection(url);
            System.out.println("Connection Success");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
