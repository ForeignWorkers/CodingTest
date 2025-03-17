package minquu;

public class CodeTest031702 {
    public static void main(String[] args) {
        String findString = "banana";
        char findChar = 'a';
        System.out.println(String.format("문장 %s 의 %s 는 총 %d 개 입니다.", findString,findChar,countStrings(findString,findChar)));
    }

    public static int countStrings(String value, char findChar) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (findChar == value.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
