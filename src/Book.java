public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        this.title = "The Trial";
        this.author = "Franz Kafka";
        this.price = 10.99;
        this.publisher = "Penguin";
        this.isbn = "???";

    }

    public Book(String title) {
        this.title = title;
        this.author = "Franz Kafka";
        this.price = 10.99;
        this.publisher = "Penguin";
        this.isbn = "???";
        this.toTitleCase();
    }

    public Book(String name, String writer, double money,
                String house, String code) {
        this.title = name;
        this.author = writer;
        this.price = money;
        this.publisher = house;
        this.isbn = code;
        this.toTitleCase();
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.publisher = book.publisher;
        this.isbn = book.isbn;
    }

    public int checkIsbnStatus() {
        return switch(this.isbn.length()) {
            case 13 -> 0;
            case 17 -> 1;
            default -> -1;
        };
    }

    public String toTitleCase() {
        String name = "";
        name += this.title.substring(0,1).toUpperCase();
        for (int i = 1; i < this.title.length(); i++) {
            if (this.title.charAt(i - 1) == ' ') {
                name += this.title.substring(i, i + 1).toUpperCase();
            }
            else {
                name += this.title.charAt(i);
            }
        }
        this.title = name;
        return name;
    }

    @Override
    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %.2f\n" +
                "%-15s: %s\n%-15s: %s\n", "Title", this.title,
                "Author", this.author, "Price", this.price,
                "Publisher", this.publisher, "ISBN", this.isbn);
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return book.toString().equals(this.toString());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}