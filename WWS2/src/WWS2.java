/**
 * Created by Михаил on 03.03.2017.
 */
public class WWS2 {
    public static void main(String[] args) {
        String S = "word+1word+2word3+";
        System.out.println(S.length());
        //первую треть строки разместить на месте третьей, вторую треть – на месте первой, третью треть на месте второй;
        System.out.println(S.substring(6, 12)+S.substring(12)  + S.substring(0,6));
        //первую треть слова разместить на месте второй.
        System.out.println(S.substring(6, 12)+ S.substring(0,6)+S.substring(12));
    }
}
