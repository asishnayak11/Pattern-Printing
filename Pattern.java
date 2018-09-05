import java.util.Scanner;

public class Pattern 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int k=1;
		for(int i=1; i<=n; i++)
		{
			k=i;
			int p=0, l=0;
			System.out.print(k+" ");
			for(int j=2; j<=i; j++)
			{
				if(j%2==0)
				{
					k=n*(j-p)-(i-j+1);
					p++;
				}
				else
				{
					k=n*(j-l-1)+(i%j);
					l++;
				}
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
