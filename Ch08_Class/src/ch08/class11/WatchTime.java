package ch08.class11;


public class WatchTime {
	private int hour, min , sec;
	private String strHour, strMin , strSec;
	private boolean isNum = true;
	
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this: "+this);
		this.hour =hour; //this 는 필드를 가르킨다
		this.min = min;
		this.sec =sec; 
		this.isNum=true;
	}
	public WatchTime(String strHour , String strMin , String strSec) {
		System.out.println("this: "+this);
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNum = false;
	}
	public void viewTime() {
		if(isNum)
			System.out.printf("[%02d:%02d:%02d]\n", hour,min,sec);
		else 
			System.out.printf("- %s %s %s -\n",strHour,strMin,strSec);
	}
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();
		System.out.println("wtNum:"+wtNum);
		System.out.printf("wtnum:%x\n", wtNum.hashCode());
		
		System.out.println();
		
		WatchTime wtStr = new WatchTime("열두시", "이십분","오십초");
		wtStr.viewTime();
		System.out.println("strNum:"+wtStr);
		System.out.printf("strNum:%x\n", wtStr.hashCode());
		
		
		
	}

}