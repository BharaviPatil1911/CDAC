//Snippet 23
public class Snippet23 { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 break;
 default: 
 System.out.println("Default case"); 
 } 
 } 
}
/*Output=
Value is 2
Value is 3

public class Snippet23 { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
default: 
 System.out.println("Default case"); 
 } 
 } 
}
Output=
Value is 2
Value is 3
Default case
by using break statement we can prevent from printing Default case.