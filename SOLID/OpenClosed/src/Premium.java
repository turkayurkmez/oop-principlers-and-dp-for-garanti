public class Premium extends  CardType{
    @Override
    public double calculateDiscountedPrice(double price) {
        return price * .8;
    }
}
