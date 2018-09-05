/*Program to enter an integer value and print a pattern like the following-
Example 1:
n=5
OUTPUT-
1
2 9
3 8 10 
4 7 12 14
5 6 12 13 15

Example 2:
n=7
OUTPUT-
1
2 13
3 12 14 
4 11 15 22
5 10 16 21 23
6  9 17 20 24 27
7  8 18 19 25 26 28
*/

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
