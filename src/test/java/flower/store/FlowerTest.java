package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
/**
 * Tests for the FlowerStore class, ensuring that its functionality
 * works as expected.
 */
public class FlowerTest {
    /** Random number generator for testing. */
    private static final Random RANDOM_GENERATOR = new Random();
    /** Maximum price for flowers in tests. */
    private static final int MAX_PRICE = 100;
    /** The sepal length of a rose. */
    private static final double ROSE_SEPAL_LENGTH = 2.0;
    /** The price of a rose. */
    private static final int ROSE_PRICE = 50;

    /** The sepal length of a chamomile. */
    private static final double CHAMOMILE_SEPAL_LENGTH = 5.5;
    /** The price of a chamomile. */
    private static final int CHAMOMILE_PRICE = 30;

    /** The sepal length of a tulip. */
    private static final double TULIP_SEPAL_LENGTH = 5.0;
    /** The price of a tulip. */
    private static final int TULIP_PRICE = 40;

    /** Quantity of flowers in a flower pack. */
    private static final int FLOWER_PACK_QUANTITY = 10;
    /** Total price of a flower pack. */
    private static final int FLOWER_PACK_PRICE = 500;

    /** The flower instance for testing. */
    private Flower flower;

    /** The instance of a rose flower. */
    private Rose rose;
    /** The instance of a chamomile flower. */
    private Chamomile chamomile;
    /** The instance of a tulip flower. */
    private Tulip tulip;
    /** The flower pack containing a rose. */
    private FlowerPack flowerPack;


    /**
     * Initializes the test environment before each test case.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
        rose = new Rose(ROSE_SEPAL_LENGTH, FlowerColor.RED, ROSE_PRICE);
        chamomile = new Chamomile(CHAMOMILE_SEPAL_LENGTH,
        FlowerColor.WHITE, CHAMOMILE_PRICE);
        tulip = new Tulip(TULIP_SEPAL_LENGTH, FlowerColor.PINK, TULIP_PRICE);
        flowerPack = new FlowerPack(rose, FLOWER_PACK_QUANTITY);
    }

    /**
     * Tests setting and getting the price of a flower.
     */
    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    /**
     * Tests setting and getting the color of a flower.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getFlowerColor());
    }
    // Tests for Rose class
    /**
     * Tests the flower type for a rose.
     */
    @Test
    public void testRoseFlowerType() {
        Assertions.assertEquals(FlowerType.ROSE, rose.getFlowerType());
    }

    /**
     * Tests the color of a rose.
     */
    @Test
    public void testRoseColor() {
        Assertions.assertEquals("#FF0000", rose.getFlowerColor());
    }
    /**
     * Tests the price of a rose.
     */
    @Test
    public void testRosePrice() {
        Assertions.assertEquals(ROSE_PRICE, rose.getPrice());
    }
    /**
     * Tests the sepal length of a rose.
     */
    @Test
    public void testRoseSepalLength() {
        Assertions.assertEquals(ROSE_SEPAL_LENGTH, rose.getSepalLength());
    }

    // Tests for Chamomile class
    /**
     * Tests the flower type for chamomile.
     */
    @Test
    public void testChamomileFlowerType() {
        Assertions.assertEquals(FlowerType.CHAMOMILE,
        chamomile.getFlowerType());
    }
    /**
     * Tests the color of chamomile.
     */
    @Test
    public void testChamomileColor() {
        Assertions.assertEquals("#FFFFFF", chamomile.getFlowerColor());
    }
    /**
     * Tests the price of chamomile.
     */
    @Test
    public void testChamomilePrice() {
        Assertions.assertEquals(CHAMOMILE_PRICE, chamomile.getPrice());
    }
    /**
     * Tests the sepal length of chamomile.
     */
    @Test
    public void testChamomileSepalLength() {
        Assertions.assertEquals(CHAMOMILE_SEPAL_LENGTH,
        chamomile.getSepalLength());
    }

    // Tests for Tulip class
    /**
     * Tests the flower type for a tulip.
     */
    @Test
    public void testTulipFlowerType() {
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
    }
    /**
     * Tests the color of a tulip.
     */
    @Test
    public void testTulipColor() {
        Assertions.assertEquals("#FFC0CB", tulip.getFlowerColor());
    }
    /**
     * Tests the price of a tulip.
     */
    @Test
    public void testTulipPrice() {
        Assertions.assertEquals(TULIP_PRICE, tulip.getPrice());
    }
    /**
     * Tests the sepal length of a tulip.
     */
    @Test
    public void testTulipSepalLength() {
        Assertions.assertEquals(TULIP_SEPAL_LENGTH, tulip.getSepalLength());
    }

    // Tests for FlowerPack class
    /**
     * Tests that the flower pack contains the correct flower.
     */
    @Test
    public void testFlowerPackContainsFlower() {
        Assertions.assertEquals(rose, flowerPack.getFlower());
    }
    /**
     * Tests the quantity of flowers in the flower pack.
     */
    @Test
    public void testFlowerPackQuantity() {
        Assertions.assertEquals(FLOWER_PACK_QUANTITY, flowerPack.getAmount());
    }
    /**
     * Tests the total price of the flower pack.
     */
    @Test
    public void testFlowerPackTotalPrice() {
        Assertions.assertEquals(FLOWER_PACK_PRICE, flowerPack.getPrice());
    }
}
