public class StrBuilder{
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
// reason we use string builder for string updation is because normal string datatype is immutable.
// i.e. if we update a string, the string will copy the previous stored value and then make a new value
// due to this, the time complexity is O(n^2) and a lot of space is wasted in this process
// string builder is a mutable object and is more fficient   