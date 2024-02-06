package ch11_string;

import java.math.BigInteger;

public class PerfomanceEx {
	public static void main(String[] args) {
		
		BigInteger result = new BigInteger("1");
				BigInteger sum = new BigInteger("0");
				BigInteger Two = new BigInteger("2");
		long cnt =0;
	//	long result = 1;
	//	long sum =0;
		
		for(int i =0; i<128;i++) {
			result = BigInteger.valueOf(1);
			for(int j=0;j<cnt;j++) {
				result.multiply(BigInteger.TWO);
			}
			sum = sum.add(result);
			cnt++;
		}
		System.out.println("트리 최대 32 검색할 수 있는"
				+ "최대 노드의 수는"
				+ sum + "입니다.\n");
	}

}
