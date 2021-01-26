/*
Exercise 12: (3) Modify Exercise 9 so that it demonstrates the order of initialization of
the base classes and derived classes. Now add member objects to both the base and derived
classes and show the order in which their initialization occurs during construction.

Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,
etc. In the base class, provide methods that are common to all Rodents, and override these
in the derived classes to perform different behaviors depending on the specific type of
Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call
your base-class methods to see what happens.

 */
public class Runner {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[2];
        rodent[0] = new Mouse();
        System.out.println("___________");
        rodent[1] = new Hamster();
        rodent[0].move();
        rodent[1].eat();
    }
}
