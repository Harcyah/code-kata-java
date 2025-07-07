package com.harcyah.kata.misc.stringcalculator;

import com.google.common.base.Joiner;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class NegativeNumberException extends Exception {

    private static final long serialVersionUID = 4355135540418785206L;

    private final List<String> numbers;

    @Override
    public String getMessage() {
        return "Unable to handle negative numbers: " + Joiner.on(",").join(numbers);
    }

}
