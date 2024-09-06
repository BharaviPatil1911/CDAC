//Snippet 9

public class Snippet9 { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 
Output=
0
2
4

public class Snippet9 { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i ++)//   update i++ 
 { 
 System.out.println(i); 
 } 
 } 
} 
Output = 
0
1
2
3
4