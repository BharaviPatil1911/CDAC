//Snippet 13

public class Snippet13 {
    public static void main(String[] args) {
        String str = "Hello";
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null");
        }
    }
}
/*Output = 0





public class Snippet13 { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
}
Runtime error=
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        at Snippet13.main(Snippet13.java:6
		
trying to call the length() method on a null object reference (str).
