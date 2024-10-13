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

    public int getQuantity() {
        return amount;
    }

    public double getTotalPrice() {
        return flower.getPrice() * amount;
    }
}
