package com.harcyah.kata.pape;

// http://www.home.hs-karlsruhe.de/~pach0003/informatik_1/aufgaben/en/flowcontrol.html#metric_bytes
public class BytesRepresentation {

    public enum Unit {
        BYTE(0),
        KILO_BYTE(3),
        MEGA_BYTE(6),
        GIGA_BYTE(9);

        private final int ratio;
        private final int max;

        Unit(int ratio) {
            this.ratio = ratio;
            this.max = (int) Math.pow(10, ratio + 3);
        }

    }

    public String toBytesString(Unit unit, long value) {
        return (value / Math.pow(10, unit.ratio)) + " " + unit.name();
    }

    public String toBytesString(long value) {
        if (value < Unit.BYTE.max) {
            return toBytesString(Unit.BYTE, value);
        } else if (value < Unit.KILO_BYTE.max) {
            return toBytesString(Unit.KILO_BYTE, value);
        } else if (value < Unit.MEGA_BYTE.max) {
            return toBytesString(Unit.MEGA_BYTE, value);
        } else {
            return toBytesString(Unit.GIGA_BYTE, value);
        }
    }

}
