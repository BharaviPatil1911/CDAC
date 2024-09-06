//Snippet 10

public class Snippet10 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 Snippet10 obj = new Snippet10();
        obj.display();
        obj.display(5);

 } 
} 

/*Output =
 No parameters
 With parameters: Num



/*public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 


/*error: non-static method display() cannot be referenced from a static context
 display();
 ^
Snippet10.java:12: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
 //display() methods are instance method and they are called from the ststic main() method without creating an instance of class.