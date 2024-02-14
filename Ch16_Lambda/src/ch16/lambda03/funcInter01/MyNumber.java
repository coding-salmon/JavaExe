package ch16.lambda03.funcInter01;

@FunctionalInterface
public interface MyNumber {

	int getMax(int num1, int num2);
// 추상메서드를 1개 초과하면 에러가 발생한다.
// 함수형 인터페이스는 반드시 추상 메서드가 1개여야만 한다.

}