package com.tarek.test.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "courses")
@Getter
@Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", sequenceName = "course_sequence", allocationSize = 1)
    private Long course_id;

    @Column(nullable = false, unique = true)
    private String courseName;

    @Column(nullable = false)
    private String instructorName;

    @Column(nullable = false)
    private int courseDuration;

    @Column(nullable = false, unique = true)
    private String courseUniqueId;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    @OneToMany(mappedBy = "course")
    private Set<Grade> grades;
}

