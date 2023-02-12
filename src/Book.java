public class Book {
private String title;
private int publisheryear;
private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisheryear() {
        return publisheryear;
    }

    public void setPublisheryear(int publisheryear) {
        this.publisheryear = publisheryear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book(String title, int publisheryear, Author author) {
        this.title = title;
        this.publisheryear = publisheryear;
        this.author = author;
    }
}
