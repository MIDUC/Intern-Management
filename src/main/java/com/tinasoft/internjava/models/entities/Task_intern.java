package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Table(name = "task_intern")
@Getter
@Setter
@Entity
public class Task_intern {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "leader_id")
    private Integer leader_id;

    @Column(name = "intern_id")
    private Integer intern_id;
    @Column(name = "leader_task")
    private Integer leader_task;

    @Column(name = "dateline")
    private Date dateline;
}
