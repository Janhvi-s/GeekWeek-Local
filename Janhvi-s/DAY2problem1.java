//Amazing String problem
public class Solution {

    public static void answer(String s1, String s2, String s) {

        int[] S1 = new int[256];
        int[] S2 = new int[256];
        int[] S = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            S1[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            S2[s2.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            S[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (S[i] != S1[i] + S2[i]) {

                System.out.println("NO");

                return;
            }
        }
        System.out.println("YES");
    }

}
