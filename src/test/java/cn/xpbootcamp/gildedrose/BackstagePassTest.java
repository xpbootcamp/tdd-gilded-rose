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

    @Test
    public void should_quality_is_50_and_sellIn_decrease_by_1_when_update_given_sellIn_above_10_and_quality_below_50() {
        double oldQuality = 50;
        int oldSellIn = 11;

        Goods goods = new Goods("Backstage Pass", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    public void should_quality_increase_by_2_and_sellIn_decrease_by_1_when_update_given_sellIn_is_6_and_quality_below_49() {
        double oldQuality = 45;
        int oldSellIn = 6;

        Goods goods = new Goods("Backstage Pass", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality + 2);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }

    @Test
    public void should_quality_is_50_and_sellIn_decrease_by_1_when_update_given_sellIn_is_6_and_quality_is_49() {
        double oldQuality = 49;
        int oldSellIn = 6;

        Goods goods = new Goods("Backstage Pass", oldQuality, oldSellIn);

        goods.updateByDay();

        double newQuality = goods.getQuality();
        int newSellIn = goods.getSellIn();

        assertThat(newQuality).isEqualTo(oldQuality + 1);
        assertThat(newSellIn).isEqualTo(oldSellIn - 1);
    }
}
