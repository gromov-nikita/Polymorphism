public abstract class Rodent {
    private Eyes obj = new Eyes();
    public Rodent(){
        System.out.println("Rodent");
    }
    public abstract void move();
    public abstract void eat();
}
