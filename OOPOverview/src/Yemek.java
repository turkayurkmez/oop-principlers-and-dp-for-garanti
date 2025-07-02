public class Yemek {

    private int pismeSuresi;



    private String adi;

    public void SunumYap(){
        System.out.println(this.getClass().getName() + " yanında pilav ile sunuldu");
    }




    public void Pisir(){



        System.out.println("Yemek pişti");
    }

    public int getPismeSuresi() {
        return pismeSuresi;
    }

    public void setPismeSuresi(int pismeSuresi) {
        this.pismeSuresi = pismeSuresi;
    }
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
