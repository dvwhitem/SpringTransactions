package com.home.springtransaction;

import com.home.springtransaction.domain.Contact;
import com.home.springtransaction.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by vitaliy on 27.03.15.
 */
public class TxAnnotationSample {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:tx-annotation-app-context.xml");
        context.refresh();

        ContactService contactService = context.getBean("contactService", ContactService.class);

        List<Contact> contacts = contactService.findAll();

        for (Contact contactTemp: contacts) {
            System.out.println(contactTemp);
        }
    }
}
