public class Hamster extends Rodent {
    private Eyes obj = new Eyes();
    private static Counter counter = new Counter();
    public Hamster(){
        counter.add();
        System.out.println("Hamster " + counter.getAmount());
    }
    @Override
    public Counter useCounter() {
        return counter;
    }
    @Override
    public void eat() {
        System.out.println("Hamster: hrum-hrum-hrum");
    }
    @Override
    public void move() {
        System.out.println("Hamster: tup-tup-tup");
    }

}
