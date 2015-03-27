package com.home.springtransaction.service;

import com.home.springtransaction.domain.Contact;

import java.util.List;

/**
 * Created by vitaliy on 26.03.15.
 */
public interface ContactService {

    public List<Contact> findAll();

    public Contact findById(Long id);

    public Contact save(Contact contact);

    public long countAll();
}
