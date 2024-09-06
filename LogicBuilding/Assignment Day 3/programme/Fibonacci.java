// Write a program to print the Fibonacci sequence up to the number 21

public class Fibonacci{
public static void main(String[]args){
int n=21;
int num1=0;
int num2=1;
System.out.println("Fibonacci Series");
for (int i=1;i<=n;++i){
System.out.println(num1+ ",");
int sum=num1 + num2;
num1 = num2;
num2 = sum;
}
}
}