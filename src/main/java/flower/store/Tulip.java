package flower.store;
/**
 * Represents a tulip flower with its characteristics.
 */
public class Tulip extends Flower {
    /**
     * Constructs a Tulip flower with the specified characteristics.
     *
     * @param sepalLength the length of the sepal; should not be negative
     * @param color the color of the tulip; should not be null
     * @param price the price of the tulip; should not be negative
     */
    public Tulip(double sepalLength, FlowerColor color, double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.TULIP);
    }
}
