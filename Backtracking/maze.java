import java.util.ArrayList;

public class maze{
    public static void main(String[] args) {
        System.out.println(path("",3, 3));
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

        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(r > 1)
        {
            left = path(p + 'D',r-1, c);
        }
        if(c > 1)
        {
            right = path(p + 'R',r, c-1);
        }

        left.addAll(right);
        return left;
    }
}