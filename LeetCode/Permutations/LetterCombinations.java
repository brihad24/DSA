// Question: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations{
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    static List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
        {
            return List.of();
        }
        return pad("", digits);
    }

    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            // System.out.println(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; // if we take "12", then we convert '1' to 1
        int i=(digit-2)*3;
        if(digit > 7) 
        {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) 
        {
            len+=1;
        }
        ArrayList<String> ans = new ArrayList<>(); 
        for(; i < len; i++) // change to: from (digit-2)*3 to (digit-1)*3
        {
            char ch = (char)('a' + i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }

        return ans;
    }
}