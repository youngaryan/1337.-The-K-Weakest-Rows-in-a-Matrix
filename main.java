import java.util.Arrays;

public class main {
    //[[1,1,0,0,0],[1,1,1,1,0],[1,0,0,0,0],[1,1,0,0,0],[1,1,1,1,1]]
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] x = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(s.kWeakestRows(x, 3)));

    }


}
