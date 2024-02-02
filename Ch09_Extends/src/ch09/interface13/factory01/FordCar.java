package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar{

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("포드차 시동이 부드럽게 잘 걸린다~H.");
		Thread.sleep((long)(Math.random()*500)+500);
		
	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("포드차 시동이 부드럽게 잘 Off~H.");
		Thread.sleep((long)(Math.random()*500)+500);
	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("포드차 엑셀이 부드럽게 잘 가속된다.");
		Thread.sleep((long)(Math.random()*500)+500);
		
	}

	@Override
	public void footBreak() throws InterruptedException{
		System.out.println("포드차 브레이크가 부드럽게 잘 된다~H.");
		Thread.sleep((long)(Math.random()*500)+500);
		
	}

}
