/*
 * [A]96
 * [TA's advise]
 * 1.�{���S������Ӥj���D,Good Job!
 * 2.�S����@getWidth(),getHeight(), �o������2��.
 * 3.�S��override toString(), �o������2��.
 * */

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle Rec1 = new Rectangle(1, 2, 3, 4);
		// �إ�Retangle���O������
		Rec1.tostring();
		// �I�stoString��k
		Rectangle Rec2 = new Rectangle(4, 3, 2, 1);
		// �إ�Retangle���O������
		Rec2.tostring();
		// �I�stoString��k
		System.out.println();
		System.out.println("End of Output");
	}
}

class Rectangle {
	// �ϥ�static�|���A���ܼƥu���@��, �o�˦��S�������u���I?
	static double height, width, Y, X;

	// �ŧi���e�ܼ�
	// Rectangle(){this(-1,-1,-1,-1);}//�[�J�o������l��,�i�H���A���{���󧹾�.
	Rectangle(double x, double y, double w, double h) {
		height = h;
		width = w;
		Y = y;
		X = x;
	}

	//�Шϥ�Override
	//public String toString(){return ...;}
	public void tostring() {
		System.out.println();

		System.out.print("java.Rectangle[x=" + X);

		System.out.print(",y=" + Y);

		System.out.print(",width=" + width);

		System.out.println(",height=" + height + "]");

		System.out.println("Area=" + width * height);

		System.out.println("Perimeter=" + (width + height) * 2);
		// �L�X���G
	}

}