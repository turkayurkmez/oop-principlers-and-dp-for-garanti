public class Main {
    public static void main(String[] args) {

        XMLNode book = new XMLNode("book");
        XMLNode author = new XMLNode("author");

        XMLLeaf aName = new XMLLeaf("firstName","Jules");
        XMLLeaf aLastName = new XMLLeaf("lastName","Verne");

        author.addChild(aName);
        author.addChild(aLastName);

        XMLLeaf title = new XMLLeaf("title","Ay'a iniş");
        XMLLeaf description = new XMLLeaf("description","Hayal gücünü ateşleyen bir eser");

        book.addChild(title);
        book.addChild(description);
        book.addChild(author);

        System.out.println(book.toXML());

    }
}