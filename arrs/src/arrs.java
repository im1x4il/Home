import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Михаил on 17.02.2017.
 */
public class arrs {
    public static void main(String[] args) {

        int arrS [][] = new int[4][];
        int arrS [1] = new int[1];
        int arrS [2] = new int[2];
        int arrS [3] = new int[3];
        int i;
        int j;
        int k=0;

        for(i=0; i<4; i++)
            for(j=0; j<i+1; j++){
                arrS [i][j] = k;
                k++;
        }

        for(i=0; i<4; i++) {
            for (j=0; j<5; j++)
                System.out.print(arrS [i][j] + " ");
            System.out.println();

        }

    }
}
