package com.harcyah.kata.reddit.easy_2015_02_16;

// http://www.reddit.com/r/dailyprogrammer/comments/2w84hl/20150216_challenge_202_easy_i_am_bender_please/
public class BinaryReader {

    public String read(String binary) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            String letter = binary.substring(i, i + 8);
            int integer = Integer.parseInt(letter, 2);
            sb.append((char) integer);
        }
        return sb.toString();
    }

}
