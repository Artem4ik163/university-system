package com.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Student {
    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgExamScore;

    //Конструктор по умолчанию
    public Student() {}

    //Геттеры и сеттеры
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getUniversityId() {
        return universityId;
    }
    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }
    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }
    public float getAvgExamScore() {
        return avgExamScore;
    }
    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }
    //Переопределение toString
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("fullName", fullName)
                .append("universityId", universityId)
                .append("currentCourseNumber", currentCourseNumber)
                .append("avgExamScore", avgExamScore)
                .toString();
    }
}
