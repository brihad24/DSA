//Question: https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class MissingSet {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findDuplicate(nums)));
    }

    static int[] findDuplicate(int[] nums){
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
        // whereever the element is not equal to index+1, that element is duplicate
        // and the index+1 element which was supposed to be there is missing
        int[] ans = {-1,-1};
        for(int index = 0; index<nums.length; index++)
        {
            if(nums[index] != index + 1)
            {
                ans[0] = nums[index]; // duplicate number
                ans[1] = index+1; // missing number
            }
        }
        return ans;
    }

        static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
