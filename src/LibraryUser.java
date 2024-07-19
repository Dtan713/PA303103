// LibraryUser interface
public interface LibraryUser {
    void registerAccount();
    void requestBook();
}

// AdultUser class implementing LibraryUser interface
public class AdultUser implements LibraryUser {

    @Override
    public void registerAccount() {
        System.out.println("Adult user registered successfully");
        // Additional logic for adult user registration
    }

    @Override
    public void requestBook() {
        System.out.println("Adult user requested a Fiction category book");
        // Additional logic for borrowing Fiction category books
    }
}

// ChildUser class implementing LibraryUser interface
public class ChildUser implements LibraryUser {

    @Override
    public void registerAccount() {
        System.out.println("Child user registered successfully");
        // Additional logic for child user registration
    }

    @Override
    public void requestBook() {
        System.out.println("Child user requested a Kids category book");
        // Additional logic for borrowing Kids category books
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Example usage
        LibraryUser adultUser = new AdultUser();
        adultUser.registerAccount();
        adultUser.requestBook();

        LibraryUser childUser = new ChildUser();
        childUser.registerAccount();
        childUser.requestBook();
    }
}
