package cn.xpbootcamp.gildedrose;

public class NormalGoods {
    private int sellIn;
    private int quantity;

    public NormalGoods(int sellIn, int quantity) {
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
        int GOODS_MIN_VALUE = 0;
        int DAILY_REDUCE_ONE_POINT = 1;
        int DAILY_REDUCE_TWO_POINT = 2;

        boolean isExpired = this.sellIn - pastDays < 0;
        this.sellIn--;

        if (isExpired) {
            this.quantity -= DAILY_REDUCE_TWO_POINT;
        } else {
            this.quantity -= DAILY_REDUCE_ONE_POINT;
        }
        this.quantity = Math.max(GOODS_MIN_VALUE, this.quantity);
    }

}
