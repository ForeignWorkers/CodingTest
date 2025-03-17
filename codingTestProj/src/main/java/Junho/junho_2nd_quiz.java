package Junho;

public class junho_2nd_quiz {
	
//	2.	문자 개수 세기
//	•	문자열과 특정 문자를 입력받아, 해당 문자의 개수를 세는 함수 작성.
//	•	입력: "banana", 'a'
//	•	출력: 3
	
	public static void main(String[] args) {
		
	}

	public static int countIndex(String str, char chr) {
		int count = 0;
		
		for(int i=0; str.length() <=i; i++) {
			if(chr == (i)) {
				count++;
			}
		}
		return count;
	}
	
}//class
