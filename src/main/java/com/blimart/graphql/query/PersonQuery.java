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
/**
 * Query or Mutation objects are root GraphQL objects.
 * They don’t have any associated data class. In such cases,
 * the resolver classes would implement GraphQLQueryResolver or GraphQLMutationResolver.
 * These resolvers will be searched for methods that map to fields in their respective root types.
 */
@Component public class PersonQuery implements GraphQLQueryResolver {

    @Autowired private PersonService personService;

    public List<Person> getPersons(final int count) {
        return this.personService.getAllPersons(count);
    }

    public Optional<Person> getPerson(final int id) {
        return this.personService.getPerson(id);
    }
}
