package com.harcyah.kata.misc.team_builder;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static com.harcyah.kata.Assertions.assertThat;

class TeamBuilderTest {

    private final Gson gson = new Gson();
    private final TeamBuilder sut = new TeamBuilder();

    @Test
    void testCase1() throws Exception {
        Freelancers freelancers = load("freelancers.json");

        Teams teams = sut.build(freelancers, 1, 560);

        assertThat(teams).hasSize(3);

        assertThat(teams.get(0))
            .hasSize(1)
            .hasNames("Anne")
            .hasCost(560);

        assertThat(teams.get(1))
            .hasSize(1)
            .hasNames("Luc-André")
            .hasCost(560);

        assertThat(teams.get(2))
            .hasSize(1)
            .hasNames("Pierre-Gabriel")
            .hasCost(560);
    }

    @Test
    void testCase2() throws Exception {
        Freelancers freelancers = load("freelancers.json");

        Teams teams = sut.build(freelancers, 2, 390);

        assertThat(teams).hasSize(2);

        assertThat(teams.get(0))
            .hasSize(2)
            .hasNames("Marie/Philippe-Émile")
            .hasCost(390);

        assertThat(teams.get(1))
            .hasSize(2)
            .hasNames("Philippe-Émile/Pulchérie")
            .hasCost(390);
    }

    @Test
    void testCase3() throws Exception {
        Freelancers freelancers = load("freelancers.json");

        Teams teams = sut.build(freelancers, 4, 3000);

        assertThat(teams).hasSize(110);

        assertThat(teams.get(0))
            .hasSize(4)
            .hasNames("Abdonie/Gérard-Raymond/Jude/Reine")
            .hasCost(3000);
    }

    private Freelancers load(String file) throws Exception {
        try (InputStreamReader reader = new InputStreamReader(TeamBuilderTest.class.getResourceAsStream(file), StandardCharsets.UTF_8)) {
            return gson.fromJson(reader, Freelancers.class);
        }
    }

}
