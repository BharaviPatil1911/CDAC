//Snippet 1

public class Snippet1 { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 

Output =
Infinite Loop
In the for loop, the initial value of i is 0, and the condition is i < 10. 
However, in the update statement, you're decrementing i using i--. 
This means that i will never reach 10, and the condition i < 10 will always be true.
As a result, the loop will run infinitely.


public class InfiniteForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // Change i-- to i++
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
5
6
7
8
9
