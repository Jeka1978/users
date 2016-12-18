package com.creditguard.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Evegeny on 18/12/2016.
 */
@Data
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    private int age;




}
