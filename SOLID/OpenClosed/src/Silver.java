public class Silver extends CardType {
    @Override
    public double calculateDiscountedPrice(double price) {
        return price * .9;
    }
}
