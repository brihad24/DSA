public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(check(arr));
    }

    static int check(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            ans = ans ^ arr[i];
        }

        return ans;
    }
}
