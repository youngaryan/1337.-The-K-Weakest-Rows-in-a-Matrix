import java.util.*;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        if (k == 0)return new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
            }
            map.put(i, count);
        }


        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue());

        int[] sortedValues = new int[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            sortedValues[i] = entries.get(i).getKey();
        }
        return Arrays.copyOf(sortedValues,k);
    }
}
