package food.service;

import food.model.Discountable;
import food.model.FoodOrder;

public class OrderUtility {

    public static boolean validateAmount(double amount) {
        return amount > 0;
    }

    public static boolean validateCustomerName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static void generateOrderSummary(FoodOrder order) {

        double amount = order.getAmount();
        double discount = 0;

        if (order instanceof Discountable) {
            discount = ((Discountable) order).applyDiscount();
        }

        double deliveryCharge = order.calculateDeliveryCharge();

        double finalAmount = amount - discount + deliveryCharge;

        System.out.println("\n========== ORDER SUMMARY ==========");
        order.displayDetails();
        System.out.println("Bill Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Payable Amount: " + finalAmount);
        System.out.println("===================================");
    }
}