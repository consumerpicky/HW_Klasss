public class Main {
    public static void main(String[] args) {
        String word = "Лупа";
        Book book = new Book("Пупа и Лупа", "Бухгалтер", 1984, 500);
        System.out.println(book);
        System.out.println("Книга большая - " + (book.isBig() ? "Да" : "Нет"));
        System.out.println("Цена книги " + book.getEstimatePrice());
        System.out.println("В книге есть слово - " + word + " - " + (book.matches(word) ? "Да" : "Нет"));

    }
}

