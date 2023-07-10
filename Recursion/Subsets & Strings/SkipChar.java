public class SkipChar{
    public static void main(String[] args) {
        System.out.println(skip("baccdah", 'a'));
    }

    static String skip(String unProc, char target){
        if(unProc.isEmpty())
        {
            return "";
        }
        char ch = unProc.charAt(0);
        if(ch == target)
        {
            return skip(unProc.substring(1), target);
        }
        else
        {
            return ch + skip(unProc.substring(1), target);
        }
    }
}