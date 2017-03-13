/**
 * Created by Михаил on 17.02.2017.
 */

class DemoBox1 {
    public static void main(String[] args) {

        Box1 box1 = new Box1();
        Box1 box2 = new Box1();
        double vol;

        box1.setD(1, 3, 4);
        box2.setD(2, 3, 1);

        vol = box1.volume();
        System.out.println(vol);

        vol = box2.volume();
        System.out.println(vol);

    }
}
