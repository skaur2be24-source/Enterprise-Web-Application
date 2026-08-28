package service;

import library.model.LibraryResource;
import library.model.Printable;
import util.InputValidator;

public class LibraryService {

    public void displayResources(LibraryResource[] resources) {

        System.out.println("======== LIBRARY RESOURCES ========");

        for (LibraryResource resource : resources) {

            if (resource instanceof Printable) {

                Printable printable = (Printable) resource;

                printable.printDetails();

                System.out.println();
            }
        }
    }

    public double calculateTotalFine(
            LibraryResource[] resources,
            int overdueDays) {

        if (!InputValidator.isValidFineDays(overdueDays)) {
            System.out.println("Invalid overdue days.");
            return 0;
        }

        double totalFine = 0;

        for (LibraryResource resource : resources) {
            totalFine += resource.calculateFine(overdueDays);
        }

        return totalFine;
    }
}