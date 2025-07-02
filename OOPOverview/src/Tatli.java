public class Tatli  extends Yemek{

    public boolean isSerbetVarMi() {
        return SerbetVarMi;
    }

    public void setSerbetVarMi(boolean serbetVarMi) {
        SerbetVarMi = serbetVarMi;
    }

    @Override
    public void  SunumYap(){
        System.out.println(this.getClass().getName() + " yanında dondurma ile sunuldu");
    }


    private boolean SerbetVarMi;

}

