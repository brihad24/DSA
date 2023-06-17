// Question: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(nums));
    }

    static List<Integer> findDuplicate(int[] nums){
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
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index<nums.length; index++)
        {
            if(nums[index] != index + 1)
            {
                ans.add(nums[index]);
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
