// Question: https://my.newtonschool.co/playground/code/pxslvrycqtcb

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);  
        int n = sc.nextInt();  
        int[] array = new int[n];   
        for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
        System.out.print(answer(array, n));
    }

    static int answer(int[] arr, int n){
        if(n == 0){
            return 0;
        }
        int ans = 0;
        int odd = 0;
        int even = 0;
        for(int i: arr){
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(odd%2 != 0){
            ans = 1;
        }

        return ans;
    }
}
