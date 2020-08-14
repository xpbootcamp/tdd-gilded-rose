package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoodsTest {

    @Test
    public void should_quality_and_sellIn_decrease_by_1_when_update_given_in_sell_and_quality_between_0_50() {
        double oldQuality = 5;
        int oldSellIn = 1;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality - 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    public void should_quality_is_0_and_sellIn_decrease_by_1_when_update_given_in_sell_and_quality_is_0() {
        double oldQuality = 0;
        int oldSellIn = 1;

        Goods goods = new Goods("Regular", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(0);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
