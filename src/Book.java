public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    public Book() {
        this.title = "the trial";
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
    }

    public Book(String name, String writer, double money,
                String house, String code) {
        this.title = name;
        this.author = writer;
        this.price = money;
        this.publisher = house;
        this.isbn = code;
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
            if (this.title.substring(i - 1, i) == " ") {
                name += this.title.substring(i, i + 1).toUpperCase();
            }
            else {
                name += this.title.substring(i, i + 1);
            }
        }
        this.title = name;
        return name;
    }
}