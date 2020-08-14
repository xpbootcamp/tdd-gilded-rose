package cn.xpbootcamp.gildedrose;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SulfurasTest {

    @Test
    public void should_quality_and_sellIn_stay_same_when_update_given_in_sell_and_quality() {
        double oldQuality = 10;
        int oldSellIn = 1;

        Goods goods = new Goods("Sulfuras", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality);
        assertThat(newSellIn).isEqualTo(oldSellIn);
    }
}
