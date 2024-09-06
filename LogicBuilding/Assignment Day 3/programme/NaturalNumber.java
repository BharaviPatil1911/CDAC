//1. Write a program to calculate the sum of the first 50 natural numbers. 


public class NaturalNumber{
public static void main(String[] args){
int N = 50;
int sum = 0;
System.out.println("Finding the sum of" + N + "natural numbers");
for(int i=1;i<=N;i++){
sum+=i;
}
System.out.println("Finding the sum of" + N + "natural numbers =" + sum); 
}
}