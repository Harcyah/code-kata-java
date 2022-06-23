package com.harcyah.kata.codingbat.logic1.cigar_party;

public class CigarParty {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return cigars >= 40 && (isWeekend || cigars <= 60);
    }

}
