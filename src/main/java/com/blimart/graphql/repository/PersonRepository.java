package com.blimart.graphql.repository;

import com.blimart.graphql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author goldwin.japar
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
