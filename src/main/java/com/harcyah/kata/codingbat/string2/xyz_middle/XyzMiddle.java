package com.harcyah.kata.codingbat.string2.xyz_middle;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class XyzMiddle {

    protected static final String XYZ = "xyz";

    public boolean xyzMiddle(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() < 3) {
            return false;
        }
        if (str.equals(XYZ)) {
            return true;
        }

        List<Pattern> patterns = parse(str);
        for (Pattern pattern : patterns) {
            if (pattern.matches()) {
                return true;
            }
        }
        return false;
    }

    private List<Pattern> parse(String str) {
        List<Pattern> patterns = new ArrayList<>();
        for (int i = 0; i < str.length() - XYZ.length(); i++) {
            String xyz = str.substring(i, i + XYZ.length());
            if (XYZ.equals(xyz)) {
                Pattern pattern = new Pattern(
                    str.substring(0, i),
                    str.substring(i + XYZ.length())
                );
                patterns.add(pattern);
            }
        }
        return patterns;
    }

    @AllArgsConstructor
    protected static class Pattern {

        private final String prefix;
        private final String suffix;

        public boolean matches() {
            return Math.abs(prefix.length() - suffix.length()) <= 1;
        }

    }

}
