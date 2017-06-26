package net.vladimir.test_project.controllers;

import net.vladimir.test_project.models.Contact;
import net.vladimir.test_project.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello! It's me :)";
    }

    @RequestMapping(value = "/contacts")
    @ResponseBody
    public  List<Contact> getContacts() {
        List<Contact> contactList = contactService.findAll();

        return contactList;
    }
}
