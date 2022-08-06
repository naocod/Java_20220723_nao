package j15_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor		// 기본생성자
@AllArgsConstructor		// 전체생성자
//@Getter				// Getter
//@Setter				// Setter
//@EqualsAndHashCode	// Equals와 HashCode
//@ToString				// ToString
@Data					// Getter, Setter, EqualsAndHashCode, ToString을 전부 포함하는 어노테이션
public class Student {
	
	private int studentCode;
	private String studentName;
	private int studentYear;
	private String studentAddress;
	private String studentPhone;
	
	

}
