package test;

public abstract class DocumentBuilder {
    protected Document document;
    protected String title;
    protected String[] authors;

    public Document getDocument(){
        return document;
    }

    public void createNewDocument(){
        document = new Document(title, authors);
    }

    public abstract void createFormats();
    public abstract void createLanguages();
    public abstract void createYear();
    public abstract void createEdition();
    public abstract void createIsbn();
    public abstract void createEditorial();
    public abstract void createPages();
}
