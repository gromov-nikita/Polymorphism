public class Mouse extends Rodent {
    private Eyes obj = new Eyes();
    private static Counter counter = new Counter();
    public Mouse(){
        counter.add();
        System.out.println("Mouse " + counter.getAmount());
    }
    @Override
    public Counter useCounter() {
        return counter;
    }
    @Override
    public void eat() {
        System.out.println("Mouse: Griz-griz-griz");
    }
    @Override
    public void move() {
        System.out.println("Mouse: chuh-chuh-chuh");
    }
}
