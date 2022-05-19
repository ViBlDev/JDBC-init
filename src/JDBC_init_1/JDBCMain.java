package JDBC_init_1;

import java.sql.*;
import java.util.ArrayList;

public class JDBCMain {
    public static void main(String[] args) {

        // Créer un tableau des ordres : un "tableau qui enregistre" des objets de type "order"
        // Récupérer des order depuis la base de données pour les stocker dans le tableau des orders
        // Créer une méthode qui affiche la liste des orders

        Connection connection=null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succès");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");

            try {
                ArrayList<Order> orders = OrderSeed.listOrders(resultSet);
                Affichage.affichageOrder(orders);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            /*    while(resultSet.next()){*/

/*                int id = resultSet.getInt("id");
                String typePresta = resultSet.getString("typePresta");
                String designation = resultSet.getString("designation");
                int nombreJours = resultSet.getInt("nbDays");
                int prixUnitaire = resultSet.getInt("unitPrice");

                System.out.printf("ID : %d\nType de prestation : %s\nDesignation : " + "%s\n", id,typePresta,designation);*/




        }catch (SQLException e){
            System.out.println("Echec de la requête");
            System.out.println(e.getMessage());
        }
    }
}
