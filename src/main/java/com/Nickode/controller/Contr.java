package com.Nickode.controller;

import com.Nickode.entity.Persons;
import com.Nickode.service.Ser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Contr {
    private final Ser ser;
    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam String city) {
        return ser.getPersonsByCity(city);
    }
}
