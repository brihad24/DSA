import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6,8};
        System.out.println(search(arr, 7, 0));
        ArrayList<Integer> indices = new ArrayList<>();
        System.out.println(searchMultiple(arr, 4, 0, indices));
        
    }

    static int search(int[] arr, int target, int i)
    {
        if(i == arr.length-1)
        {
            return -1;
        } // base condition
        if(arr[i] == target)
        {
            return i;
        }
        return search(arr, target, i+1);
    }

    static ArrayList<Integer> searchMultiple(int[] arr, int target, int i, ArrayList<Integer> indices){
        if(i == arr.length)
        {
            return indices;
        } // base condition
        if(arr[i] == target)
        {
            indices.add(i);
        }
        return searchMultiple(arr, target, i+1, indices);
    }

    static ArrayList<Integer> searchMultiple2(int[] arr, int target, int i){ // not optimal since we are creating multiple objects and extra space being is used
        ArrayList<Integer> indices = new ArrayList<>();
        if(i == arr.length)
        {
            return indices;
        } // base condition

        if(arr[i] == target) // this will contain answer for that function call only
        {
            indices.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = searchMultiple2(arr, target, i+1);
        indices.addAll(ansFromBelowCalls);
        return indices;
    }
}
