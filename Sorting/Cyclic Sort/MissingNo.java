// Question = https://leetcode.com/problems/missing-number/

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(MissingNum(arr));
    }

    static int MissingNum(int[] arr){
        int i = 0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != i)
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        for(int index = 0; index<arr.length; index++)
        {
            if(arr[index] != index)
            {
                return index;
            }
        }
        return -1;
    }

        static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
