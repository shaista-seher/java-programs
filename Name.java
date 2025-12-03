import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            String firstThree = name.substring(0, 3);   // may throw StringIndexOutOfBoundsException
            System.out.println("First 3 characters: " + firstThree);

            int num = Integer.parseInt(firstThree);     // may throw NumberFormatException
            System.out.println("Converted Number = " + num);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters cannot be converted to a number.");
        }
    }
}
