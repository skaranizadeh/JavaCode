package dev.moj;

public class MobilePhone {

    private String myNumber;
    private java.util.ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new java.util.ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) < 0) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)) {
                return myContacts.indexOf(myContacts.get(i));
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) >= 0) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s%n", i+1, myContacts.get(i).getName(),  myContacts.get(i).getPhoneNumber());
        }
    }
}
