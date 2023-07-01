//Question link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }

    static int digits(int num) {
        if (num < 0) 
        {
            num = num * -1;
        }
        return (int)(Math. log10(num)) + 1;
    }

    static int findNumber(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            int temp = arr[i];

            if(digits(temp) % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}
