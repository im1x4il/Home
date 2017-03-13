class Kamni {
    public static void main(String[] args) {

        int a = 5, b = 6, c = 1;

        if(a>0)
            if(b>0)
                if(c>0)
                    if(a<b)
                        if(a<c)

                            System.out.println(a);
                        else
                            System.out.println(c);
                    else if(b<c)

                        System.out.println(b);

                    else  System.out.println(c);
                else // если с<0
                    if (b>a)
                        System.out.println(a);
                    else System.out.println(b);
            else // если b<0
                if (c>0)
                    if(a>c)
                        System.out.println(c);
                    else System.out.println(a);
                else System.out.println(a); // если с<0
        else // если а<0
            if(b>0)
                if(c>0)
                    if(b>c)
                        System.out.println(c);
                    else System.out.println(b);
                else // если с<0
                    System.out.println(b);
            else // если b<0
                if (c>0)
                    System.out.println(c);
                else System.out.println("исключительно отрицательные значения");
    }
}