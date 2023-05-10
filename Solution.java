import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] l = new int[mat.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int power = 0;
            for (int j = 0; j < mat[i].length; j++) {
                power += mat[i][j];
            }
            map.put(i, power);
            l[i] = power;
        }

        int[] f = new int[k];
        Arrays.sort(l);
        l = Arrays.copyOf(l,k);

        for (int i = 0; i < l.length; i++) {
            for (int j = map.size()-1; j >= 0 ; j--) {
                if (l[i] == map.get(j)) {
                    f[i] = j;
                }
            }
        }

        throw new RuntimeException(Arrays.toString(l)+map+ Arrays.toString(f));


        //return l;
    }
}
