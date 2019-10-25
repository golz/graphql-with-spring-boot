package com.blimart.graphql.service;

import com.blimart.graphql.entity.Person;
import com.blimart.graphql.repository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author goldwin.japar
 */
@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public Person createPerson(final String name, final String job, final BigDecimal salary) {
        final Person person = new Person();
        person.setName(name);
        person.setJob(job);
        person.setSalary(salary);
        return this.personRepository.save(person);
    }

    @Transactional(readOnly = true)
    public List<Person> getAllPersons(final int count) {
        return this.personRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Person> getPerson(int id) {
        return this.personRepository.findById(id);
    }
}
