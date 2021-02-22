class Box{
	private int length,bidth,height;
	public void setDimention(int l,int b,int h)
	{
		length = l;
		bidth = b;
		height = h;
	}
	public void showDimention()
	{
		System.out.println("the Value of l = "+length);
		System.out.println("the Value of b = "+bidth);
		System.out.println("the Value of h = "+height);
	}
}
public class Practice{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setDimention(10,20,30);
		b1.showDimention();
		b1 = new Box();
		b1.showDimention();
	}
}