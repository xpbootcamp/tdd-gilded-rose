package cn.xpbootcamp.gildedrose;

public class SulfurasGoods {
    private int sellIn;
    private int quantity;

    public SulfurasGoods(int sellIn, int quantity) {
        this.sellIn = sellIn;
        this.quantity = quantity;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void passDays() {
    }
}
