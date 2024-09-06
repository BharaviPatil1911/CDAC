//Snippet 22
public class Snippet22 {
    public static void displayMessage() {
        System.out.println("Message");
    }

    public static void main(String[] args) {
        displayMessage();
    }
}
/*Output = Message


public class Snippet22{ 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
error: illegal start of expression
 static void displayMessage() {
 ^
Snippet22.java:9: error: class, interface, enum, or record expected
}
^
declare a static method displayMessage() inside the main() method, which is not allowed 