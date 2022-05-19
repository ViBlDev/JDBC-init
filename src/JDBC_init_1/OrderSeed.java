package JDBC_init_1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderSeed {
    public static ArrayList<Order> listOrders (ResultSet resultSet) throws Exception {
        var orders = new ArrayList<Order>();


            while (resultSet.next()) {
                Order order = new Order(
                        resultSet.getInt("id"),
                        resultSet.getInt("clientId"),
                        resultSet.getString("typePresta"),
                        resultSet.getString("designation"),
                        resultSet.getInt("nbDays"),
                        resultSet.getInt("unitPrice"),
                        resultSet.getByte("state"),
                        resultSet.getFloat("totalExcludeTaxe"),
                        resultSet.getFloat("totalWithTaxe"));

                orders.add(order);
            }

        return orders;
    }
}
