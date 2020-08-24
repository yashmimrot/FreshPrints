package com.freshprints.project.entity;



import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@Table(name="ITEM")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Column(name = "ITEM_NAME", length = 15, nullable= false, unique = false)
    public String userName;

    @Column(name = "DESCRIPTION", length = 100, nullable = false, unique = false)
    public String password;
}
    // other fields, getters and setters
