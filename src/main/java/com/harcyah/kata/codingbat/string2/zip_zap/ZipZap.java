package com.harcyah.kata.codingbat.string2.zip_zap;

public class ZipZap {

    public String zipZap(String source) {
        StringBuilder out = new StringBuilder(source);
        for (int i = 1; i < (source.length() - 1); i++) {
            if ((out.charAt(i - 1) == 'z') && (out.charAt(i + 1) == 'p')) {
                out.deleteCharAt(i);
            }
        }
        return out.toString();
    }

}
