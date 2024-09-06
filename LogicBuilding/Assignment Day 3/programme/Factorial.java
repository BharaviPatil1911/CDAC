//Write a program to compute the factorial of the number 10. 

public class Factorial{
public static void main(String[]args){
int num = 10;
int factorial = 1;
for(int i=1;i<=num;++i)
{
factorial*=i;
}
System.out.println("Factorial of 10 is:" +factorial);
}
}

