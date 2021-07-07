package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {
    @Test
    void should_get_sellIn_is_1_quantity_is_2_when_past_1_days_given_a_sulfuras_goods_with_sellIn_is_1_quantity_is_2() {
        SulfurasGoods sulfurasGoods = new SulfurasGoods( 1, 2);
        sulfurasGoods.passDays();
        assertEquals(1, sulfurasGoods.getSellIn());
        assertEquals(2, sulfurasGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_1_quantity_is_2_when_past_1_days_given_a_sulfuras_goods_with_sellIn_is_0_quantity_is_2() {
        SulfurasGoods sulfurasGoods = new SulfurasGoods( 0, 2);
        sulfurasGoods.passDays();
        assertEquals(0, sulfurasGoods.getSellIn());
        assertEquals(2, sulfurasGoods.getQuantity());
    }
}
