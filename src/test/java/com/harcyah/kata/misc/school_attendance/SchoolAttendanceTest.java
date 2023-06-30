package com.harcyah.kata.misc.school_attendance;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SchoolAttendanceTest {

    @Test
    void getStudentsSortedByGenderAndLastNameAscending() throws Exception {
        SchoolAttendance sa = new SchoolAttendance();

        List<Student> students = sa.getStudentsSortedByGenderAndLastNameAscending();

        assertThat(students).hasSize(9);
        assertThat(students)
            .extracting(Student::getLastName)
            .containsExactly(
                "Hingis",
                "Kelly",
                "Kournikova",
                "Seles",
                "Abercrombie",
                "Bishop",
                "Bonk",
                "Bouillon",
                "Smith"
            );
    }

    @Test
    void getStudentsSortedByBirthDateAscending() throws Exception {
        SchoolAttendance sa = new SchoolAttendance();

        List<Student> students = sa.getStudentsSortedByBirthDateAscending();

        assertThat(students).hasSize(9);
        assertThat(students)
            .extracting(Student::getLastName)
            .containsExactly(
                "Abercrombie",
                "Kelly",
                "Bishop",
                "Seles",
                "Bonk",
                "Bouillon",
                "Kournikova",
                "Hingis",
                "Smith"
            );
    }

    @Test
    void getStudentsSortedByLastNameAscending() throws Exception {
        SchoolAttendance sa = new SchoolAttendance();

        List<Student> students = sa.getStudentsSortedByLastNameAscending();

        assertThat(students).hasSize(9);
        assertThat(students)
            .extracting(Student::getLastName)
            .containsExactly(
                "Abercrombie",
                "Bishop",
                "Bonk",
                "Bouillon",
                "Hingis",
                "Kelly",
                "Kournikova",
                "Seles",
                "Smith"
            );
    }

}
