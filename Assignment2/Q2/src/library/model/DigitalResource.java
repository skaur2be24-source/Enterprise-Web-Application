package library.model;

public class DigitalResource extends LibraryResource implements Printable {

    private double fileSize;

    public DigitalResource(int resourceId, String title, String author, double fileSize) {
        super(resourceId, title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }

    @Override
    public void printDetails() {
        System.out.println("Resource Type: Digital Resource");
        System.out.println("Resource ID: " + getResourceId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Fine Rate: Rs. 2/day");
    }
}