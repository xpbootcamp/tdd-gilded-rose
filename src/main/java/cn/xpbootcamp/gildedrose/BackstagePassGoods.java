package cn.xpbootcamp.gildedrose;

public class BackstagePassGoods {
    private int sellIn;
    private int quantity;

    public BackstagePassGoods(int sellIn, int quantity) {
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
        this.sellIn--;
        if (this.sellIn - pastDays < 10) {
            this.quantity += 2;
        } else {
            this.quantity++;
        }

        this.quantity = Math.min(50, this.quantity);
    }
}
