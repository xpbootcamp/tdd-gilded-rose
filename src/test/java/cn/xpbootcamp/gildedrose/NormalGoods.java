package cn.xpbootcamp.gildedrose;

public class NormalGoods {
    private String name;
    private int sellIn;
    private int quantity;

    public NormalGoods(String name, int sellIn, int quantity) {
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
        this.sellIn--;
        if (this.sellIn - pastDays >= 0) {
            this.quantity--;
        } else {
            this.quantity -= 2;
        }
    }

}
