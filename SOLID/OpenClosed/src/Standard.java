public class Standard  extends CardType{
    @Override
    public double calculateDiscountedPrice(double price) {
        return price * .95;
    }
}
