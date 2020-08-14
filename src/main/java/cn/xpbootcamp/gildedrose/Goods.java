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
            increaseQuality();
            decreaseSellIn();
            if (sellIn < 0) {
                increaseQuality();
            }
            return;
        }
        if ("Backstage Pass".equals(name)) {
            quality = quality + 1;
            sellIn = sellIn - 1;
            return;
        }
        decreaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private void decreaseSellIn() {
        sellIn = sellIn - 1;
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
