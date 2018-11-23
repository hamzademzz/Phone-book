package com.hamza.contacts;

import java.util.Scanner;

public class ContactService {

    public int index = 0;
    private Contact[] contacts = new Contact[10];
    int n=10;
    private Contact[] updatedContacts=new Contact[n-1];


    Scanner scanner = new Scanner(System.in);
    public void askOperation() {

        System.out.println("Please select an option");
        System.out.println("1-) List");
        System.out.println("2-) New Contact");
        System.out.println("3-) Search");
        System.out.println("4-) Edit");
        System.out.println("5-) Delete Contact");
        System.out.println("6-) Exit");

        Integer selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1:
                list();
                break;
            case 2:
                addContact();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                editContact();
                break;
            case 5:
                deleteContact();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Not available option!");
        }
        askOperation();
    }

    public void list() {

        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }

    public Contact createOrUpdateContact() {
        System.out.println("Enter First Name");
        String firstName = scanner.next();
        System.out.println("Enter Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Company");
        String company = scanner.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.next();
        System.out.println("Enter Email");
        String email = scanner.next();
        System.out.println("Enter URL ");
        String url = scanner.next();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter birthday");
        String birthday = scanner.next();

        Contact contact = new Contact();
        contact.setId(index);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setCompany(company);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contact.setUrl(url);
        contact.setAddress(address);
        contact.setBirthday(birthday);

        return contact;
    }

    public void addContact() {
        Contact contact = createOrUpdateContact();
        contacts[index] = contact;
        index++;
    }


    public void searchContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Search Contact");
        String search = input.next();
        int count = 0;
        for (int i = 0; i < contacts.length; i++) {
            Contact contact = contacts[i];
            if (contact != null && search.equals(contact.getFirstName())) {
                System.out.println(contact.toString());
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Match Not Found");
        } else {
            System.out.println(count + " contacts found.");
        }

    }


    public void editContact() {
        System.out.println("Enter Id of Contact to Edit: ");
        Integer id = scanner.nextInt();
        Contact contact = createOrUpdateContact();
        contacts[id] = contact;
    }


    public void deleteContact(){
        System.out.println("Enter the Contact to delete");
        Integer id = scanner.nextInt();

        int count=0;
        for (int i=0; i<contacts.length; i++){
            if (!contacts[i].equals(id) ){
                count++;
                updatedContacts[count-1]=contacts[i];
            }
        }

        for (int i=0; i<count; i++){
            System.out.println(updatedContacts[i]);
        }








    }

}
