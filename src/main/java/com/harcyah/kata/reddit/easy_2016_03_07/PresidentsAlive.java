package com.harcyah.kata.reddit.easy_2016_03_07;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static com.harcyah.kata.ResourceLoader.loadLines;

public class PresidentsAlive {

    public int findYearWithMostPresidentsAlive() throws IOException {
        Map<Integer, Integer> yearsCounter = new HashMap<>();
        List<String> lines = loadLines("/com/harcyah/kata/reddit/easy_2016_03_07/presidents.csv");
        lines.removeFirst();

        for (String line : lines) {
            String[] tokens = line.split(",");
            int yearOfBirth = Integer.parseInt(StringUtils.right(tokens[1], 4));
            int yearOfDeath = getYearOfDeath(tokens);
            IntStream.range(yearOfBirth, yearOfDeath)
                .boxed()
                .forEach(x -> yearsCounter.compute(x, (k, v) -> v == null ? 1 : v + 1));
        }

        return yearsCounter.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(1)
            .findFirst()
            .orElseThrow()
            .getKey();
    }

    private int getYearOfDeath(String[] tokens) {
        if (StringUtils.isBlank(tokens[3])) {
            return 2016;
        } else {
            return Integer.parseInt(StringUtils.right(tokens[3], 4));
        }
    }

}
