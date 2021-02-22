import java.util.Scanner;
class Sum
{
	private int a,b;
	public void getdata(int x,int y)
	{
		a = x;
		b = y;
	}
	public int showData()
	{
		//System.out.println(a+b);
		return (a+b);
	}
}
public class Add
{
	public static void main(String args[])
	{
		Sum s1 = new Sum();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a = ");
		a = sc.nextInt();
		System.out.println("Enter the Value of b = ");
		b = sc.nextInt();
		s1.getdata(a,b);
		int z = s1.showData();
		System.out.println("The Sum Of Two Number Is = "+z);
	}
}