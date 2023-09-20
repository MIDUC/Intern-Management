package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Table(name = "intern")
@Getter
@Setter
@Entity
public class Intern extends Member {
    @Column(name = "leader_id")
    private Integer leader_id;

    @Column(name = "phone")
    private String phone;
}
