// Question = https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class MissingNos {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(MissingNum(arr));
    }

    static List<Integer> MissingNum(int[] nums){
        int i = 0;
        while(i<nums.length)
        {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                i++;
            }
        }
        // we use cyclic sort to sort the array
        // by the properties of cyclic sort, every element here will equal to index+1
        // whereever the element is not equal to index+1, that element is missing
        List<Integer> missing = new ArrayList<>();
        for(int index = 0; index<nums.length; index++)
        {
            if(nums[index] != index + 1)
            {
                missing.add(index+1);
            }
        }
        return missing;
    }

        static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
