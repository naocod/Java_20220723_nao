package j10_배열;

public class Array1 {

	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "이창엽";
		String name3 = "강주현";
		
		/////////////////////////////////////////////////
		
		String[] names = new String[5]; // 문자열을 받을 수 있는 공간 5개를 만듬
		// 0 / 1 / 2 / 3 / 4
		names[0] = "김준일"; // 변수명을 바꿀 수 없으며 인덱스 번호가 바뀜
		names[1] = "이창엽";
		names[2] = "강주현";
		
		for(int i = 0; i < 5; i++) {
			System.out.println("이름: " + names[i]); // 인데스가 변수처럼 사용됨
		}
		

	}

}
