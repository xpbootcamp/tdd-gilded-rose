package cn.xpbootcamp.gildedrose;

public class Goods {
    private String name;
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        if ("Aged Brie".equals(name)) {
            quality = quality + 1;
            sellIn = sellIn - 1;
        } else {

            decreaseQuality();
            sellIn = sellIn - 1;
            if (sellIn < 0) {
                decreaseQuality();
            }
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    public double getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }
}
