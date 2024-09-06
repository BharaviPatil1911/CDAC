//Snippet 11

public class Snippet11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 
//Output = 2

/*public class Snippet11 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 
Runtime error
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Snippet11.main(Snippet11.java:6)
trying to access an index of the array that doesn't exist. 