public class Pattern132{
    public static void main(String[] args) {
        int[] digits = {3,1,4,2};
        boolean ans = find132pattern(digits);
        System.out.println(ans);
    }

    static boolean find132pattern(int[] nums) {
        int i1 = 0;
        int k3 = 0;
        int count = 0;
        for(int i = 1; i < nums.length - 1; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    i1 = nums[j];
                    count++;
                }
            }
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    k3 = nums[j];
                    count++;
                }
            }
            if(i1 < k3 && count == 2){
                return true;
            }
        }
        return false;
        }
    }