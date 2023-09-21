package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "intern")
public class Intern {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "leader_id")
    private Integer leader_id;

    @Column(name = "member_id")
    private Integer member_id;

}
