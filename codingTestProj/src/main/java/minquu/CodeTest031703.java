package minquu;

public class CodeTest031703 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};

        System.out.println("바뀌기 전 배열 \uD83D\uDC4D");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("바뀐 후 배열 \uD83D\uDC4A");
        int[] result = reverseArray(intArr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.print(" ");
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[(arr.length - 1) - i];
        }
        return resultArr;
    }
}
