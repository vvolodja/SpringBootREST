package net.vladimir.test_project.dao;


import net.vladimir.test_project.models.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {

    List<Contact> findAll();

}
