package j17_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Generic1<T> { // Main에서 String을 입력하였기에 data의 자료형이 String이 됨
	private int code;
	private T data;

}
