public class SearchStrings {
    public static void main(String[] args) {
        String name = "Brihad";
        char target = 'h';
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target){
        if(str.isEmpty())
        {
            return false;
        }
        for(char ch : str.toCharArray())
        {
            if(target == ch) 
            {
                return true;
            }
        }
        return false;
    }
}
