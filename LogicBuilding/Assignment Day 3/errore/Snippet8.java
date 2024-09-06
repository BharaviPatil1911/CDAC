//Snippet 8

public class Snippet8 { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 


condition num > 0 is always true, and num-- decrements num in each iteration, causing it to go below 0.


public class Snippet8 { 
 public static void main(String[] args) { 
 int num = 5; //Initialise num=5
 do { 
 System.out.println(num); 
 num--; 
 } while (num >=1); //Change loop cindition num>=1
 } 
} 
Output = 
5
4
3
2
1