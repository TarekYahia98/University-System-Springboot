package com.tarek.test.models;

import lombok.Getter;

@Getter
public enum FacultyType {
    ENGINEERING("Engineering"),
    BUSINESS("Business"),
    PHARMACY("Pharmacy"),
    SCIENCE("Science"),
    MEDICINE("Medicine"),
    COMPUTER_SCIENCE("Computer Science");

    private final String displayName;

    FacultyType(String displayName) {
        this.displayName = displayName;
    }

}

