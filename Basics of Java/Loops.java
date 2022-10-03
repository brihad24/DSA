public class Loops {
    public static void main(String[] args) {
        int count = 1;

        // Prefereably use when you don't know how many times to run the loop
        while(count != 5)
        {
            System.out.println(count);
            count++;
        }

        // Prefereably use when you know how many times to run the loop
        for(int i = 1; i != 5; i++)
        {
            System.out.println(i);
        }
    }
}
