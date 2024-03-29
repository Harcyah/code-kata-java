package com.harcyah.kata.exercism.grade_school;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class SchoolTest {
    private final School school = new School();

    @Test
    void startsWithNoStudents() {
        assertThat(school.db()).isEmpty();
    }

    @Test
    void addsStudents() {
        school.add("Aimee", 2);
        assertThat(school.db().get(2)).contains("Aimee");
    }

    @Test
    void addsMoreStudentsInSameGrade() {
        final int grade = 2;
        school.add("James", grade);
        school.add("Blair", grade);
        school.add("Paul", grade);

        assertThat(school.db().get(grade)).hasSize(3).contains("James", "Blair", "Paul");
    }

    @Test
    void addsStudentsInMultipleGrades() {
        school.add("Chelsea", 3);
        school.add("Logan", 7);

        assertThat(school.db()).hasSize(2);
        assertThat(school.db().get(3)).hasSize(1).contains("Chelsea");
        assertThat(school.db().get(7)).hasSize(1).contains("Logan");
    }

    @Test
    void getsStudentsInAGrade() {
        school.add("Franklin", 5);
        school.add("Bradley", 5);
        school.add("Jeff", 1);
        assertThat(school.grade(5)).hasSize(2).contains("Franklin", "Bradley");
    }

    @Test
    void getsStudentsInEmptyGrade() {
        assertThat(school.grade(1)).isEmpty();
    }

    @Test
    void sortsSchool() {
        school.add("Jennifer", 4);
        school.add("Kareem", 6);
        school.add("Christopher", 4);
        school.add("Kyle", 3);
        Map<Integer, List<String>> sortedStudents = new HashMap<>();
        sortedStudents.put(6, List.of("Kareem"));
        sortedStudents.put(4, List.of("Christopher", "Jennifer"));
        sortedStudents.put(3, List.of("Kyle"));

        assertThat(school.sort()).isEqualTo(sortedStudents);
    }

}
