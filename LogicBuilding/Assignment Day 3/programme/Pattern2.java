/* Write a program to print the following pattern: 
* 
 ** 
 *** 
 ***** 
 ******* 
 *********/
 p
 
 ublic class Pattern4 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


