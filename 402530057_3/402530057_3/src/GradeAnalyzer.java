import java.util.ArrayList;

class MyCount 
{ 
    String name;
    int cnt;
    MyCount(String _name, int _cnt){ 
        this.name = _name;
        this.cnt = _cnt;
        
    }
}  
    public class GradeAnalyzer

{
	double total = 0,SD = 0, Avg = 0,SDtemp=0;
	
	int countUserInput = 0;
	ArrayList<Double> score = new ArrayList<Double>();
    MyCount[] GradeDistri = new MyCount[11]; //陣列[0]~[10]
    boolean FirstTime = true;
    
    static boolean isValidGrade(double aGrade){
        if (aGrade <= 110 && aGrade >= 0)
            return true; 
        return false; 
    }
	
    void addGrade(double aGrade){ 
	//Good, +2.
        if (FirstTime) 
        { 
            GradeDistri[0] = new MyCount("A+", 0);
            GradeDistri[1] = new MyCount("A", 0);
            GradeDistri[2] = new MyCount("A-", 0);
            GradeDistri[3] = new MyCount("B+", 0);
            GradeDistri[4] = new MyCount("B", 0);
            GradeDistri[5] = new MyCount("B-", 0);
            GradeDistri[6] = new MyCount("C+", 0);
            GradeDistri[7] = new MyCount("C", 0);
            GradeDistri[8] = new MyCount("C-", 0);
            GradeDistri[9] = new MyCount("D", 0);
            GradeDistri[10] = new MyCount("F", 0);
            FirstTime = false;
        }
            if(isValidGrade(aGrade))
            {
                return;
            }
            score.add(aGrade);
            total+= aGrade;
            countUserInput++;
         
        if (aGrade > 90){ 
            if (aGrade >= 98)
                GradeDistri[0].cnt++;
            else if (aGrade >=92)
                GradeDistri[1].cnt++;
            else
                GradeDistri[2].cnt++;
        }else if (aGrade > 80){ 
            if (aGrade >= 88)
                GradeDistri[3].cnt++;
            else if (aGrade >= 82)
                GradeDistri[4].cnt++;
            else
                GradeDistri[5].cnt++;            
        }else if (aGrade > 70){  
            if (aGrade >=78)
                GradeDistri[6].cnt++;
            else if (aGrade >=72)
                GradeDistri[7].cnt++;
            else
                GradeDistri[8].cnt++;
        }else{
            if (aGrade >= 60) 
                GradeDistri[9].cnt++;
            else  
                GradeDistri[10].cnt++;
        }
    }
    void analyzeGrades(){
        Avg = total / countUserInput;  //計算平均
        for (int i = 0; i < score.size(); i++){
            SDtemp += (score.get(i) - Avg) * (score.get(i) - Avg);//計算標準差
        }  
        SD = Math.round((Math.sqrt(SDtemp / countUserInput)));  //使用四捨五入法
    }
        
    
	
	
	String tostring()
	{
		 String rlt = "";
	        for (int i = 0 ; i < GradeDistri.length ; i++){
	            rlt += GradeDistri[i] + "\n";
	        }
	        return "The grade distribution is:\n\n" + rlt;
	}

}

