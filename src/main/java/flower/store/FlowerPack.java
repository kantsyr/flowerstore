package flower.store;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}
