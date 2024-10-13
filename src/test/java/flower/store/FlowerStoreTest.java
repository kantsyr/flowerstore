package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class FlowerStoreTest {
    private Flower rose;
    private Flower chamomile;
    private Flower tulip;
    private FlowerPack rosePack;
    private FlowerPack chamomilePack;
    private FlowerPack tulipPack;
    private FlowerBucket flowerBucket;
    private Store store;

    @BeforeEach
    public void init() {
        rose = new Rose(4.0, FlowerColor.RED, 50);
        chamomile = new Chamomile(3.5, FlowerColor.WHITE, 30);
        tulip = new Tulip(5.0, FlowerColor.PINK, 40);


        rosePack = new FlowerPack(rose, 10);
        chamomilePack = new FlowerPack(chamomile, 5);
        tulipPack = new FlowerPack(tulip, 8);


        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(rosePack);
        flowerBucket.addFlowerPack(chamomilePack);


        store = new Store();
        store.addFlowerBucket(flowerBucket);
    }


    @Test
    public void testFlowerPackPrice() {
        Assertions.assertEquals(500, rosePack.getPrice());
        Assertions.assertEquals(150, chamomilePack.getPrice());
    }

    @Test
    public void testFlowerBucketPrice() {
        Assertions.assertEquals(650, flowerBucket.getPrice());
    }

    @Test
    public void testAddFlowerPack() {
        flowerBucket.addFlowerPack(tulipPack);
        Assertions.assertEquals(650 + 320, flowerBucket.getPrice());
    }


    @Test
    public void testStoreSearchByFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.ROSE);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(flowerBucket, result.get(0));
    }

    @Test
    public void testStoreSearchNonExistentFlowerType() {
        List<FlowerBucket> result = store.search(FlowerType.TULIP);
        Assertions.assertEquals(0, result.size());
    }
}
