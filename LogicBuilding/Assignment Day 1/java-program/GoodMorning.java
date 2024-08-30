Question no 4

//Write a Java program that displays a "Good Morning" message if the 
//predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic.


public class GoodMorning{
public static void main(String[] args){
int time = 11;
if (time <= 12 &&  time >= 5 ){
       System.out.println("Good Morning!");
	   }

 else
 {
       System.out.println("Good day!");
}
}

}



Output=
Good Morning!