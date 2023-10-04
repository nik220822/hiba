package com.Nickode.repository;

import com.Nickode.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Rep {
    @PersistenceContext
    private EntityManager entityManger;
    public List<Persons> getPersonsByCity(String city) {
        var query = entityManger.createNativeQuery("SELECT * FROM NickDB.persons WHERE persons.city_of_living = :city", Persons.class);
        query.setParameter("city", city);
        return query.getResultList();
    }
}