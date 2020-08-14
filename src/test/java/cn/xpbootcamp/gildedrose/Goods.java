package cn.xpbootcamp.gildedrose;

public class Goods {
    private double quality;
    private int sellIn;

    public Goods(String name, double quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void updateByDay() {
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;
    }

    public double getQuality() {
        return quality;
    }

    public double getSellIn() {
        return sellIn;
    }
}
