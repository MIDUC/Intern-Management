package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "task_interns")
public class Task_intern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "intern_id")
    private Integer intern_id;

    @Column(name = "task_id")
    private Integer task_id;

    @Column(name = "dateline")
    private Date dateline;

    @Column(name = "evaluate")
    private String evaluate;

}
