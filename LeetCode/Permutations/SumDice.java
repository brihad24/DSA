// Question: https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/

import java.util.ArrayList;

public class SumDice {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(30, 30, 500));
    }

    static int numRollsToTarget(int n, int k, int target) {
        int count = 0;
        ArrayList<String> ans = dice("", target, k);
        for (int i = 0; i < ans.size(); i++)
        {
            if(ans.get(i).length() == n)
            {
                count++;
            }
        }
        return count;
    }

    static ArrayList<String> dice(String p, int target, int face){
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=1; i <= face && i<= target; i++)
        {
            ans.addAll(dice(p+i, target - i, face));
        }

        return ans;
    }
}
