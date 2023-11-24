public class ShoppingCart {
    private DiscountStrategy discountStrategy;
    public ShoppingCart(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    public double calculateTotal(double originalPrice){
        return discountStrategy.applyDiscount(originalPrice);
    }
}
