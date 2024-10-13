package com.vanya.homework1.students;

import java.util.List;

public class StudentInfo {
    private List<Student> students;
    private double averageGrade;

    public StudentInfo(List<Student> students, double averageGrade) {
        this.students = students;
        this.averageGrade = averageGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}
