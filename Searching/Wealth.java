//Question: https://leetcode.com/problems/richest-customer-wealth/

public class Wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {1,2,3}
                            };
        System.out.println(maxWealth(accounts));
                            
    }

    static int maxWealth(int[][] accounts){
        int richest = 0;
        int currSum = 0;
        for(int i=0; i<accounts.length; i++)
        {
            for(int j=0; j<accounts[i].length; j++)
            {
                currSum = currSum + accounts[i][j];
            }
            if(currSum > richest)
            {
                richest = currSum;
            }
            currSum = 0;
        }
        return richest;
    }
}
