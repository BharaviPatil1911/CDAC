//Snippet 11
public class Snippet11 { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i++; // Error: This may cause unexpected results in output 
 } 
 } 
}
Output = 
0
1
2
3
4


public class Snippet11 { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
}

Output=
0
2
4
Change the update statement to i++