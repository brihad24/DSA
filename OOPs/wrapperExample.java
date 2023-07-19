public class wrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        final int bonus = 2; // when we add 'final' to a variable, it cannot be further modified
        // bonus = 3;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
