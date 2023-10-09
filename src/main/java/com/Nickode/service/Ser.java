package com.Nickode.service;

import com.Nickode.entity.Nickey;
import com.Nickode.entity.Persons;
import com.Nickode.exception.NotFoundPers;
import com.Nickode.repository.JPArep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Ser {
    private final JPArep jparep;

    /**
     * CRUD
     **/
    public Persons save(Persons person) {
        return jparep.save(person);
    }

    public Persons find(Nickey id) {
        if (jparep.existsById(id)) {
            return jparep.findById(id).get();
        } else {
            throw new NotFoundPers(id);
        }
    }

    public List<Persons> findAll() {
        return jparep.findAll();
    }

    public Persons update(Persons person) {
        Nickey id = person.getPersonId();
        if (jparep.existsById(id)) {
            jparep.deleteById(id);
            return jparep.save(person);
        } else {
            throw new NotFoundPers(id);
        }
    }

    public void delete(Nickey id) {
        if (jparep.existsById(id)) {
            jparep.deleteById(id);
        } else {
            throw new NotFoundPers(id);
        }
    }

    public void deleteAll() {
        jparep.deleteAll();
    }

    public List<Persons> findByCity(String city) {
        return jparep.findByCityOfLiving(city);
    }

    public List<Persons> findByAge(int age) {
        return jparep.findByPrimaryKeyAgeLessThanOrderByPrimaryKeyAgeAsc(age);
    }

    public Optional<Persons> findByName(String name, String surname) {
        return jparep.findByPrimaryKeyNameAndPrimaryKeySurname(name, surname);
    }
}
