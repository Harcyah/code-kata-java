package com.harcyah.kata.misc.team_builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public class Freelancers {

    private final Freelancer[] freelancers;

    public Freelancers(Set<Freelancer> freelancers) {
        this.freelancers = freelancers.toArray(Freelancer[]::new);
    }

    public Set<Freelancer> asSet() {
        return Set.of(freelancers);
    }

}
