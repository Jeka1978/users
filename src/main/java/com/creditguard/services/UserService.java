package com.creditguard.services;

import com.creditguard.dao.UserDao;
import com.creditguard.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Evegeny on 18/12/2016.
 */
//@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public List<Person> findByAgeGreaterThan(int age) {
        return userDao.findByAgeGreaterThan(age);
    }

    @Transactional
    public void saveUser(Person person) {
        userDao.save(person);
    }
}
