public class AsciiSubSeq {
    public static void main(String[] args) {
        ascii("", "abc");
    }

    static void ascii(String p, String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        ascii(p + ch, up.substring(1));
        ascii(p, up.substring(1));
        ascii(p + (ch+0), up.substring(1));
    }
}
