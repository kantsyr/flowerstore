package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final double ROSE_SEPAL_LENGTH = 2.0;
    private static final int ROSE_PRICE = 50;

    private static final double CHAMOMILE_SEPAL_LENGTH = 5.5;
    private static final int CHAMOMILE_PRICE = 30;

    private static final double TULIP_SEPAL_LENGTH = 5.0;
    private static final int TULIP_PRICE = 40;

    private static final int FLOWER_PACK_QUANTITY = 10;
    private static final int FLOWER_PACK_PRICE = 500;

    private Flower flower;
    private Rose rose;
    private Chamomile chamomile;
    private Tulip tulip;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        rose = new Rose(ROSE_SEPAL_LENGTH, FlowerColor.RED, ROSE_PRICE);
        chamomile = new Chamomile(CHAMOMILE_SEPAL_LENGTH, FlowerColor.WHITE, CHAMOMILE_PRICE);
        tulip = new Tulip(TULIP_SEPAL_LENGTH, FlowerColor.PINK, TULIP_PRICE);
        flowerPack = new FlowerPack(rose, FLOWER_PACK_QUANTITY);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    
    }
    // Tests for Rose class
    @Test
    public void testRoseFlowerType() {
        Assertions.assertEquals(FlowerType.ROSE, rose.getFlowerType());
    }

    @Test
    public void testRoseColor() {
        Assertions.assertEquals("#FF0000", rose.getColor());
    }

    @Test
    public void testRosePrice() {
        Assertions.assertEquals(ROSE_PRICE, rose.getPrice());
    }

    @Test
    public void testRoseSepalLength() {
        Assertions.assertEquals(ROSE_SEPAL_LENGTH, rose.getSepalLength());
    }

    // Tests for Chamomile class
    @Test
    public void testChamomileFlowerType() {
        Assertions.assertEquals(FlowerType.CHAMOMILE, chamomile.getFlowerType());
    }

    @Test
    public void testChamomileColor() {
        Assertions.assertEquals("#FFFFFF", chamomile.getColor());
    }

    @Test
    public void testChamomilePrice() {
        Assertions.assertEquals(CHAMOMILE_PRICE, chamomile.getPrice());
    }

    @Test
    public void testChamomileSepalLength() {
        Assertions.assertEquals(CHAMOMILE_SEPAL_LENGTH, 
        chamomile.getSepalLength());
    }

    // Tests for Tulip class
    @Test
    public void testTulipFlowerType() {
        Assertions.assertEquals(FlowerType.TULIP, tulip.getFlowerType());
    }

    @Test
    public void testTulipColor() {
        Assertions.assertEquals("#FFC0CB", tulip.getColor());
    }

    @Test
    public void testTulipPrice() {
        Assertions.assertEquals(TULIP_PRICE, tulip.getPrice());
    }

    @Test
    public void testTulipSepalLength() {
        Assertions.assertEquals(TULIP_SEPAL_LENGTH, tulip.getSepalLength());
    }

    // Tests for FlowerPack class
    @Test
    public void testFlowerPackContainsFlower() {
        Assertions.assertEquals(rose, flowerPack.getFlower());
    }

    @Test
    public void testFlowerPackQuantity() {
        Assertions.assertEquals(FLOWER_PACK_QUANTITY, flowerPack.getAmount());
    }

    @Test
    public void testFlowerPackTotalPrice() {
        Assertions.assertEquals(FLOWER_PACK_PRICE, flowerPack.getPrice());
    }
}
