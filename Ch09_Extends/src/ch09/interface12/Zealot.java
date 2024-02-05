package ch09.interface12;

public class Zealot implements StarUnit{

	@Override
	public void walk() {
		System.out.println("뚜벅뚜벅**");
		
	}

	@Override
	public void attack() {
		System.out.println("휙휙**");
		
	}

	@Override
	public void die() {
		System.out.println("포아둔**");
		
	}

}
