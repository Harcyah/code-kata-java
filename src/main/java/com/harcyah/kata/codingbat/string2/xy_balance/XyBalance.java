package com.harcyah.kata.codingbat.string2.xy_balance;

public class XyBalance {

    public boolean xyBalance(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                String post = str.substring(i);
                if (!post.contains("y")) {
                    return false;
                }
            }
        }
        return true;
    }

}
