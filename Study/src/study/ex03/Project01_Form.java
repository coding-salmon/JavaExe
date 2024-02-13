package study.ex03;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Project01_Form {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("회원 가입"); //프레임 제목
		frame.setSize(300,200); //프레임 사이즈 300,200
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame: 창을 나타내는 컴포넌트입니다. 제목이 "회원가입"인 창을 생성합니다.
		//setSize(300,200): 창의 크기를 가로300, 세로200으로 설정합니다.
		//setDefaultCloseOperation:창의 '닫기'버튼을 클릭하면 프로그램이 종료되도록
		//설정합니다.
		
		JPanel panel = new JPanel(new GridLayout(4,2));
		//Jpanel: 컴포넌트들을 담을 수 있는 컨테이너입니다.
		// new GridLayout(4,2):4행 2열의 그리드 레이아웃을 생성합니다.
		
		JLabel nameLabel = new JLabel("이름: ");
		// JLabel
		
		
		
		
		
		
	}

}
