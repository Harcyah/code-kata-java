package com.harcyah.kata.misc.team_builder;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@EqualsAndHashCode
public class Team implements Comparable<Team> {

    private final List<Freelancer> freelancers;
    private final String names;
    private final int cost;

    public Team(List<Freelancer> freelancers) {
        this.freelancers = freelancers;
        this.names = freelancers.stream()
            .map(Freelancer::getName)
            .sorted()
            .collect(Collectors.joining("/"));
        this.cost = freelancers.stream()
            .mapToInt(Freelancer::getPrice)
            .sum();
    }

    public int getSize() {
        return freelancers.size();
    }

    public Freelancer get(int index) {
        return freelancers.get(index);
    }

    @Override
    public int compareTo(Team that) {
        return ComparisonChain.start()
            .compare(this.cost, that.cost, Ordering.natural().reversed())
            .compare(this.names, that.names)
            .result();
    }

}
