public class Book {

    public String title;
    public String author;
    public int releaseYear;
    public int pages;


    public Book(String title, String author, int releaseYear, int pages) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public int getEstimatePrice() {

        if (pages * 3 < 250) {
            return 250;
        } else {
            return pages * 3;
        }

    }


    public boolean isBig() {
        return pages >= 500;
    }


    public boolean matches(String word) {
        return title.contains(word) || author.contains(word);
    }


    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Год: " + releaseYear + ", Страниц: " + pages;
    }
}
