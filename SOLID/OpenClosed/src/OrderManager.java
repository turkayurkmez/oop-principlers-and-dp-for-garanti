public class OrderManager {

    private  Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public double GetDiscountedPrice(double totalPrice){

        /*
        switch (customer.getCardType()){
            case Standard -> {
                return totalPrice * 0.95;
            }
            case Silver -> {
                return totalPrice * 0.9;
            }
            case Gold -> {
                return totalPrice * 0.85;
            }
            case Premium -> {
                return totalPrice * .8;
            }
        }*/

        return customer.getCardType().calculateDiscountedPrice(totalPrice);


    }
}
