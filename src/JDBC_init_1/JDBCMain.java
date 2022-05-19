package JDBC_init_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMain {
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succès");
        }catch (SQLException e){
            System.out.println("Echec de la requête");
            System.out.println(e.getMessage());
        }
    }
}
