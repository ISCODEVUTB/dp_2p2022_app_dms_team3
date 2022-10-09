package test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    Director director = new Director();
    DocumentBuilder alice = new Book("alice in wonderland");
    DocumentBuilder python = new Scientific("learn Python");
    DocumentBuilder tmz = new Magazine("kanye new public enemy");
    DocumentBuilder thesis = new Thesis("solar panels thesis");

    @org.junit.jupiter.api.Test
    void constructBook() {
        director.setDocumentBuilder(alice);
        director.constructDocument();
        Document completedAliceDoc = director.getDocument();
        assertEquals(completedAliceDoc.getClass().getSimpleName(),"Book");
    }

    @org.junit.jupiter.api.Test
    void constructBook() {
        director.setDocumentBuilder(python);
        director.constructDocument();
        Document completedPythonDoc = director.getDocument();
        assertEquals(completedPythonDoc.getClass().getSimpleName(), "Scientific");
    }

    @org.junit.jupiter.api.Test
    void constructBook() {
        director.setDocumentBuilder(tmz);
        director.constructDocument();
        Document completedTmzDoc = director.getDocument();
        assertEquals(completedTmzDoc.getClass().getSimpleName(),"Magazine");
    }

    @org.junit.jupiter.api.Test
    void constructBook() {
        director.setDocumentBuilder(thesis);
        director.constructDocument();
        Document completedThesisDoc = director.getDocument();
        assertEquals(completedThesisDoc.getClass().getSimpleName(),"Thesis");
    }
}