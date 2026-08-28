package food.model;

public class PremiumOrder extends FoodOrder implements Discountable {

    public PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 0;
    }

    @Override
    public double applyDiscount() {
        return getAmount() * 0.20;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Order Type: Premium");
        System.out.println("Discount: " + applyDiscount());
    }
}