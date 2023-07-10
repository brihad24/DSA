public class SkipStr {
    public static void main(String[] args) {
        System.out.println(skip("sdfappledsd","apple"));
    }

    static String skip(String unProc, String target){
        if(unProc.isEmpty())
        {
            return "";
        }
        char ch = unProc.charAt(0);
        if(unProc.startsWith(target))
        {
            return skip(unProc.substring(target.length()), target);
        }
        else
        {
            return  ch + skip(unProc.substring(1), target);
        }
    }
}
