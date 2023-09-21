package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "member_roles")
public class Member_roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "member_id")
    private String member_id;
    @Column(name = "role_id")
    private String role_id;
}
