public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;



    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw new IllegalArgumentException("Fiyat negatif olamaz");
        }
        this.price = price;
    }

    private int stock;

    private boolean isStockAvailable=false;

    public boolean getIsStockAvailable(){
        return  stock> 0;
    }

    //public double Price {get; set}


}
