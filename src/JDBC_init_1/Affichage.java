package JDBC_init_1;

import java.util.ArrayList;

public class Affichage {

    public static void affichageOrder(ArrayList<Order> orders){
        for (Order order : orders) {
            System.out.println(order);
        }

    }
}
