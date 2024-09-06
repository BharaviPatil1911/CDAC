/*Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9*/

public class Pattern10 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "*");
                num += 2;
            }
            System.out.println();
            num = 1;
        }
    }
}
