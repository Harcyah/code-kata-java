package com.harcyah.kata.misc.team_builder;

import lombok.AllArgsConstructor;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;
import org.paukov.combinatorics.IFilter;

import java.util.List;

import static org.paukov.combinatorics.CombinatoricsFactory.createSimpleCombinationGenerator;
import static org.paukov.combinatorics.CombinatoricsFactory.createVector;

public class TeamBuilder {

    public Teams build(Freelancers freelancers, int teamSize, int budget) {
        ICombinatoricsVector<Freelancer> vector = createVector(freelancers.getFreelancers());
        Generator<Freelancer> generator = createSimpleCombinationGenerator(vector, teamSize);

        TeamBudgetFilter filter = new TeamBudgetFilter(budget);
        List<ICombinatoricsVector<Freelancer>> results = generator.generateFilteredObjects(filter);

        var teams = results.stream()
            .map(r -> new Team(r.getVector()))
            .toList();
        return new Teams(teams);
    }

    @AllArgsConstructor
    private static class TeamBudgetFilter implements IFilter<ICombinatoricsVector<Freelancer>> {

        private final int maxBudget;

        @Override
        public boolean accepted(long index, ICombinatoricsVector<Freelancer> vector) {
            var budget = vector.getVector().stream().mapToInt(Freelancer::getPrice).sum();
            return budget == maxBudget;
        }
    }

}
