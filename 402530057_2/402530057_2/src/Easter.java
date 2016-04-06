/*
 * [C]63
 * [TA's Advise]
 * 1.���}��L�k���T����, ���խץ�����, �@��java�ɮ׸̭��u�঳�@��public class, �o�O�򥻭�h�аȥ��O�o, ���ıqC�}�l�p��
 * 2.�å�����javadoc, ��������5��.
 * 3.�p�G���{�����g��������D�ЩM�U���p�� :D, �Y�a�[�o��!
 */

class EasterTester {
	private EasterTester() {
	}

	public static String calculateEaster(int aYear) {
		int ayear = aYear, month, day;
		int a, b, c, d, e, f, g, h, i, j;
		a = ayear % 19;
		b = ayear % 4;
		c = ayear % 7;
		f = ayear / 100;//Math.floor(), -2
		g = ((13 + 8 * f) / 25);//Math.floor()
		h = (f / 4);//Math.floor()
		i = (15 - g + f - h) % 30;
		j = (4 + f - h) % 7;
		d = (19 * a + i) % 30;
		e = (2 * b + 4 * c + 6 * d + j) % 7;
		
		month = 3;
		day = 22 + d + e;

		if (d == 29 && e == 6) {
			month = 4;
			day = 19;
		}
		if (d == 28 && e == 6 && (11 * i + 11) % 30 < 19) {
			day = 18;
			month = 4;
		}
		
		//�γ\�U���ݭn�u���P�_
		if (day > 31) {
			month += 1;
			day -= 31;
		}
		
		return "In " + ayear + " , Easter Sunday is: month = " + month + " and day = " + day;
	}
}

public class Easter {
	public void main(String[] args) {
		System.out.println(EasterTester.calculateEaster(2012));
		System.out.print(EasterTester.calculateEaster(2001));
	}
}
