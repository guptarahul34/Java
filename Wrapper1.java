import java.util.Scanner;

class Wrapper1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.next();
		System.out.println("Enter Second String ");
		String s2 = sc.next();
		int xyz = Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(xyz);
	}
}