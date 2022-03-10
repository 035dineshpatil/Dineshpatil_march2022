import java.util.Scanner;

class que21
{
  public static void main(String args[])
    {
        int dec, rem, quot, i=1, j;
        int oct[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number: ");
        dec = scan.nextInt();
		
        quot = dec;
		
        while(quot != 0)
        {
            oct[i++] = quot%8;
            quot = quot/8;
        }
		
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(oct[j]);
        }
		System.out.print("\n");
    }
}