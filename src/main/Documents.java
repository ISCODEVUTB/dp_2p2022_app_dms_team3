package main;
import java.util.Arrays;
public abstract class Documents {
        private int Year;
        private int Pages;
        private String Edition;
        private String Editorial;
        private String isbn;
        private String Title;
        private String[] Authors;
        private Formats[] formats;
        private String[] Languages;
        Documents(int Year, int Pages, String Edition, String Editorial, String isbn, String Title, String[]Authors){
            this.Year = Year;
            this.Pages = Pages;
            this.Edition = Edition;
            this.Editorial = Editorial;
            this.isbn = isbn;
            this.Title = Title;
            this.Authors = Authors;
        }
        public Documents Formats(Formats[] formats){
        this.formats = formats;
        return this;
        }
        public Documents Languages(String[] Languages) {
        this.Languages = Languages;
        return this;
        }
    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }
    public int getPages() {
        return Pages;
    }
    public void setPages(int pages) {
        Pages = pages;
    }
    public String getEdition() {
        return Edition;
    }
    public void setEdition(String edition) {
        Edition = edition;
    }
    public String getEditorial() {
        return Editorial;
    }
    public void setEditorial(String editorial) {
        Editorial = editorial;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;
    }
    public String[] getAuthors() {
        return Authors;
    }
    public void setAuthors(String[] authors) {
        Authors = authors;
    }
    public Formats[] getFormats() {
        return formats;
    }
    public void setFormats(Formats[] formats) {
        this.formats = formats;
    }
    public String[] getLanguages() {
        return Languages;
    }
    public void setLanguages(String[] languages) {
        Languages = languages;
    }

    public String toString(){
        return  "|Home Page| " +
                "| Book Year: " + Year + "|" +
                "| Number of Pages: " + Pages + "|" +
                "| Edition: " + Edition + "|" +
                "| Editorial: " + Editorial + "|" +
                "| isbn: " + isbn + "|" +
                "| Title='" + Title + "|" +
                "| Authors=" + Arrays.toString(Authors) + "|" +
                "| Formats=" + Arrays.toString(formats) + "|" +
                "| Languages=" + Arrays.toString(Languages) + "|";
    }
    public int GetHashCode(){
        return 1543760200;
    }
    public String Category(CategoryI Category_I) {
        return "Category: " +
                Category_I;
    }
    public boolean Equals() {
        return true;
    }}