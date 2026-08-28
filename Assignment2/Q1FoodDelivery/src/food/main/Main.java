package food.main;

import food.model.FoodOrder;
import food.model.RegularOrder;
import food.model.PremiumOrder;
import food.service.OrderUtility;

public class Main {

    static int totalOrders = 0;

    public static void displayTotalOrders() {
        System.out.println("\nTotal Orders: " + totalOrders);
    }

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new RegularOrder(101, "Rahul", 500);
        orders[1] = new PremiumOrder(102, "Priya", 1000);
        orders[2] = new RegularOrder(103, "Amit", 750);
        orders[3] = new PremiumOrder(104, "Sneha", 1200);
        orders[4] = new RegularOrder(105, "Karan", 600);
        orders[5] = new PremiumOrder(106, "Neha", 1500);

        totalOrders = orders.length;

        for (FoodOrder order : orders) {

            if (!OrderUtility.validateCustomerName(
                    order.getCustomerName())) {

                System.out.println("Invalid customer name!");
                continue;
            }

            if (!OrderUtility.validateAmount(
                    order.getAmount())) {

                System.out.println("Invalid amount!");
                continue;
            }

            OrderUtility.generateOrderSummary(order);
        }

        displayTotalOrders();
    }
}   