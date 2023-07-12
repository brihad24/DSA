import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(perm2("", "abc"));
    }  

    static void perm(String p, String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i  = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            perm(f + ch + s, up.substring(1));
        }
        // perm(p + ch, up.substring(1));
        // perm(p, up.substring(1));
    }

    static ArrayList<String> perm2(String p, String up){
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>(); // returns elements in only a particular recursion call
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>(); 
        for(int i  = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            // left and right store the elements returned by the local arraylist
            ans.addAll(perm2(f+ch+s, up.substring(1)));
        }
        return ans;
    }
}
