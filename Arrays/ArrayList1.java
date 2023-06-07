import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5); // functions like a list in Python

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        list.remove(2); //removes element at 2 index
        list.get(0); // retrieves item at index 0

        // Multi-dimensional arraylist
        ArrayList<ArrayList<Integer>> MDlist = new ArrayList<>();

        for(int i = 0; i< 3; i++)
        {
            MDlist.add(new ArrayList<>());
        }

        System.out.println("Enter numbers for Multi-Dimensional Array");
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                MDlist.get(i).add(sc.nextInt());
            }
        }
        System.out.println(MDlist);
        sc.close();
    }
}