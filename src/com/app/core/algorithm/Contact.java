package com.app.core.algorithm;

import java.util.Objects;

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){return this.name;}

    public String getPhoneNumber(){return this.phoneNumber;}

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(getName(), contact.getName()) && Objects.equals(getPhoneNumber(), contact.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhoneNumber());
    }
}
