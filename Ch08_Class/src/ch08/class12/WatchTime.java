package ch08.class12;


public class WatchTime {
	private int hour, min , sec;
	private String strHour, strMin , strSec;
	private boolean isNum = true;
	
	public WatchTime(int hour, int min, int sec) {
		this.hour =hour; //this 는 필드를 가르킨다
		this.min = min;
		this.sec =sec; 
		}
	public void viewTime() { //public void viewTime(WatchTime this)ss
		if(isNum)
			System.out.printf("[%02d:%02d:%02d]\n",  hour, min, sec);
		
	}
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		wtNum.viewTime();
		System.out.println("wtNum:"+wtNum);
		System.out.printf("wtnum:%x\n", wtNum.hashCode());
		wtNum.viewTime(); // viewTime(wtNum);
		System.out.println();
		
		WatchTime wtNum1 = new WatchTime(12, 13, 53);
		wtNum1.viewTime();
		System.out.println("wtNum1:"+wtNum1);
		System.out.printf("wtnum1:%x\n", wtNum1.hashCode());
		wtNum1.viewTime();
		
	}

}