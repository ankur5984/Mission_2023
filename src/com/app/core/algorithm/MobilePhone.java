package com.app.core.algorithm;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    // write code here
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            return Boolean.FALSE;
        }
        this.myContacts.add(contact);
        return Boolean.TRUE;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){

            int index = findContact(oldContact);
            if(index >= 0){
                this.myContacts.set(index, newContact);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;


    }

    public boolean removeContact(Contact contact){
        int index = findContact(contact);
        if(index >= 0){
            this.myContacts.remove(contact);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }


    private int  findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }


//    private int findContact(String name) {
//        for (int i = 0; i < myContacts.size(); i++) {
//            Contact contact = myContacts.get(i);
//            if (contact.getName().equals(name)) {
//                return i; // Contact found
//            }
//        }
//        return -1; // Contact not found
//    }


    public int findContact(String contactName) {
        int index = 0;
        for(Contact contact: this.myContacts){
            if(contact.getName().equals(contactName)){
                index =  findContact(contact);
                break;
            }else{
                continue;
            }
        }
        return index;
    }

    public Contact queryContact(String name){
        int pos = findContact(name);
        return (pos >= 1)? this.myContacts.get(pos):null;
    }

    public void printContacts(){
        int index = 1;
        System.out.println("Contact List:");
        for(Contact contact : this.myContacts){
            System.out.println(index + ". "+ contact.getName() + " -> "+ contact.getPhoneNumber());
        }
    }
    
}
