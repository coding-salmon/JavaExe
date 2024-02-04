package ch09.Resolve16;


public class BaseBallMain {
	public static void main(String[] args) {
		BaseBall bbm = new BaseBall();
	
		
		while(true) {
		int sel = bbm.viewMenu();
		if (sel==1) {
		bbm.baseBallGame();
		DecisionBall db = new DecisionBall();
		db.randomNum();
		}else if(sel==2) {
			System.out.println("게임을 종료합니다.");
			break;
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		}
	}
	
		

}
