package main;
public class Book implements I_PDF {
    private String Name; // Book Name.
    private String Public; // Target audience. (Santiago). "Children, Boys, Girls, etc"
    private String Scene; // Reading scenario. (Santiago). "Library, etc"
    Book(String Name, String Public, String Scene){
        this.Name = Name;
        this.Public = Public;
        this.Scene = Scene;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getPublic() {
        return Public;
    }
    public void setPublic(String aPublic) {
        Public = aPublic;
    }
    public String getScene() {
        return Scene;
    }
    public void setScene(String scene) {
        Scene = scene;
    }
    @Override
    public String Operations() {
        return "Next Page" +
                "Scroll"+
                "Reload Page";
    }
    public String Category(CategoryI Category_I){
        return "Category: " +
                Category_I;
    }
}