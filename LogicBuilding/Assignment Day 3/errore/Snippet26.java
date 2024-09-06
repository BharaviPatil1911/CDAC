//Snippet26

public class Snippet26 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 6: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 

//Snippet26.java
//Snippet26.java:10: error: duplicate case label
 //case 5:/*
 //^
 
// by changing case name it will be executed and output will be= Number is 5
