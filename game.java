package lab12;

import java.util.Scanner; 
public class game
{
     public static void main(String args[])
{
    	try 
{

    		Scanner input=new Scanner(System.in);

    		System.out.println("Input 1: ");
    		float numl=input.nextFloat();
    		System.out.println("Input 2: ");

    		float num2=input.nextFloat();

    		int inpl=(int)numl; int inp2=(int)num2;

    		System.out.println("The Answer is "+inpl/inp2);

}

catch (ArithmeticException e) {

System.out.println("Number can't be divided by "); }

catch (Exception ex)

{
	System.out.println("Invalid Input");
}
}
}

	
