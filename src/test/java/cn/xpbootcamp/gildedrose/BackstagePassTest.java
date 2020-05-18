package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BackstagePassTest {
    @Test
    void should_get_sellIn_is_11_quantity_is_50_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_12_quantity_is_49() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(12, 49);
        backstagePassGoods.passDays(1);
        assertEquals(11, backstagePassGoods.getSellIn());
        assertEquals(50, backstagePassGoods.getQuantity());
    }
}

