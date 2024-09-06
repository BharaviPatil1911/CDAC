//Snippet 15

public class Snippet15 {
    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 5.5;
        double result =  (num1 + num2);
        System.out.println(result);
    }
}



//Output = 15.5


/*public class Snippet15 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
}
 error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
assign a double value (the result of num1 + num2) to an int variable (result). 