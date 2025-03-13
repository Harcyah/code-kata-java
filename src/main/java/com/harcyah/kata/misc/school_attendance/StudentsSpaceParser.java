package com.harcyah.kata.misc.school_attendance;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentsSpaceParser implements Parser {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("M-d-yyyy");

    @Override
    public Student parse(String line) throws ParseException {
        String[] tokens = StringUtils.split(line, " ");
        return new Student(
            tokens[1],
            tokens[2],
            tokens[0],
            Gender.from(tokens[3]),
            null,
            LocalDate.parse(tokens[4], DATE_FORMAT)
        );
    }

}
