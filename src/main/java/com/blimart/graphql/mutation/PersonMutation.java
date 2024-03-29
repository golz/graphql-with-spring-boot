package com.blimart.graphql.mutation;

import com.blimart.graphql.entity.Person;
import com.blimart.graphql.service.PersonService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author goldwin.japar
 */
@Component
public class PersonMutation implements GraphQLMutationResolver {

    @Autowired
    private PersonService personService;

    public Person createPerson(final String personName, final String job, final String salary) {
        return this.personService.createPerson(personName, job, salary);
    }

}
