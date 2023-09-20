package com.tinasoft.internjava.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "leader")
@Entity
@Getter
@Setter
public class Leader extends Member {
}
