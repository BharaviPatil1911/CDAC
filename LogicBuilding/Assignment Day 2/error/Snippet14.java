//Snippet 14

public class Snippet14 {
    public static void main(String[] args) {
        String str = "123.45";
        double num = Double.parseDouble(str);
        System.out.println(num);
    }
}

//Output = 123.45



/*public class Snippet14 { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} 
error: incompatible types: String cannot be converted to double
 double num = "Hello";
              ^
assign a string value ("Hello") to a double variable (num) it is not p[ossible.