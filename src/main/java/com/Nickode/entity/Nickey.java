package com.Nickode.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Builder
@ToString
@Getter
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nickey implements Serializable {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;
}
