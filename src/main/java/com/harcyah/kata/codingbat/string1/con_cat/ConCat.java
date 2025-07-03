package com.harcyah.kata.codingbat.string1.con_cat;

public class ConCat {

    public String conCat(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }

        StringBuilder out = new StringBuilder();
        out.append(a);
        char suffix = out.charAt(out.length() - 1);
        if (suffix == b.charAt(0)) {
            out.append(b.substring(1));
        } else {
            out.append(b);
        }
        return out.toString();
    }

}
