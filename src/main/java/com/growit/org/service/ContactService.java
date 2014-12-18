package com.growit.org.service;

import com.growit.org.domain.Contact;

import java.util.List;

/**
 * Created by ymuratov on 12/19/14.
 */
public interface ContactService {

    // Find all contacts
    public List<Contact> findAll();
    // Find all contacts with telephone and hobbies
    public List<Contact> findAllWithDetail();
    // Find a contact with details by id

    public Contact findById(Long id);
    // Insert or update a contact
    public Contact save(Contact contact);
    // Delete a contact
    public void delete(Contact contact);
}
