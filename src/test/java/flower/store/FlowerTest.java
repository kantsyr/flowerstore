package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;
    private Rose rose;
    private Chamomile chamomile;
    private Tulip tulip;
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        flower = new Flower();
        rose = new Rose(2.0, FlowerColor.RED, 50);
        chamomile = new Chamomile(5.5, FlowerColor.WHITE, 30);
        tulip = new Tulip(5.0, FlowerColor.PINK, 40);
        flowerPack = new FlowerPack(rose, 10);
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
        Assertions.assertEquals(50, rose.getPrice());
    }

    @Test
    public void testRoseSepalLength() {
        Assertions.assertEquals(2.0, rose.getSepalLength());
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
        Assertions.assertEquals(30, chamomile.getPrice());
    }

    @Test
    public void testChamomileSepalLength() {
        Assertions.assertEquals(5.5, chamomile.getSepalLength());
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
        Assertions.assertEquals(40, tulip.getPrice());
    }

    @Test
    public void testTulipSepalLength() {
        Assertions.assertEquals(5.0, tulip.getSepalLength());
    }

    // Tests for FlowerPack class
    @Test
    public void testFlowerPackContainsFlower() {
        Assertions.assertEquals(rose, flowerPack.getFlower());
    }

    @Test
    public void testFlowerPackQuantity() {
        Assertions.assertEquals(10, flowerPack.getAmount());
    }

    @Test
    public void testFlowerPackTotalPrice() {
        Assertions.assertEquals(500, flowerPack.getPrice());
    }
}
