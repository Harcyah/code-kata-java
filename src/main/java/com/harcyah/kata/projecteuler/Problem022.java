package com.harcyah.kata.projecteuler;

import java.util.List;

public class Problem022 {

    public long getNamesScores(List<String> names) {
        long sum = 0;
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            long value = getValueOf(name);
            int rank = i + 1;
            sum += rank * value;
        }
        return sum;
    }

    protected long getValueOf(String name) {
        long sum = 0;
        for (char c : name.toCharArray()) {
            sum += ((c - 'A') + 1);
        }
        return sum;
    }

}
