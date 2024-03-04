package com.course.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.course.model.Person;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Fiding one person");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Thiago");
        person.setLastName("Torres");
        person.setAddress("Iguatu - Ceara - Brasil");
        person.setGender("Male");

        return person;
    }

}
