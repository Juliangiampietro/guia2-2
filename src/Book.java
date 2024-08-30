public class Book {
    private String title;
    private Author author;
    private Integer stock;
    private Double price;

    public Book(String title, Author author, Integer stock, Double price) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String showBook () {
        return this.title + " " + this.author.getName() + "\t" + this.stock + "\t" + this.price;
    }
    public String showBook2 () {
        return " El libro \"" + this.title + "\" de " + this.author.getName() + " se vende a " + this.price;
    }

}