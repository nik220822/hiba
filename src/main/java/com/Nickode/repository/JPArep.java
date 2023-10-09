package com.Nickode.repository;

import com.Nickode.entity.Nickey;
import com.Nickode.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JPArep extends JpaRepository<Persons, Nickey>{
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByPrimaryKeyAgeLessThanOrderByPrimaryKeyAgeAsc(int age);

    Optional<Persons> findByPrimaryKeyNameAndPrimaryKeySurname(String name, String surname);
}