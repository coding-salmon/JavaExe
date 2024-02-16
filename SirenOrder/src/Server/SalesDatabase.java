package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SalesDatabase {
	private Connection connection;
	
	//데이터베이스 연결 메소드
	public void connect() {
		try {
			//JDBC 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//데이터베이스 연결 정보 설정
			String url ="jdbc:oracle:thin:@localhost:1521:XE";
			String username ="##salmon";
			String password ="1234";
			
			//데이터베이스 연결
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("데이터베이스 연결 성공!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if(connection !=null && !connection.isClosed()) {
				connection.close();
				System.out.println("데이터베이스 연결 종료");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
