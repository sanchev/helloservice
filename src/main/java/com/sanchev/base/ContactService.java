package com.sanchev.base;

import com.sanchev.Contact;

import java.util.Collection;

public interface ContactService {
    Collection<Contact> getFilteredContacts(String regex);
}