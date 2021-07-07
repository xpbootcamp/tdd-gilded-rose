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
        int GOODS_MAX_VALUE = 50;
        int GOODS_MIN_VALUE = 0;

        boolean is_expire_in_ten_days = this.sellIn - pastDays < 10;
        boolean is_expire_in_five_days = this.sellIn - pastDays < 5;
        boolean is_expire = this.sellIn - pastDays < 0;

        int DAILY_ADD_TWO_POINT = 2;
        int DAILY_ADD_THREE_POINT = 3;

        this.sellIn--;
        if (is_expire) {
            this.quantity = GOODS_MIN_VALUE;
        } else if (is_expire_in_five_days) {
            this.quantity += DAILY_ADD_THREE_POINT;
        } else if (is_expire_in_ten_days) {
            this.quantity += DAILY_ADD_TWO_POINT;
        } else {
            this.quantity++;
        }

        this.quantity = Math.min(GOODS_MAX_VALUE, this.quantity);
    }
}
