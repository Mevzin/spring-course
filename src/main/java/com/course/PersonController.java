package com.course;

import org.springframework.web.bind.annotation.RestController;

import com.course.exceptions.UnsupportedMathOperationException;
import com.course.model.Person;
import com.course.services.PersonServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServices service;
    // private static final String template = "Hello, %s!";
    // private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id") String id) throws Exception {

        return service.findById(id);
    }
}
