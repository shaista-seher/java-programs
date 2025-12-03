public class Error1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Math error occurred.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        }
    }
}
