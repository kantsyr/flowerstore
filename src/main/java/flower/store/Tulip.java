package flower.store;

public class Tulip extends Flower {
    public Tulip(double sepalLength, FlowerColor color, double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.TULIP);
    }
}
