//Snippet 19

public class Snippet19 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

/*Output = 
Cannot divide by zero

public class Snippet19{ 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
 
Runtimr error
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Snippet19.main(Snippet19.java:7)