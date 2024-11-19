import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        for (int i = 0; i < 5; i++) {

            this.books.add(new Book());
        }
    }

    public Library(ArrayList<Book> list) {
        this.books = list;
    }

    public Library(Library lib) {
        lib.books = this.books;
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book b : this.books) {
            if (b.getAuthor().contains(keyword) || b.getTitle().contains(keyword)) {
                list.add(b);
            }
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()) {
            return false;
        }
        Library lib = (Library) o;
        return lib.books == this.books;
    }

    @Override
    public String toString() {
        String string = "";
        for (Book b : this.books) {
            string += b.toString() + "\n";
        }
        return string;
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
