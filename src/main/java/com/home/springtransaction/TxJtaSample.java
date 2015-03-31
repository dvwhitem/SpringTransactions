package com.home.springtransaction;

import com.home.springtransaction.domain.Contact;
import com.home.springtransaction.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vitaliy on 31.03.15.
 */
public class TxJtaSample {

    public static void main(String[] args) throws ParseException {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:tx-jta-app-context.xml");
        context.refresh();

        ContactService contactService = context.getBean("contactService", ContactService.class);

        Contact contact = new Contact();
        contact.setFirstName("Frank");
        contact.setLastName("Richardson");
        contact.setBirthDate(new Date());
        contactService.save(contact);
        System.out.println("Contact saved.");
    }
}
