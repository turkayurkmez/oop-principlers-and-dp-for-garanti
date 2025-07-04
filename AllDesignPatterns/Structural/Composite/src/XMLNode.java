import java.util.ArrayList;
import java.util.List;

public class XMLNode extends XMLComponent{


    private List<XMLComponent> children;

    public XMLNode(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    @Override
    public void addChild(XMLComponent component) {
        children.add(component);
    }

    @Override
    public String toXML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<"+name+">");
        for (XMLComponent child : children){
            builder.append(child.toXML());
        }
        
        builder.append("</"+name+">");
        return builder.toString();
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
