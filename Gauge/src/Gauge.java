import java.util.Scanner;

/**
 * Created by Михаил on 02.03.2017.
 */
public class Gauge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String S=s.nextLine();
        System.out.println("Количество символов: "+S.length());

        /*char first = S.charAt(0);
        char last = S.charAt(S.length()-1);
        char midl = first;
        String F=S.replace(last,first);
        String H=F.replace(midl,last);
        System.out.println(F);*/

        char chars[] = S.toCharArray();
        int last = chars.length-1;
        char midl = chars[0];
        chars[0] = chars[last];
        chars[last] = midl;
        S = new String(chars);
        System.out.println(S);

        if (S.length()%2==0) System.out.println(true);
        else System.out.println(false);
        }
    }

