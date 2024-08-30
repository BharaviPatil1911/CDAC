Question no 7

//Write a Java program that finds and prints the largest of three predefined 
//numbers using if-else statements. 


public class LargestNumber{
public static void main(String[] args){
int N1 = 20;
int N2 = 40;
int N3 = 60;

if(N1>N2)
       System.out.println(N1+"is the largest number!");
else 
if(N2>N3)
      System.out.println(N2+"is the largest number!");
      else
if(N3>N1)
      System.out.println(N3+"is the largest number!");
}
}

output-
60is the largest number!