package com.sanchev.servlets;

import com.sanchev.Contact;
import com.sanchev.base.ContactService;
import com.sanchev.base.DBService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Pattern;

public class ContactServiceImpl implements ContactService {
    private final DBService dbService;

    public ContactServiceImpl(DBService dbService) {
        this.dbService = dbService;
    }

    public Collection<Contact> getFilteredContacts(String regex) {
        Collection<Contact> contacts = new ArrayList<Contact>();
        Pattern pattern = Pattern.compile(regex);
        for (Contact contact : dbService.getAllContacts()) {
            if (!pattern.matcher(contact.getName()).matches())
                contacts.add(contact);
        }
        return contacts;
    }
}