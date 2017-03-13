/**
 * Created by Михаил on 17.02.2017.
 */

class Box1 {

    double weight;
    double hight;
    double deap;

    double volume() {
        return weight * hight * deap;
    }
    void setD(double w, double h, double d) {
        weight = w;
        hight = h;
        deap = d;
    }
}