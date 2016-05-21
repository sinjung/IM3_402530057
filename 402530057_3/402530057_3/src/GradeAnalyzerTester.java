/*
* [A]100
* [TA's Advise]
* 1. Good!
*/

import javax.swing.JOptionPane;
public class GradeAnalyzerTester
{
	public static void main(String[] args)//主程式
	{
		
		GradeAnalyzer GA = new GradeAnalyzer();//宣告GradeAnalyzer類別的GA物件實體
		String TempInput = "";
		
		while(true)
		{
			TempInput = JOptionPane.showInputDialog(null, "請輸入成績，要跳出請輸入q" );
			if(TempInput.equalsIgnoreCase("q"))
			{
				break;
			}
			try 
			{
				GA.addGrade(Double.parseDouble(TempInput));
			}
			catch (Exception e) 
			{
                System.out.println("請輸入有效的的數字");
            }
		}
		//缺少判斷是否個數<2, -2.
		 GA.analyzeGrades();
	        System.out.println("You entered " + GA.countUserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
	        //顯示出平均和標準差
	        System.out.println("The average = " + GA.Avg + " with a standard deviation = " + GA.SD);
	        //將GradeAnalyzer中toString()內的文字顯示出來
	        System.out.println(GA);
		
	}
}