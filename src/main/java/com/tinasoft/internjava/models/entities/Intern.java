package com.tinasoft.internjava.models.entities;

import java.lang.reflect.Member;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "interns")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "user_id")
public class Intern extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    @Column(name = "user_id")
//    private Integer user_id;

    @Column(name = "leader_id")
    private Integer leader;
    @Transient
    private Leader manager;
}
