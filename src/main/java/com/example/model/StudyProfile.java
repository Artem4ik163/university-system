package com.example.model;

public enum StudyProfile {
    MEDICINE("Медицина"),
    ENGINEERING("Инженерия"),
    LAW("Юриспруденция"),
    BUSINESS("Бизнес");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }

    @Override
    public String toString() {
        return profileName;
    }
}


