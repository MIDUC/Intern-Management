package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "intern")
public class Intern extends Member {
    @Column(name = "leader_id")
    private Integer leader_id;

}
