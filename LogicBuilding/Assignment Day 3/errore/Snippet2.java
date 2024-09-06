//Snippet 2

public class Snippet2 { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 

error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
The while loop condition is using a single equals sign (=) instead of a double equals sign (==). 
The single equals sign is an assignment operator and the double equals sign is a comparison operator.
So, in the while loop condition, count = 0 is assigning the value 0 to count instead of comparing count to 0. 
As a result, the condition is always false, and the loop body is never executed.

public class Snippet2 { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count != 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 

Output = 
5
4
3
2
1