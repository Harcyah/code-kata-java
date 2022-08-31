package com.harcyah.kata.reddit.easy_2016_02_22;

import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import static com.harcyah.kata.ResourceLoader.loadLines;

public class PlayingWithLightSwitches {

    public int apply(int lights, Iterable<Range> ranges) {
        BitSet bitSet = new BitSet(lights);
        for (Range range : ranges) {
            bitSet.flip(range.getStart(), range.getEnd() + 1);
        }
        return bitSet.cardinality();
    }

    public int applyFrom(String path) throws IOException {
        List<String> lines = loadLines(path);
        int lights = Integer.parseInt(lines.get(0));

        List<Range> ranges = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            int space = line.indexOf(" ");
            int start = Integer.parseInt(line.substring(0, space));
            int end = Integer.parseInt(line.substring(space + 1));
            Range range = new Range(start, end);
            ranges.add(range);
        }
        return apply(lights, ranges);
    }

}
