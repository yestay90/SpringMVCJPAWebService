package com.growit.org;

import com.growit.org.domain.Contact;
import com.growit.org.service.ContactService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by ymuratov on 12/19/14.
 */
public class main {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:config/app-context.xml");
        ctx.refresh();


        ContactService contactService = ctx.getBean( "jpaContactService", ContactService.class);
// List contacts without details
        List<Contact> contacts = contactService.findAll();
        listContacts(contacts);
    }
    private static void listContacts(List<Contact> contacts) { System.out.println("");
        System.out.println("Listing contacts without details:"); for (Contact contact: contacts) {
            System.out.println(contact);
            System.out.println(); }
    }
}
