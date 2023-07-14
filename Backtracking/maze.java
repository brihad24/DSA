import java.util.ArrayList;

public class maze{
    public static void main(String[] args) {
        System.out.println(pathDiagonal("",3, 3));
    }

    static int count(int r, int c){
        if(r == 1 || c == 1)
        {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static ArrayList<String> path(String p, int r, int c){
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>(); // returns elements in only a particular recursion call
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        // ArrayList<String> right = new ArrayList<>();
        if(r > 1)
        {
            ans.addAll(path(p + 'D',r-1, c));
        }
        if(c > 1)
        {
            ans.addAll(path(p + 'R',r, c-1));
        }

        return ans;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c){
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>(); // returns elements in only a particular recursion call
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r > 1)
        {
            ans.addAll(pathDiagonal(p + 'V', r-1, c)); // vertical traversal
        }
        if(c > 1)
        {
            ans.addAll(pathDiagonal(p + 'H', r, c-1)); // horizontal traversal
        }
        if(r > 1 && c > 1)
        {
            ans.addAll(pathDiagonal(p + 'D', r-1, c-1)); // diagonal traversal
        }

        return ans;
    }
}