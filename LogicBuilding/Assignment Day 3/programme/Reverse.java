//Write a program to reverse the digits of the number 1234. The output should be 4321. 

public class Reverse{
public static void main(String[]args){
int num = 1234;
 int reverse = 0;
for (;num !=0; num=num/10)
{
int remainder = num%10;
reverse = reverse * 10 + remainder;
}
System.out.println("The reverse of the given number is:" + reverse);
}
}