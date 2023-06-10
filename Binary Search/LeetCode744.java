// Question: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class LeetCode744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }   // we do not check for mid in this as the question only requires the ceiling of letter, not the letter itself
            // therefore, we return the index of ceiling letter(same logic as ceiling in prev question)
        return letters[start % letters.length]; 
        // we apply % because start when returning an index will always be less than arr.length(since index lies inside arr)
        // but if we the element is greater than last element, we wrap around and return 0 (since start == arr.length == last index, refer to ceiling to know how start is last index)
    }
}
