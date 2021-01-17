/*
Exercise 10: (3) Create a base class with two methods. In the first method, call the
second method. Inherit a class and override the second method. Create an object of the
derived class, upcast it to the base type, and call the first method. Explain what happens.

 */
public class Runner {
    public static void main(String[] args) {
        ThecondClass obj = new ThecondClass();
        obj.print1();
        System.out.println("___________________");
        ((BaseClass)obj).print1();
    }
}
