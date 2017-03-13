import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Created by Михаил on 01.03.2017.
 */
public class Bit4Counter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        String bin = Integer.toString(a,2);
        Pattern pattern = Pattern.compile("1");
        Matcher matcher = pattern.matcher(bin);
        int n = 0;
        while (matcher.find()) {
            System.out.print(matcher.group());
            n++;
        }
        System.out.println("\n"+"Число единиц = " + n);
        System.out.println(bin);



    }
}
