package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class User_role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "role_id")
    private Integer role_id;
}
