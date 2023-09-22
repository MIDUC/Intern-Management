package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "content")
    private String content;

    @Column(name = "time")
    private Date time;

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "task_id")
    private Integer task_id;

}
