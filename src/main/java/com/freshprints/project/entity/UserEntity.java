package com.freshprints.project.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@Table(name="USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    @Column(name="USER_NAME", length=15, nullable=false, unique=false)
    public String userName;

    @Column(name="PASSWORD", length=12, nullable=false, unique=false)
    public String password;

    @Column(name="CONTACT", length=12, nullable=false, unique=false)
    public String contact;

    @Column(name="FULL_NAME", length=30, nullable=false, unique=false)
    public String fullName;

    @Column(name="EMAIL", length=30, nullable=false, unique=false)
    public String emailId;

    // other fields, getters and setters
}
