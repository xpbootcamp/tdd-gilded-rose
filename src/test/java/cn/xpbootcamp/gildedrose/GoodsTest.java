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
        double newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality - 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
