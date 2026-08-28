package main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import service.LibraryService;
import util.InputValidator;

public class Main {

    public static void main(String[] args) {

        // Create Book
        Book book = new Book(
                101,
                "Java Programming",
                "James Gosling",
                450
        );

        // Create Digital Resource
        DigitalResource digitalResource = new DigitalResource(
                102,
                "Java E-Book",
                "James Gosling",
                5.5
        );

        // Store resources in an array
        LibraryResource[] resources = {
                book,
                digitalResource
        };

        // Create service
        LibraryService service = new LibraryService();

        // Display Book details
        System.out.println("========== BOOK DETAILS ==========");
        book.printDetails();

        System.out.println(
                "Fine for 5 overdue days: Rs. "
                + book.calculateFine(5)
        );

        System.out.println();

        // Display Digital Resource details
        System.out.println("========== DIGITAL RESOURCE DETAILS ==========");
        digitalResource.printDetails();

        System.out.println(
                "Fine for 5 overdue days: Rs. "
                + digitalResource.calculateFine(5)
        );

        System.out.println();

        // Display all resources
        service.displayResources(resources);

        // Input validation
        System.out.println("========== INPUT VALIDATION ==========");

        System.out.println(
                "Resource ID 101 valid: "
                + InputValidator.isValidResourceId(101)
        );

        System.out.println(
                "Resource ID -5 valid: "
                + InputValidator.isValidResourceId(-5)
        );

        System.out.println(
                "Fine days 5 valid: "
                + InputValidator.isValidFineDays(5)
        );

        System.out.println(
                "Fine days -2 valid: "
                + InputValidator.isValidFineDays(-2)
        );

        System.out.println(
                "Title valid: "
                + InputValidator.isValidTitle(book.getTitle())
        );

        System.out.println(
                "Author valid: "
                + InputValidator.isValidAuthor(book.getAuthor())
        );

        System.out.println(
                "Pages valid: "
                + InputValidator.isValidPages(450)
        );

        System.out.println(
                "File size valid: "
                + InputValidator.isValidFileSize(5.5)
        );

        // Calculate total fine
        int overdueDays = 5;

        double totalFine = service.calculateTotalFine(
                resources,
                overdueDays
        );

        System.out.println();

        System.out.println("========== FINE CALCULATION ==========");
        System.out.println("Overdue Days: " + overdueDays);
        System.out.println("Total Fine: Rs. " + totalFine);

        // Display total resources
        System.out.println();
        System.out.println("Total Resources: " + resources.length);
    }
}