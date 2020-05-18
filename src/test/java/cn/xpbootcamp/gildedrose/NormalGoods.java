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

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void passDays(int pastDays) {
        this.setSellIn(0);
        this.setQuantity(1);
    }

}
