package com.harcyah.kata.misc.stringcalculator;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class StringCalculator {

    private final List<String> errors = Lists.newArrayList();
    private final StringBuilder accumulator = new StringBuilder();
    private final Set<Character> separators = Sets.newHashSet(',', '\n');
    private String str;

    public StringCalculator(String str) {
        this.str = str;
    }

    protected Integer accumulate() {
        String accumulated = accumulator.toString();
        accumulator.setLength(0);

        int integer = Integer.parseInt(accumulated);
        if (integer < 0) {
            errors.add(accumulated);
            return 0;
        }

        return integer;
    }

    public void detectSeparators() {
        if (str.length() < 2) {
            return;
        }

        if (Pattern.matches("^\\p{Punct}\\n(.*)$", str)) {
            separators.clear();
            separators.add(str.charAt(0));
            str = str.substring(2);
        }
    }

    public int add() throws NegativeNumberException {
        if (StringUtils.isEmpty(str)) {
            return 0;
        }

        // Separator handling
        detectSeparators();

        // Parsing
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isSeparator(c)) {
                values.add(accumulate());
            } else {
                accumulator.append(c);
            }
        }

        // Last element
        if (!accumulator.isEmpty()) {
            values.add(accumulate());
        }

        // Errors handling
        if (!errors.isEmpty()) {
            throw new NegativeNumberException(errors);
        }

        // Sum
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }

    private boolean isSeparator(char c) {
        return separators.contains(c);
    }

}
