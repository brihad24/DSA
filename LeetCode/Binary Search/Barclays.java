import java.io.*;
import java.util.*;

public class Barclays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String S1 = br.readLine();
            String S2 = br.readLine();
            String out = solve(S1, S2);
            wr.println(out);
        }
        wr.close();
        br.close();
    }

    static String solve(String S1, String S2) {
        int L1 = S1.length();
        int L2 = S2.length();
        char[] result = new char[L1 + L2 - 1];

        for (int i = 0; i < L2; i++) {
            if (S2.charAt(i) == 'T') {
                for (int j = 0; j < L1; j++) {
                    result[i + j] = S1.charAt(j);
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = 'A';
            }
        }

        String finalResult = new String(result);

        if (!isValid(S1, S2, finalResult)) {
            return "-1";
        }

        return finalResult;
    }

    static boolean isValid(String S1, String S2, String result) {
        int L1 = S1.length();
        int L2 = S2.length();
        for (int i = 0; i < L2; i++) {
            if (S2.charAt(i) == 'T') {
                if (!result.substring(i, i + L1).equals(S1)) {
                    return false;
                }
            }
        }
        return true;
    }
}