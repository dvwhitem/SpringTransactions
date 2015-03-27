package com.home.springtransaction.repository;

import com.home.springtransaction.domain.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vitaliy on 26.03.15.
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {

//    @Query("select count(c) from Contact c")
//    public Long countAllContacts();
}
