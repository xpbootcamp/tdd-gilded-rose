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

    @Test
    void should_get_sellIn_is_10_quantity_is_50_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_11_quantity_is_50() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(11, 50);
        backstagePassGoods.passDays(1);
        assertEquals(10, backstagePassGoods.getSellIn());
        assertEquals(50, backstagePassGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_9_quantity_is_47_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_10_quantity_is_45() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(10, 45);
        backstagePassGoods.passDays(1);
        assertEquals(9, backstagePassGoods.getSellIn());
        assertEquals(47, backstagePassGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_5_quantity_is_50_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_6_quantity_is_50() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(6, 50);
        backstagePassGoods.passDays(1);
        assertEquals(5, backstagePassGoods.getSellIn());
        assertEquals(50, backstagePassGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_4_quantity_is_48_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_5_quantity_is_45() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(5, 45);
        backstagePassGoods.passDays(1);
        assertEquals(4, backstagePassGoods.getSellIn());
        assertEquals(48, backstagePassGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_0_quantity_is_50_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_1_quantity_is_50() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(1, 50);
        backstagePassGoods.passDays(1);
        assertEquals(0, backstagePassGoods.getSellIn());
        assertEquals(50, backstagePassGoods.getQuantity());
    }


    @Test
    void should_get_sellIn_is_negative_1_quantity_is_0_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_0_quantity_is_0() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(0, 0);
        backstagePassGoods.passDays(1);
        assertEquals(-1, backstagePassGoods.getSellIn());
        assertEquals(0, backstagePassGoods.getQuantity());
    }

    @Test
    void should_get_sellIn_is_negative_1_quantity_is_0_when_past_1_days_given_a_Backstage_Pass_goods_with_sellIn_is_0_quantity_is_30() {
        BackstagePassGoods backstagePassGoods = new BackstagePassGoods(0, 30);
        backstagePassGoods.passDays(1);
        assertEquals(-1, backstagePassGoods.getSellIn());
        assertEquals(0, backstagePassGoods.getQuantity());
    }
}

