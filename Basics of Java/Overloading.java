public class Overloading {
    public static void main(String[] args) {
        OL("overloading");
        OL(69);
        OL(5,6);
        // Overloading occurs when we have two or more functions with the same name but have different datatypes of arguments or different number of arguments
        // Since there are different args, when we pass a variable, the function is overloaded based on the type of the variable passed
    }

    static void OL(String name)
    {
        System.out.println(name);
    }

    static void OL(int num)
    {
        System.out.println(num);
    }

    static void OL(int a, int b)
    {
        System.out.println(a+b);
    }
}
