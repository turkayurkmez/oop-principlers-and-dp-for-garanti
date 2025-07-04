public  class XMLLeaf extends  XMLComponent{

    private String value;
    public XMLLeaf(String name, String value) {
        super(name);
        this.value = value;
        
    }

    @Override
    public String toXML() {
        return "<"+name+">"+value+"</"+name+">";
    }
}
