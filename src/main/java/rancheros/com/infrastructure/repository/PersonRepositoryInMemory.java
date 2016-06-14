package rancheros.com.infrastructure.repository;

import rancheros.com.domain.Person;
import rancheros.com.domain.PersonRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 11/06/2016.
 */
public class PersonRepositoryInMemory implements PersonRepository {

    private List<Person> personList = new ArrayList<>();

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public Person findById(String id) {
        return null;
    }

    @Override
    public Person create(Person person) {
        return null;
    }
}