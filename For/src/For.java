import java.util.Scanner;
/**
 * Created by Михаил on 18.02.2017.
 */
public class For {
    public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);
            int i = s.nextInt();
            int g = s.nextInt();
            int sum = 0;
            if (i >= g) {
                for ( ; i >= g; i--) {
                    System.out.print(i + " ");
                   // if (i%3 == 0)
                        sum = sum +i;

                }
            } else {
                for ( ; i <= g; i++) {
                    System.out.print(i + " ");
                    //if (i%3 == 0)
                        sum = sum +i;
                }
            }
            System.out.println("\n"+sum);
        }
    }
