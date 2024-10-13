package flower.store;

public class Rose extends Flower{
    public Rose(double sepalLength, FlowerColor color, double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.ROSE);
    }
}
