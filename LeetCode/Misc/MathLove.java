import java.util.*;

public class MathLove {
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int total_times = sc.nextInt();
	    for(int i = 0; i < total_times; i++){
	        int n = sc.nextInt();
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        int ans = count(n,a,b,c);
	        System.out.println(ans);
	    }
    }
    
    static int count(int n, int a, int b, int c){
        int count = 0;
        for(int i = n; i > 0; i--){
            if((i%a == 0) || (i%b == 0) || (i%c == 0)){
                count++;
            }
        }
		return count;
    }
}
