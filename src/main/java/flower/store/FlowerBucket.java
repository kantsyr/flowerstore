package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        return flowerPacks.stream()
                            .mapToDouble(FlowerPack::getPrice)
                            .sum();
    }

    public List<FlowerPack> getFlowerPacks() {
        return flowerPacks;
    }
}
