package com.blimart.graphql.query;

import com.blimart.graphql.entity.Person;
import com.blimart.graphql.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * @author goldwin.japar
 */
@Component
public class PersonQuery implements GraphQLQueryResolver {

    @Autowired
    private PersonService personService;

    public List<Person> getPersons(final int count) {
        return this.personService.getAllPersons(count);
    }

    public Optional<Person> getPerson(final int id) {
        return this.personService.getPerson(id);
    }
}
