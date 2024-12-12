package org.jsp.quizapplication.entity;

import org.jsp.quizapplication.util.QuestionStatus;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String a;
    private String b;
    private String c;
    private String ans;
    private QuestionStatus status;
}
