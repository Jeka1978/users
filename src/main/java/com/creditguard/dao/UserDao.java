package com.creditguard.dao;

import com.creditguard.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by Evegeny on 18/12/2016.
 */
public interface UserDao extends PagingAndSortingRepository<Person,Integer> {
    List<Person> findByAgeGreaterThan(int age);

}
