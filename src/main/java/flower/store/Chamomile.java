/**
 * Represents a chamomile flower with its characteristics.
 */
package flower.store;

public class Chamomile extends Flower {
    /**
     * Constructs a Chamomile flower with specified characteristics.
     *
     * @param sepalLength the length of the sepal
     * @param color the color of the chamomile flower
     * @param price the price of the chamomile flower
     */
    public Chamomile(final double sepalLength,
     final FlowerColor color, final double price) {
        this.setSepalLength(sepalLength);
        this.setColor(color);
        this.setPrice(price);
        this.setFlowerType(FlowerType.CHAMOMILE);
    }
}
