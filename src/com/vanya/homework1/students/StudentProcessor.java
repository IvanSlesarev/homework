package com.vanya.homework1.students;

import java.util.*;
import java.util.stream.Collectors;

public class StudentProcessor {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Doe", 1, Arrays.asList(4, 5, 3)),
                new Student("Jane", "Smith", 1, Arrays.asList(2, 3, 4)),
                new Student("Alice", "Johnson", 2, Arrays.asList(5, 5, 4)),
                new Student("Bob", "Brown", 2, Arrays.asList(3, 2, 4)),
                new Student("Charlie", "Davis", 1, Arrays.asList(5, 5, 5)));
        Map<Integer, StudentInfo> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourseNumber,
                        TreeMap::new,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                studentList -> {
                                    List<Student> filteredStudents = studentList.stream()
                                            .filter(s -> s.getGrades().stream().anyMatch(g -> g > 3))
                                            .sorted(Comparator.comparing(Student::getLastName)
                                                    .thenComparing(Student::getFirstName))
                                            .collect(Collectors.toList());

                                    double averageGrade = filteredStudents.stream()
                                            .flatMapToInt(s -> s.getGrades().stream().mapToInt(i -> i))
                                            .average()
                                            .orElse(0.0);

                                    return new StudentInfo(filteredStudents, averageGrade);
                                }
                        )
                ));

        result.forEach((course, info) -> {
            System.out.println("Course: " + course);
            System.out.println("Average Grade: " + info.getAverageGrade());
            System.out.println("Students: ");
            info.getStudents().forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName()));
        });
    }
}
