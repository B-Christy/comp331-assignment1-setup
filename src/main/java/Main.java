
public class Main {

    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("The sum is: " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // add a method to multiply two numbers
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}

// add a method to multiply two numbers
