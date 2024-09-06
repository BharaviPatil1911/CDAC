public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
Output = 
Sum of digits: 30
