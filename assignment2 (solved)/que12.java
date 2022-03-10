import java.util.Scanner;
 
class que12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
   
		System.out.print("Input first number: ");
		double num1 = in.nextDouble();
   
		System.out.print("Input second number: ");
		double num2 = in.nextDouble();
   
		System.out.print("Input third number: ");
		double num3 = in.nextDouble();
   
		System.out.println("Average of three numbers is: " +(num1 + num2 + num3) / 3);
	}
}