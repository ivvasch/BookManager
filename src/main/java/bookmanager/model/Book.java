package bookmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "BOOK_TITLE")
    private String bookTitle;
    @Column(name = "BOOK_AUTHOR")
    private String author;
    @Column(name = "BOOK_PRICE")
    private int price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBooKTitle() {
        return bookTitle;
    }

    public void setBooKTitle(String booKTitle) {
        this.bookTitle = booKTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", booKTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
