public class Counter {
    private int amount;
    public Counter() {
        amount = 0;
        System.out.println("Counter");
    }
    public void add() {
        amount++;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
