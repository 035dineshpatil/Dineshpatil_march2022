import java.util.Scanner;
class que13
{
    public static void main(String args[]) 
    {
        Double l, b, perimeter, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of rectangle:");
        w = sc.nextDouble();
        System.out.print("Enter hight of rectangle:");
        h = sc.nextDouble();
        perimeter = 2 * (w + h);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = w * h;
        System.out.println("Area of rectangle:"+area);
    }
}