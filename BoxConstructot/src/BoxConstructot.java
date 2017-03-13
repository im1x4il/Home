/**
 * Created by Михаил on 03.03.2017.
 */
class Box{                         ///создаем нов клас
    double wight;                  ///задаем поля класа
    double height;
    double depth;

    Box(double wight, double height, double depth){      ///создаем метод конструктор який запрашуе параметри полив
        this.wight = wight;
        this.height = height;
        this.depth = depth;                     ///this как ссилка на обект класа Вох
    }
    double Volume(){                        ///создаем метод що вираховуе добуток полив класа Вох
        return wight*height*depth;
    }
}
public class BoxConstructot {                 ///создаем головний клас програми
    public static void main(String[] args) {
        Box Box1 = new Box(10,20,30);     ///создаем новий обект класу бокс и конструктор запрашуэ параметри
        Box Box2 = new Box(20,10,11);

        double vol1 =Box1.Volume();              ///создаем зминну и присваеваем ей клас Вох з методом Volume
        System.out.println(vol1);
        double vol2 =Box2.Volume();
        System.out.println(vol2);
    }
}
