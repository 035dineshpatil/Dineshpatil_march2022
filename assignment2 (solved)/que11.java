import java.util.Scanner;

class que11
{
  public static void main(String args[])
	{
      double radius, perimeter, area;
	  
	  scanner input = new Scanner(system.in);
	  System.out.println("enter the circle radius; ");
	  radius = input.nextDouble();
	  double perimeter = 2 * Math.PI * radius;
      double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
	}
}