//Snippet 12

public class Snippet12 { 
 public static void main(String[] args) { 
 int count = 0;
 while (count<4) { 
 System.out.println("Loop iteration:"+ count);
count++; 
 } 
 } 
}

/*output=Loop iteration:0
Loop iteration:1
Loop iteration:2
Loop iteration:3

public class Snippet12 { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}
 Output = 
 Infinite Loop
add a counter variable and a condition to break out of the loop.