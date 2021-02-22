import java.util.Scanner;

public class Cons
{
	int a,b;
	public Cons(int x,int y)
		{
			a = x;
			b = y;
			System.out.println(a+b);
		}
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int a,b;
		System.out.println("Enter The Value Of A = ");
		a = sc.nextInt();
		System.out.println("Enter The Value Of B = ");
		b = sc.nextInt();
		Cons cs = new Cons(a,b);
	}
}