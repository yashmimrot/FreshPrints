package com.freshprints.project.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@Table(name="ORDER")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    @Column(name="ORDER_NUMBER", length=15, nullable=false, unique=false)
    public String userName;

    @Column(name="DATE", length=12, nullable=false, unique=false)
    public String password;

    @Column(name="DESCRIPTION", length=100, nullable=false, unique=false)
    public String contact;

    // other fields, getters and setters
}
