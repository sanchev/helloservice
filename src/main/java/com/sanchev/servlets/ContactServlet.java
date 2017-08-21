package com.sanchev.servlets;

import com.google.gson.Gson;
import com.sanchev.Contact;
import com.sanchev.base.ContactService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class ContactServlet extends HttpServlet {
    private final ContactService contactService;

    public ContactServlet(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameFilter = request.getParameter("nameFilter");

        Collection<Contact> contacts = contactService.getUsers(nameFilter);
        if (contacts != null && !contacts.isEmpty()) {
            String json = new Gson().toJson(contacts);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
            response.getWriter().flush();
            response.setStatus(HttpServletResponse.SC_OK);
        } else
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }
}