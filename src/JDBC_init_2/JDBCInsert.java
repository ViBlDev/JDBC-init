package JDBC_init_2;

import java.sql.*;
import java.util.Scanner;

public class JDBCInsert {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.println("Combien des clients souhaitez-vous stocker?");
        var nombreClientsAInserer=input.nextInt();
        input.nextLine();

        Connection connection=null;

        while (nombreClientsAInserer>0){
            System.out.print("Votre société : ");
            var company=input.nextLine();

            System.out.print("Votre nom : ");
            var lastName=input.nextLine();

            System.out.print("Votre prenom : ");
            var firstName=input.nextLine();

            System.out.print("Votre adresse email : ");
            var email=input.nextLine();

            System.out.print("Votre numéro de téléphone : ");
            var phoneNumber=input.nextLine();


            System.out.print("Votre adresse: ");
            var address=input.nextLine();

            System.out.print("Votre code postal: ");
            var zipCode=input.nextLine();

            System.out.print("Votre ville: ");
            var city=input.nextLine();

            System.out.print("Votre pays: ");
            var country=input.nextLine();


            try{
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                        "/poe_ang_v1","root","");

                PreparedStatement statement=connection.prepareStatement("INSERT INTO " +
                        "`clients` (`companyName`, `firstName`, `lastName`, " +
                        "`email`, `phone`, `address`, `zipCode`, `city`, `country`, " +
                        "`state`) VALUES(?,?,?,?,?,?,?,?,?,?)");
                statement.setString(1,company);
                statement.setString(2,firstName);
                statement.setString(3,lastName);
                statement.setString(4,email);
                statement.setString(5,phoneNumber);
                statement.setString(6,address);
                statement.setString(7,zipCode);
                statement.setString(8,city);
                statement.setString(9,country);
                statement.setInt(10,0);

                statement.executeUpdate();
                nombreClientsAInserer -=1;

            }catch (SQLException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
