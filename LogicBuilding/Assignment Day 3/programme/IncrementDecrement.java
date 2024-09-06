//Write a Java program to demonstrate the use of both pre-increment and post-decrement 
//operators in a single expression 

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int result = ++x - y--; // Pre-increment x, post-decrement y
        System.out.println("Result: " + result);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

Output = 
Result: 3
x: 6
y: 2

