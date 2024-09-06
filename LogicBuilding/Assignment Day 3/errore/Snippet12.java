//Snippet 12
public class Snippet12 { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 System.out.println(x); // now 'x' is  accessible here 
 } 
} 
}
Output = 
0
2
4
6
8



public class Snippet12 { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class Snippet12
  
  to print the doubled values in each iteration, move the System.out.println(x) statement inside the loop:
