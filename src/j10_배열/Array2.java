package j10_배열;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * 배열 선언 방법
		 */

		// 지정한 크기 만큼 배열 공간 생성
		int[] numbers = new int[10];

		// 주어진 값들 만큼의 배열 공간을 생성하고 각 인덱스에 값들을 주입
		int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
		// 아래와같이 작성되지만 new int[]는 생략가능함
		int[] numbers3 = new int[] { 1, 2, 3, 4, 5, 6 }; // 배열의 공간 크기는 지정못하며 주어진 값의 크기만큼 배열이 생성됨

		for(int i = 0; i < numbers.length; i++) { // number.length > 배열의 전체 길이를 알려줌
			System.out.println(numbers[i]);			
		}
		System.out.println();
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);			
		}
		System.out.println();
		
		for(int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);			
		}
		System.out.println();
	}

}








