package flower.store;

public class Chamomile extends Flower {
    public Chamomile(double sepalLength, FlowerColor color, double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
