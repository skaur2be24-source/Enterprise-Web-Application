package library.model;

public class Book extends LibraryResource implements Printable {

    private int pages;

    public Book(int resourceId, String title, String author, int pages) {
        super(resourceId, title, author);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }

    @Override
    public void printDetails() {
        System.out.println("Resource Type: Book");
        System.out.println("Resource ID: " + getResourceId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Pages: " + pages);
        System.out.println("Fine Rate: Rs. 5/day");
    }
}