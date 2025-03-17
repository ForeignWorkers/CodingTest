package ABC;

public class CodeTest031702 {

	public static void main(String[] args) {
		String banana = "banana";
		String a = "a";
		countString(banana);
		countString(a);

	}
	public static void countString(String BB) {
		int leng = BB.length();
		System.out.println("문자열 " + BB + "의 문자 갯수는 : " + leng + "개 입니다.");
	}
	/*
	 * 2. 문자 개수 세기 • 문자열과 특정 문자를 입력받아, 해당 문자의 개수를 세는 함수 작성. • 입력: "banana", 'a' •
	 * 출력: 3
	 */
}
