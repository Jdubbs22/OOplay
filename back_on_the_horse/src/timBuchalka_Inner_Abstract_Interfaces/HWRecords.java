package timBuchalka_Inner_Abstract_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class HWRecords implements ISaveable3 {
	
	int HWNum;
	String grade;
	
	

	public HWRecords(int hWNum, String grade) {
		super();
		HWNum = hWNum;
		this.grade = grade;
	}//end constructor
	

	public int getHWNum() {
		return HWNum;
	}//end getter



	public String getGrade() {
		return grade.toUpperCase();
	}//end getter



	@Override
	public List<String> write() {
		List<String> hw = new ArrayList<String>();
		hw.add(0, ""+this.HWNum);  //"" allows you to treat a non string as a string
		hw.add(1, ""+this.grade);
		return hw;
	}//end method

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
            this.HWNum = Integer.parseInt(savedValues.get(0));
            this.grade = savedValues.get(1);
            		
		}//end if
	}//end method


	@Override
	public String toString() {
		return "HWRecords [HWNum=" + HWNum + ", grade=" + grade + "]";
	}
	
	

}//end class
