import java.util.Scanner;

class que24
{
 public static void main(String args[]) 
    {
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner sc = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");
        binnum = sc.nextInt();
        binnum1=binnum;
      
      while(binnum > 0)
        {
            rem = binnum % 10;
            decnum = decnum + rem*i;
            
            i = i*2;
            binnum = binnum/10;
        }   

			i=1;
			quot = decnum;
		
        while(quot > 0)
        {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }
		
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
 System.out.print("\n");
 
    }
}