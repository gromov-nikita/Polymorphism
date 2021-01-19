/*

Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
them to an array of Cycle. Try to call balance( ) on each element of the array and observe
the results. Downcast and call balance( ) and observe what happens.

Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.

 */
public class Runner {
    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
        Unicycle unicycle = new Unicycle();
        Cycle array[] = new Cycle[3];
        array[0] = tricycle;
        array[1] = bicycle;
        array[2] = unicycle;
        for(int i = 0; i < 3; i++){
            //array[i].
        }
        //((Tricycle)array[0]).
        ((Bicycle)array[1]).balance();
        ((Unicycle)array[2]).balance();

    }
}
