/*
 * [C]63
 * [TA's Advise]
 * 1.打開後無法正確執行, 嘗試修正完成, 一個java檔案裡面只能有一個public class, 這是基本原則請務必記得, 等第從C開始計算
 * 2.並未產生javadoc, 此部分扣5分.
 * 3.如果對於程式撰寫有任何問題請和助教聯絡 :D, 欣榮加油啊!
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
		
		//或許下面需要優先判斷
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
