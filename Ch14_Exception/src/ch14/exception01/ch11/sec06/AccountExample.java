package ch14.exception01.ch11.sec06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.whithdraw(30000);
		}catch(InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message); //예외 처리 코드와 함께 withdraw() 메소드 호출
		}
	}

}
