package com.Nickode.controller;

import com.Nickode.entity.Nickey;
import com.Nickode.entity.Persons;
import com.Nickode.service.Ser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class Contr {
    private final Ser ser;

    /**
     * CRUD
     **/
    @PostMapping("/persons")
    Persons newPerson(@RequestBody Persons person) {
        return ser.save(person);
    }

    @GetMapping("/persons/id")
    Persons get(@RequestBody Nickey id) {
        return ser.find(id);
    }

    @GetMapping("/persons")
    List<Persons> getAll() {
        return ser.findAll();
    }

    @PostMapping("/personsupdate")
    Persons update(@RequestBody Persons person) {
        return ser.update(person);

    }

    @DeleteMapping("/persons/deletebyid")
    void delete(@RequestBody Nickey id) {
        ser.delete(id);
    }

    @DeleteMapping("/persons")
    void deleteAll() {
        ser.deleteAll();
    }

    /**
     * Custom
     **/
    @GetMapping("/persons/city")
    List<Persons> findByCity(@RequestParam String city) {
        return ser.findByCity(city);
    }
    @GetMapping("/persons/age")
    List<Persons> findByAge(@RequestParam int age) {
        return ser.findByAge(age);
    }
    @GetMapping("/persons/name")
    Optional<Persons> findByName(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return ser.findByName(name, surname);
    }
}
