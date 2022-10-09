package test;

public class Director {
    private DocumentBuilder documentBuilder;

    public void setDocumentBuilder(DocumentBuilder db){
        documentBuilder = db;
    }

    public Document getDocument(){
        return documentBuilder.getDocument();
    }

    public void constructDocument(){
        documentBuilder.createNewDocument();
        documentBuilder.createEdition();
        documentBuilder.createFormats();
        documentBuilder.createIsbn();
        documentBuilder.createPages();
        documentBuilder.createEditorial();
        documentBuilder.createYear();
        documentBuilder.createLanguages();
    }
}
