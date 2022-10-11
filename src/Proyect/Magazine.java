package Proyect;
public abstract class Magazine implements iOnline {
    private String Name; // Magazine Name.
    private String Magazine; // Target audience. (Santiago). "Academic Magazine, Entertainment Magazine"
    Magazine(String Name, String Magazine){
        this.Name = Name;
        this.Magazine = Magazine;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getMagazine() {
        return Magazine;
    }
    public void setMagazine(String magazine) {
        Magazine = magazine;
    }
}