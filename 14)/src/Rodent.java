public abstract class Rodent {
    private Eyes obj = new Eyes();
    private static Counter counter = new Counter();
    public Rodent(){
        counter.add();
        System.out.println("Rodent " + counter.getAmount());
    }
    public Counter useCounter() {
        return counter;
    }
    public abstract void move();
    public abstract void eat();
}
