package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AgedBrieTest {
    @Test
    public void should_quality_increase_by_1_and_sellIn_decrease_by_1_when_update_given_in_sell_and_quality_between_0_50() {
        double oldQuality = 45;
        int oldSellIn = 1;

        Goods goods = new Goods("Aged Brie", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality + 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    public void should_quality_is_50_and_sellIn_decrease_by_1_when_update_given_in_sell_and_quality_is_50() {
        double oldQuality = 50;
        int oldSellIn = 1;

        Goods goods = new Goods("Aged Brie", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

}
