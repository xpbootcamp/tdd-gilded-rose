package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieGoodsTest {
    @Test
    void should_get_sellIn_is_0_quantity_is_1_when_past_1_days_given_a_Aged_Brie_goods_with_sellIn_is_1_quantity_is_2() {
        AgedBrieGoods agedBrieGoods = new AgedBrieGoods("N004", 1, 2);
        agedBrieGoods.passDays(1);
        assertEquals(0, agedBrieGoods.getSellIn());
        assertEquals(3, agedBrieGoods.getQuantity());
    }
}
