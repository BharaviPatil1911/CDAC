//Snippet 25
public class Snippet25 { 
 public static void main(String[] args) { 
 int score = 85; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
/*Output = Great job!

public class Snippet25 { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 


Snippet25.java:6: error: patterns in switch statements are a preview feature and are disabled by default.
 switch(score) {
       ^
  (use --enable-preview to enable patterns in switch statements)
Snippet25.java:7: error: constant label of type int is not compatible with switch selector type double
 case 100:
      ^
Snippet25.java:10: error: constant label of type int is not compatible with switch selector type double
 case 85:
      ^
double value (score) to match integer cases (case 100 and case 85).
It can't be used with floating-point types like double.
To fix this, you can change the type of the score variable to int.

