package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class NormalGoodsTest {
    @Test
    void should_get_sellIn_is_0_quantity_is_1_when_past_1_days_given_a_normal_goods_with_sellIn_is_1_quantity_is_2() {
        NormalGoods normalGoods = new NormalGoods( 1, 2);
        normalGoods.passDays(1);
        assertEquals(0, normalGoods.getSellIn());
        assertEquals(1, normalGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_negative_1_quantity_is_1_when_past_1_days_given_a_normal_goods_with_sellIn_is_0_quantity_is_3() {
        NormalGoods normalGoods = new NormalGoods( 0, 3);
        normalGoods.passDays(1);
        assertEquals(-1, normalGoods.getSellIn());
        assertEquals(1, normalGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_negative_1_quantity_is_0_when_past_1_days_given_a_normal_goods_with_sellIn_is_0_quantity_is_1() {
        NormalGoods normalGoods = new NormalGoods( 0, 1);
        normalGoods.passDays(1);
        assertEquals(-1, normalGoods.getSellIn());
        assertEquals(0, normalGoods.getQuantity());
    }

}
