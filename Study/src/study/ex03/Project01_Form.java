package study.ex03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Member;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Project01_Form {
	
	public static void main(String[] args) {
		
//		FileWriter fw = new FileWriter("D:\\\\Lecture\\\\JavaExe\\\\Study\\\\src\\\\study\\\\ex03\\\\members.txt");
//		File file = new File("D:\\Lecture\\JavaExe\\Study\\src\\study\\ex03\\members.txt");
//		FileWriter fw = new FileWriter(file, true)
				
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
		// JLabel: 텍스트 라벨을 표시합니다.
		JTextField nameField = new JTextField();
		//JTextField: 사용자가 텍스트를 입력할 수 있는 필드를 생성합니다.
		
		JLabel idLabel = new JLabel("아이디: ");
		JTextField idField = new JTextField();
		
		JLabel passwordLabel = new JLabel("비밀번호: ");
		JPasswordField passwordField = new JPasswordField();
		// JPasswordField: 비밀번호를 입력 받을 때 사용되는 필드입니다. 입력 내용이 *로 
		//가려져 보입니다. 
		
		JButton registerButton = new JButton("가입하기");
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Member member = new Member(nameField.getText(), idField.getText(),
new String(passwordField.getPassword()));
				saveMemberToFile(member);
				JOptionPane.showMessageDialog(frame, "가입 완료!");
				}
		});
		//JButto: 클릭 가능한 버튼을 생성합니다.
		//addActionListener: 버튼 클릭 시 수행할 동작을 정의합니다. 사용자가입력한
		//정보를 가져와 파일에 저장하고 "가입 완료!"라는 메시지를 표시합니다. 
		
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(idLabel);
		panel.add(idField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(new JLabel());
		panel.add(registerButton);
		
		frame.add(panel);
		frame.setVisible(true);
		//마지막을 frame.setVisible(ture);를 통해 프레임(창)을 화면에 표시합니다.
	}
		private static void saveMemberToFile(Member member) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(
					"members.txt", true))){
				
				bw.write(member.toString());
				bw.newLine();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			//BufferedWriter: 텍스트 파일에 문자를 쓰기 위한 클래스입니다.
			//FileWriter("members.txt", true):members.txt 파일에 쓰기를 위한
			//객체를 생성합니다. true 옵션을 파일 끝에 추가(append) 하는 모드를 나타냅니다.
			//bw.write():파일에 문자열을 씁니다
			//bw.newLine(): 새 줄을 추가합니다.
		}
		
		static class Member{
			//회원의 정보(이름, 아이디, 비밀번호)를 저장하는 클래스입니다.
			private String name;
			private String id;
			private String password;
			
			public Member(String name, String id, String password) {
				this.name = name;
				this.id = id;
				this.password = password;
			}
			
			@Override
			public String toString() {
				return "이름:" + name+ ", 아이디: "+id+", 비밀번호: "+password; 
				
			}
		}
	
		
		
		
		
		
		
		
	}


