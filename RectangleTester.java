public class RectangleTester
{
	
	public static void main(String[] args)
	{
		
		Rectangle Rec1 = new Rectangle(1,2,3,4);
		//建立Retangle類別的物件
		Rec1.tostring();
		//呼叫toString方法
		Rectangle Rec2 = new Rectangle(4,3,2,1);
		//建立Retangle類別的物件
		Rec2.tostring();
		//呼叫toString方法
		System.out.println();
		System.out.println("End of Output");
	}
}
class Rectangle
{
	static double height, width, Y, X;
	//宣告長寬變數
	
	
	Rectangle(double x, double y, double w, double h)
	{
		height = h;
		width = w;
		Y = y;
		X = x;
	}
	public void tostring()
	{
		System.out.println();
		
		System.out.print("java.Rectangle[x="+X);
		
		System.out.print(",y="+Y);

		System.out.print(",width="+width);
		
		System.out.println(",height="+height+"]");

		System.out.println("Area="+width*height);
	
		System.out.println("Perimeter="+(width+height)*2);
		//印出結果
	}
	
}