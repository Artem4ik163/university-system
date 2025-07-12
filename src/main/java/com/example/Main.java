package com.example;

import com.example.model.Student;
import com.example.model.University;
import com.example.model.StudyProfile;

public class Main {
    public static void main(String[] args) {
        // Создание университета
        University university = new University();
        university.setId("1");
        university.setFullName("Samara State University");
        university.setShortName("MSU");
        university.setYearOfFoundation(1755);
        university.setMainProfile(StudyProfile.MEDICINE);

        // Создание студента
        Student student = new Student();
        student.setFullName("Artem Rybalko");
        student.setUniversityId(university.getId());
        student.setCurrentCourseNumber(3);
        student.setAvgExamScore(4.5f);

        // Вывод информации в консоль
        System.out.println("University: " + university);
        System.out.println("Student: " + student);
    }
}