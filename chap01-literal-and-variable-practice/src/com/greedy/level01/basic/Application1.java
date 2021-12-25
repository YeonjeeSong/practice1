package com.greedy.level01.basic;

public class Application1 {

	public static void main(String[] args) {
		
		/* 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
		 * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 더하기 결과  : 50
		 * 빼기 결과 : -10
		 * 곱하기 결과 : 600
		 * 나누기한 몫 : 0
		 * 나누기한 나머지 : 20
		 * */
		
		int inum1 = 20;
		int inum2 = 30;
		
		/* 내가 푼 것 - 유지보수성이 떨어진다. */
//		System.out.println("inum1 + inum2 : " + (inum1 + inum2));
//		System.out.println("inum1 - inum2 : " + (inum1 - inum2));
//		System.out.println("inum1 * inum2 : " + (inum1 * inum2));
//		System.out.println("inum1 / inum2 : " + (inum1 / inum2));
//		System.out.println("inum1 % inum2 : " + (inum1 % inum2));
		
		/* 값에 의미를 부여 & 재사용 */
		int plus = inum1 + inum2;
		int minus = inum1 - inum2;
		int multi = inum1 * inum2;
		int div = inum1 / inum2;
		int mod = inum1 % inum2;
		
		System.out.println("더하기 결과 : " + plus);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + multi);
		System.out.println("나누기 한 몫 : " + div);
		System.out.println("나누기 한 나머지 : " + mod);

	}

}
