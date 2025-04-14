public class Main  {
    public static void main (String [] args) {
        Book book = new Book("Пупа и Лупа", "Бухгалтер", 1984, 499);
        System.out.println (book);
        System.out.println ("Книга большая - " + book.getisBigdaNet());
        System.out.println("Цена книги " + book.getEstimatePrice());
        System.out.println("В книге есть слово - " + book.matches("Бухгалтер"));

    }
}

