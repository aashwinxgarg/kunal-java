import java.util.ArrayList;

public class lc1499 {
    public static void main(String[] args) {
        int points[][] = new int[2][];
        int k=200000000;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<points.length;i++) {
            for(int j=i+1;j<points.length;j++) {
                int ximxj = points[i][0]-points[j][0];
                if(ximxj<0) {
                    ximxj*=-1;
                }
                if(ximxj<=k) {
                    list.add(ximxj+points[i][1]+points[j][1]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>max) {
                max=list.get(i);
            }
        }
        System.out.println(list);
        System.out.println(max);
    }
}