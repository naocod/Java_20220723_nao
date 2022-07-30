package j10_배열;

import java.util.Arrays;
import java.util.List;

public class Array3 {

	/*
	 * Arrays 클래스
	 */

	public static void main(String[] args) {
		/*
		 * 1. asList()			-> 배열을 리스트로 변환
		 * 2. binarySearch()	-> 배열 안에서 찾고자하는 값의 위치를 반환
		 * 3. copyOf()			-> 기존 배열을 새로운 배열에 지정한 크기만큼 복사
		 * 4. copyOfRang()		-> 기존 배열을 원하는 인덱스 범위만큼 복사
		 * 5. fill()			-> 기존 배열을 원하는 값으로 채움
		 * 6. sort()			-> 배열을 정렬
		 * 7. equals()			-> 두 개의 배열이 서로 같은지 비교
		 */
		
		int[] numbers = { 1, 9, 7, 4, 6, 5, 3, 8, 2, 10 };
		
		printArray(numbers);
		
		//[3. copyOf()]
		int[] copyNumbers1 = Arrays.copyOf(numbers, 10); // 새로운 배열로 똑같이 복사, 뒤의 숫자만큼 복사됨, 배열보다 더 큰값을 복사할 경우 빈값이 들어가서 원하는 배열크기 만큼의 배열 생성
		int[] copyNumbers2 = numbers; // numbers의 주소를 넣은 것
		
		printArray(copyNumbers1);
		printArray(copyNumbers2);
		
		System.out.println("----------------");
		// 깊은 복사 > 아예 새로운 배열이 생성되어 연결되지 않은 배열
		copyNumbers1[0] = 100;
		printArray(numbers);
		printArray(copyNumbers1);
		
		System.out.println("----------------");
		// 얕은 복사 > 한쪽에서 바꾸면 다른 한쪽도 바뀜
		copyNumbers2[0] = 100;
		printArray(numbers);
		printArray(copyNumbers2);
		
		//[6. sort()] 정렬
		Arrays.sort(copyNumbers1);
		System.out.println("정렬");
		printArray(copyNumbers1); // 정렬된 상태로 저장

		//[2. binarySearch()] 인덱스 찾기 > 정렬한 뒤 search해야 함
		int index = Arrays.binarySearch(copyNumbers1, 5); // 반환 자료형이 int이므로 int 변수에 담을 수 있음
		System.out.println("5의 값이 있는 인덱스: " + index);
		
		//[4. copyOfRang()] 깊은 복사(범위 지정) 
		int[] copyNumbers3 = Arrays.copyOfRange(numbers, 3, 7); // 3번 인덱스부터 7번 인덱스 전까지 
		printArray(copyNumbers3);
		
		//[5. fill()] 값 초기화하고 채우기
		Arrays.fill(copyNumbers3, 10);
		printArray(copyNumbers3);
		
		//[7. equals()] 두 배열 비교
		int[] copyNumbers4 = Arrays.copyOf(numbers, 10);
		int[] copyNumbers5 = Arrays.copyOf(numbers, 10);
		Arrays.sort(copyNumbers4);
		boolean cmp = Arrays.equals(copyNumbers4, copyNumbers5);
		System.out.println(cmp); // false 정렬하여 두 배열이 같지 않음
		
		boolean cmp2 = Arrays.equals(numbers, copyNumbers5);
		System.out.println(cmp2); // true 그대로 복사하였기에 같음
		
		
		
//-------------------------------------------------------------------------------------------		
//		System.out.print("numbers: ");
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i]);
//			if(!(i == numbers.length - 1)) { // !(마지막 반복) > 마지막 반복이 아닐 경우
//				System.out.print(", "); 				
//			}
//		}
//		System.out.println(); > ptinAttay 메소드 생성
//--------------------------------------------------------------------------------------------
		
//		Arrays.sort(numbers);
//
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
	}
	
	public static void printArray(int[] arr) { // arr 매개변수
		
		System.out.print("array: ");
		
		for(int i = 0; i < arr.length; i++) { // 매개변수의 배열의 크기만큼 반복
			System.out.print(arr[i]); // i번째 인덱스 출력
			
			if(!(i == arr.length - 1)) { // !(마지막 반복) > 마지막 반복이 아닐 경우
				System.out.print(", "); // 마지막에는 ,가 들어가면 안되니까 그 전까지만 실행 				
			}
		}
		System.out.println();
		
	}

}
