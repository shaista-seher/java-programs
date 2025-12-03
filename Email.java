import java.util.Scanner;

// Custom Exception Class
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class Email {

    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid Email! '@' symbol missing.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Valid Email!");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
