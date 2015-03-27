package com.home.springtransaction;

import com.home.springtransaction.domain.Contact;
import com.home.springtransaction.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by vitaliy on 27.03.15.
 */
public class TxDeclarativeSample {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:tx-declarative-app-context.xml");
        context.refresh();

        ContactService contactService = context.getBean("contactService", ContactService.class);
        // Testing method findAll()
        List<Contact> contacts = contactService.findAll();

        for(Contact contact: contacts) {
            System.out.println(contact);
        }

        // Testing method save()
        Contact contact = contactService.findById(1l);
        contact.setFirstName("Alex");
        contactService.save(contact);
        System.out.println("Contact saved successfully: " + contact);

        // Testing method countAll()
        System.out.println("Count: " + contactService.countAll());
    }
}
