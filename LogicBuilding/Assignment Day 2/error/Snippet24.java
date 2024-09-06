//Snippet 24

public class Snippet24 {
    public static void main(String[] args) {
        int level = 1;
        switch(level) {
            case 1:
                System.out.println("Level 1");
                break;
            case 2:
                System.out.println("Level 2");
                break;
            case 3:
                System.out.println("Level 3");
                break;
            default:
                System.out.println("Unknown level");
        }
    }
}

/*Output = Level 1

public class Snippet24 { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 

Output=
Level 1
Level 2
Level 3
Unknown level
here is that the switch statement is missing break statements after each case.
So, in this case, when level is 1, it matches the first case and prints "Level 1", but then it continues executing the next cases and prints "Level 2", "Level 3", and "Unknown level" as well.

