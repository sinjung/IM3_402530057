/*
* [A]100
* [TA's Advise]
* 1. Good!
*/

import javax.swing.JOptionPane;
public class GradeAnalyzerTester
{
	public static void main(String[] args)//�D�{��
	{
		
		GradeAnalyzer GA = new GradeAnalyzer();//�ŧiGradeAnalyzer���O��GA�������
		String TempInput = "";
		
		while(true)
		{
			TempInput = JOptionPane.showInputDialog(null, "�п�J���Z�A�n���X�п�Jq" );
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
                System.out.println("�п�J���Ī����Ʀr");
            }
		}
		//�ʤ֧P�_�O�_�Ӽ�<2, -2.
		 GA.analyzeGrades();
	        System.out.println("You entered " + GA.countUserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
	        //��ܥX�����M�зǮt
	        System.out.println("The average = " + GA.Avg + " with a standard deviation = " + GA.SD);
	        //�NGradeAnalyzer��toString()������r��ܥX��
	        System.out.println(GA);
		
	}
}