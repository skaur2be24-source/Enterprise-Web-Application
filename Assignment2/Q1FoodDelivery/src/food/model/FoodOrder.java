package food.model;

public abstract class FoodOrder {
    private int orderId;
    private String customerName;
    private double amount;

    public FoodOrder(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double calculateDeliveryCharge();

    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Delivery Charge: " + calculateDeliveryCharge());
    }
}