package com.harcyah.kata.codingbat.map1.map_bully;

import com.harcyah.kata.codingbat.MapBuilder;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class MapBullyTest {

    @Test
    void testMapBully() {
        MapBully mapBully = new MapBully();
        assertThat(mapBully.mapBully(MapBuilder.build("b", "dirt", "a", "candy")))
            .isEqualTo(Map.of("b", "candy", "a", ""));
        assertThat(mapBully.mapBully(MapBuilder.build("a", "candy")))
            .isEqualTo(Map.of("b", "candy", "a", ""));
        assertThat(mapBully.mapBully(MapBuilder.build("b", "carrot", "c", "meh", "a", "candy")))
            .isEqualTo(Map.of("b", "candy", "c", "meh", "a", ""));
        assertThat(mapBully.mapBully(MapBuilder.build("b", "carrot")))
            .isEqualTo(Map.of("b", "carrot"));
        assertThat(mapBully.mapBully(MapBuilder.build("c", "meh")))
            .isEqualTo(Map.of("c", "meh"));
        assertThat(mapBully.mapBully(MapBuilder.build("c", "meh", "a", "sparkle")))
            .isEqualTo(Map.of("b", "sparkle", "c", "meh", "a", ""));
    }

}
