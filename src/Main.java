public class Main {
    public static void main(String[] args) {
        double originalPrice = 50.00;
        ShoppingCart sc1 = new ShoppingCart(new NoDiscount());
        ShoppingCart sc2 = new ShoppingCart(new PercentageDiscount(15.0));
        ShoppingCart sc3 = new ShoppingCart(new FixedDiscount(20.0));

        System.out.println("Cart 1 total: " + sc1.calculateTotal(originalPrice));
        System.out.println("Cart 2 total: " + sc2.calculateTotal(originalPrice));
        System.out.println("Cart 3 total: " + sc3.calculateTotal(originalPrice));

    }
}