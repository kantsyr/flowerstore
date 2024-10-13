package flower.store;
/**
 * Represents a rose flower with its characteristics.
 */
public class Rose extends Flower {
    /**
     * Constructs a Rose flower with the specified characteristics.
     *
     * @param sepalLength the length of the sepal; should be a positive value
     * @param color the color of the rose
     * @param price the price of the rose
     */
    public Rose(final double sepalLength, 
    final FlowerColor color, final double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.ROSE);
    }
}
