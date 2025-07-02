public abstract class Document {
    private String title;

    public void  Copy(String from, String to){
        System.out.println("dosya kopyalandı");
    }

    public abstract void Open();

    public abstract void Save();
    //public abstract void Print();

}
