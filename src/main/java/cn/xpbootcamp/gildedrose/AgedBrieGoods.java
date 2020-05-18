package cn.xpbootcamp.gildedrose;

public class AgedBrieGoods {
    private int sellIn;
    private int quantity;


    public AgedBrieGoods(int sellIn, int quantity) {
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
        int GOODS_MAX_VALUE = 50;
        int DAILY_ADD_ONE_POINT = 1;
        int DAILY_ADD_TWO_POINT = 2;

        boolean isExpired = this.sellIn - pastDays < 0;
        this.sellIn--;

        if (isExpired) {
            this.quantity += DAILY_ADD_TWO_POINT;
        } else {
            this.quantity += DAILY_ADD_ONE_POINT;
        }
        this.quantity = Math.min(GOODS_MAX_VALUE, this.quantity);
    }
}
