package com.blimart.graphql.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author goldwin.japar
 */
@Data
@EqualsAndHashCode
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name", nullable = false)
    private String personName;

    @Column(name = "job")
    private String job;

    @Column(name = "salary")
    private String salary;
}
