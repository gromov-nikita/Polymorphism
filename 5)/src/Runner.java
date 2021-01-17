/*

Exercise 5: (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which
returns the number of wheels. Modify ride( ) to call wheels( ) and verify that
polymorphism works.

Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
 */
public class Runner {
    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Cycle obj1 = tricycle;
        Cycle obj2 = bicycle;
        Cycle obj3 = unicycle;
        tricycle.ride();
        bicycle.ride();
        unicycle.ride();
        obj1.ride();
        obj2.ride();
        obj3.ride();
    }
}
