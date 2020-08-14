package cn.xpbootcamp.gildedrose;

public class Goods {
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        decreaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            decreaseQuality();
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
