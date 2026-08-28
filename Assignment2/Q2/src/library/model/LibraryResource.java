package library.model;

public abstract class LibraryResource {

    private int resourceId;
    private String title;
    private String author;

    public LibraryResource(int resourceId, String title, String author) {
        this.resourceId = resourceId;
        this.title = title;
        this.author = author;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract double calculateFine(int overdueDays);
}