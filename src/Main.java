
public class Main {
    public static void main(String[] args) {

        Author autor = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(autor.showAuthor());

        Book EffJava = new Book("Effective Java",autor,150,450.0);
        System.out.println(EffJava.showBook());


        EffJava.setPrice(500.0);
        EffJava.setStock(50);
        System.out.println(EffJava.getAuthor().showAuthor());

        System.out.println(EffJava.showBook2());






    }
}