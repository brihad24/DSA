public class Plus1{
    public static void main(String[] args) {
        int[] digits = {9};
        int[] answer = plusOne(digits);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}