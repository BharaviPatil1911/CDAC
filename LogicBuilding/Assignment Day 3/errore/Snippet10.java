//Snippet 10

public class Snippet10 { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 


: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
 
 public class Snippet10 { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num > 0) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 

Output =
10
9
8
7
6
5
4
3
2
1