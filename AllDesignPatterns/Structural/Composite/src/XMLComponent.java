import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class XMLComponent {
   public void addChild(XMLComponent component){
       throw new UnsupportedOperationException("Bu elementin altına child ekelenemez");
    }

    public boolean isComposite(){
        return false;
    }

    public  abstract String toXML();
    protected String  name;

    public XMLComponent(String name) {
        this.name = name;
    }
}

