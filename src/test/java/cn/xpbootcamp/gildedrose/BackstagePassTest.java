package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    public void should_quality_increase_by_1_and_sellIn_decrease_by_1_when_update_given_sellIn_above_10_and_quality_below_50() {
        double oldQuality = 45;
        int oldSellIn = 11;

        Goods goods = new Goods("Backstage Pass", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality + 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
