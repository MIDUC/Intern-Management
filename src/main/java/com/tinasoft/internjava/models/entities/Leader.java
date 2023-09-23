package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "leaders")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "user_id")
public class Leader extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
//
//    @Column(name = "user_id")
//    private Integer user_id;

}
