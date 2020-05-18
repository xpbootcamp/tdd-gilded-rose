package cn.xpbootcamp.gildedrose;

public class AgedBrieGoods {
    private String name;
    private int sellIn;
    private int quantity;

    public AgedBrieGoods(String name, int sellIn, int quantity) {
        this.name = name;
        this.sellIn = sellIn;
        this.quantity = quantity;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void passDays(int pastDays) {
        this.sellIn = 0;
        this.quantity = 3;
    }
}
