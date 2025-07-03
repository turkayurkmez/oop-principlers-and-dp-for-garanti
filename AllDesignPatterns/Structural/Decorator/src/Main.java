import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//        FileInputStream fileStream = new FileInputStream("dosya.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileStream);
//        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);

        SimpleMail mail = new SimpleMail("Yeni proje onayı","takim@deneme.com");
        EncrypedMail encrypedMail = new EncrypedMail(mail);
        SignaturedMail signaturedMail = new SignaturedMail(encrypedMail);
        signaturedMail.setSignature("Türkay Ürkmez");
        signaturedMail.Send();

    }
}