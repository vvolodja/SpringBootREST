package net.vladimir.test_project.services;

import net.vladimir.test_project.dao.ContactRepository;
import net.vladimir.test_project.models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    List<Contact> contacts;

    public List<Contact> findAll(){
        contacts = repository.findAll();
        return contacts;

    }
}
