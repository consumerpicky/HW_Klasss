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

        if (pages * 3 < 250)
            return 250;
        else
            return pages * 3;

    }

    public String getisBigdaNet() {
        if (pages >= 500)
            return "Да";
        else
            return "Нет";
    }

    public String matches(String word) {
        if (title.contains(word) || author.contains(word))
            return " '" + word + "' " + " - Да";
        else
            return " '" + word + "' " + " - Нет";
    }


    @Override
    public String toString() {
        return "Название: " + title + ", Автор: " + author + ", Год: " + releaseYear + ", Страниц: " + pages;
    }
}
