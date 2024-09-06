//Snippet 4 

public class Snippet4 { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 10; i++) { 
 System.out.println(i); 
 } 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
} 


Output=
1
2
3
4
5
6
7
8
9
10


public class Snippet4 { 
 public static void main(String[] args) { 
 for (int i = 1; i < 10; i++) { 
 System.out.println(i); 
 } 
 }
 }
 
 Output = 
1
2
3
4
5
6
7
8
9

 