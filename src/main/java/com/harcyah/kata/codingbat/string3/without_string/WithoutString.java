package com.harcyah.kata.codingbat.string3.without_string;

public class WithoutString {

    public String withoutString(String base, String remove) {
        StringBuilder out = new StringBuilder(base);
        String needle = remove.toLowerCase();
        int index;
        while ((index = out.toString().toLowerCase().indexOf(needle)) >= 0) {
            out.delete(index, index + needle.length());
        }
        return out.toString();
    }

}
