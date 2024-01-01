/*Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate b2
-4ac is negative, display a message stating that there are no real solutions.*/

import java.util.Scanner;
class Quadratic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;double d,r1,r2;
		System.out.println("Enter the values of a,b,c of the quadratic equation ax^2+bx+c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==0)
			System.out.println("Invalid entry for the value of \'a\'");
		else
		{
			d=(b*b)-4*a*c;

			if(d<0)
			{
				System.out.println("No real solutions exist!");
			}
			else if(d>0)
			{
				r1=(-b+Math.sqrt(d))/(2*a);r2=(-b-Math.sqrt(d))/(2*a);
				System.out.println("Root 1 = "+r1+"\nRoot 2 = "+r2);
			}
			else
			{
				r1=-b/(2*a);
				System.out.println("Root 1 = Root 2 = "+r1);
			}
		}
	}
}