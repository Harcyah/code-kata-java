package com.harcyah.kata.codingbat.warmup1.start_oz;

public class StartOz {

    public String startOz(String str) {
        StringBuilder results = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            results.append('o');
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            results.append('z');
        }
        return results.toString();
    }

}
