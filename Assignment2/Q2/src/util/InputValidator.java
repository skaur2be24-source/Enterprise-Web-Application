package util;

public class InputValidator {

    public static boolean isValidResourceId(int resourceId) {
        return resourceId > 0;
    }

    public static boolean isValidFineDays(int overdueDays) {
        return overdueDays >= 0;
    }

    public static boolean isValidTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    public static boolean isValidAuthor(String author) {
        return author != null && !author.trim().isEmpty();
    }

    public static boolean isValidPages(int pages) {
        return pages > 0;
    }

    public static boolean isValidFileSize(double fileSize) {
        return fileSize > 0;
    }
}