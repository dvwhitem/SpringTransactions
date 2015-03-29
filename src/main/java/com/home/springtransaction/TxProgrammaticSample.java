package com.home.springtransaction;

import com.home.springtransaction.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by vitaliy on 29.03.15.
 */
public class TxProgrammaticSample {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:tx-programmatic-app-context.xml");
        context.refresh();

        ContactService contactService = context.getBean("contactService", ContactService.class);

        System.out.println("Contact count: " + contactService.countAll());
    }
}
