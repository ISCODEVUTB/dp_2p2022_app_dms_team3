package test;

import Proyect.Formats;
import Proyect.iOnline;
import Proyect.iPDF;

public class Scientific extends DocumentBuilder implements iPDF, iOnline {
    Scientific(String title){
        super.title = title;
    }

    @Override
    public void createEdition() {
        document.setEdition("second edition");
    }

    @Override
    public void createEditorial() {
        document.setEditorial("norma");
    }

    @Override
    public void createFormats() {
        Formats[] formats = {Formats.Audio,Formats.Digital};
        document.setFormats(formats);
    }

    @Override
    public void createIsbn() {
        document.setIsbn("0-7448-4020-1");
    }

    @Override
    public void createPages() {
        document.setPages(20);
    }

    @Override
    public void createLanguages() {
        String[] languages = {"español","frances"};
        document.setLanguages(languages);
    }

    @Override
    public void createYear() {
        document.setYear(2022);
    }

    public String CategoryI(){
        return "yes";
    }

    public String Operations(){
        return "{next,previous}";
    }
}
