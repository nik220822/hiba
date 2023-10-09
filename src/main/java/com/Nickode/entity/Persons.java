package com.Nickode.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@IdClass(Nickey.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "persons")
public class Persons {
    //    @Id
//    @Column(nullable = false)
//    private String name;
//    @Id
//    @Column(nullable = false)
//    private String surname;
//    @Id
//    @Column(nullable = false)
//    private int age;
    @EmbeddedId
    private Nickey primaryKey;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String cityOfLiving;

    public Nickey getPersonId() {
        return this.primaryKey;
    }
}
