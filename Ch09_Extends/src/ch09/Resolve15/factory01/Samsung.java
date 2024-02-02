package ch09.Resolve15.factory01;

import ch09.Resolve15.ITablet;

public class Samsung implements ITablet {
	
	@Override
	public void movie() throws InterruptedException {
		System.out.println("삼성태블릿 영화 잘나옵니다.");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void music() throws InterruptedException {
		System.out.println("삼성태블릿 노래 잘나옵니다.");
		Thread.sleep((long)(Math.random()*500)+500);
		
	}

	@Override
	public void readBook() throws InterruptedException {
		System.out.println("삼성태블릿 책읽기 잘됩니다.");
		Thread.sleep((long)(Math.random()*500)+500);
		
	}


}
