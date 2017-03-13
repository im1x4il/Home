/**
 * Created by Михаил on 09.03.2017.
 */
class Pets {
    public static void main(String[] args) {
        Pet[] myPets = {
                new Dog(10,4,"Sharik",),

                new Cat(5,4,"Barsik"),

                new Parrot(4,2,"Kesha")
        };

        for (Pet p : myPets) {
            System.out.printf("'%s'\n \t.weight = %d(kg)\n \t.legs = %d(лапы) %n", p.getName(), p.getWeight() ,p.getLegs() ,p.getKind());

        }
    }
}

class Animal {
    private enum Kind {amphibia, natatorial, flying};

    private int weight;
    private int legs;

    private Animal(int weight, int legs, Kind kind  ) {
        this.weight = weight;
        this.legs = legs;

    }
    public int getWeight(){
        return weight;}

    public int getLegs(){
        return legs;}

     public String getKind(){
        return getKind();
     }

}
class Pet extends Animal {
    private String name;
    public Pet(int weight,int legs, String name, ) {
        super(weight,legs,kind);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Cat extends Pet {
    public Cat(int weight,int legs, String name, Kind kind) {
        super(weight,legs,name,kind);
    }
    public void catchMouse() {
        System.out.println("Catching mice...");
    }
}
class Dog extends Pet {
    public Dog(int weight,int legs, String name,Kind kind) {
        super(weight,legs,name,kind);
    }
    public void executeCommand(String command) {
        System.out.println("Doing '" + command + "'");
    }
}
class Parrot extends Pet {
    public Parrot(int weight,int legs, String name, Kind kind) {
        super(weight,legs, name, kind);
    }
    public void canfly() {
        System.out.println("Catching mice...");
    }
}