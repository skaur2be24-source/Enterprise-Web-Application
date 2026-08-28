package food.model;

public class RegularOrder extends FoodOrder implements Discountable {

    public RegularOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 80;
    }

    @Override
    public double applyDiscount() {
        return getAmount() * 0.10;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Order Type: Regular");
        System.out.println("Discount: " + applyDiscount());
    }
}