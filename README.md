# Shopping Cart Simulation with Strategy Pattern

This Java project simulates an online shopping cart using the Strategy Pattern for applying different discount algorithms.

## Project Structure

The project consists of the following files:

1. `DiscountStrategy.java` - Interface defining the discount strategy.
2. `NoDiscount.java` - Implementation of the no discount strategy.
3. `PercentDiscount.java` - Implementation of the percentage discount strategy.
4. `FixedDiscount.java` - Implementation of the fixed discount strategy.
5. `ShoppingCart.java` - Class representing the shopping cart with a discount strategy.
6. `Main.java` - Main class to demonstrate the usage of shopping carts with different discount strategies.

## Usage

To run the project, compile and execute the `Main.java` file. The main class initializes three different shopping carts with different discount strategies and prints out the total prices.

```java
public class Main {
    public static void main(String[] args) {
        double originalPrice = 100.0;

        ShoppingCart cart1 = new ShoppingCart(new NoDiscount());
        ShoppingCart cart2 = new ShoppingCart(new PercentDiscount(10));
        ShoppingCart cart3 = new ShoppingCart(new FixedDiscount(20));

        System.out.println("Cart 1 Total: " + cart1.calculateTotal(originalPrice));
        System.out.println("Cart 2 Total: " + cart2.calculateTotal(originalPrice));
        System.out.println("Cart 3 Total: " + cart3.calculateTotal(originalPrice));
    }
}
