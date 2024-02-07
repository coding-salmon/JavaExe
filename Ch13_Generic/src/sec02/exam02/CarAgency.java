package sec02.exam02;

public class CarAgency implements Rentable<Car>	{
	//타입 파라미터 P를 Car로 대체

	@Override
	public Car rent() {
		// TODO Auto-generated method stub
		return new Car(); //리턴 타입이 반드시 Car여야 함
	}
	

}
