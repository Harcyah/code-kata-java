package com.harcyah.kata.misc.team_builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Teams {

    private final List<Team> teams;

    public int getSize() {
        return teams.size();
    }

    public Team get(int index) {
        return teams.get(index);
    }

}
