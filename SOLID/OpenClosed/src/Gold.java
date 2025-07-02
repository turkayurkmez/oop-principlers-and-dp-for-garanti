public class Gold extends  CardType{
    @Override
    public double calculateDiscountedPrice(double price) {
        return price*.85;
    }
}
