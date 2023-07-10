import java.util.ArrayList;

public class AllSubsequence{
    public static void main(String[] args) {
        System.out.println(subseq2("", "abc"));
    }  

    static void subseq(String p, String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>(); // returns elements in only a particular recursion call
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // left and right store the elements returned by the local arraylist
        ArrayList<String> left = subseq2(p + ch, up.substring(1)); 
        ArrayList<String> right = subseq2(p, up.substring(1));

        left.addAll(right); // adds all the elements from left into right to store everything in 1 arraylist
        return left;
    }
}