//Question 3: Calculator 
//Write a program that acts as a simple calculator. It should accept two numbers and an operator 
//(+, -, *, /) as input. Use a switch statement to perform the appropriate operation Use nested if 
//else to check if division by zero is attempted and display an error message.

class Calculator{
public static void main(String[] args){
int a = 20;
int b = 40;
String Operation = "Addition";
switch(Operation)
{
 case"Addition":
             System.out.println("Addition is:"+(a+b));
break;
 case"Multiplication":
             System.out.println("Multiplication is:"+(a*b));
break;
 case"Substraction":
             System.out.println("Substraction is:"+(a-b));
break;
 case"Division":
 if (b==0){
            System.out.println("Error: Division by zero not allowed");
}
else
{
             System.out.println("Division is:"+(a/b));
}
break;
default:
{
              System.out.println("Invalid Operation");
}
break;
}
}
}

