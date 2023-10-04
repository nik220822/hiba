package com.Nickode.service;

import com.Nickode.entity.Persons;
import com.Nickode.repository.Rep;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class Ser {
    private final Rep rep;

    public List<Persons> getPersonsByCity(String city) {
        return rep.getPersonsByCity(city);
    }
}
