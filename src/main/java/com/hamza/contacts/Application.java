package com.hamza.contacts;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ask();
    }

    public static Contact[] contacts = new Contact[10];
    public static int index = 0;

    public static void ask() {

        System.out.println("Please select an option");
        System.out.println("1-) List");
        System.out.println("2-) New Contact");
        System.out.println("3-) Search");
        System.out.println("4-) Edit");
        System.out.println("5-) Exit");
        Scanner scanner = new Scanner(System.in);
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
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Not available option!");
        }
        ask();
    }

    public static void list() {

        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i]);
        }
    }

    public static void addContact() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = input.next();
        System.out.println("Enter Last Name");
        String lastName = input.next();
        System.out.println("Enter Company");
        String company = input.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = input.next();
        System.out.println("Enter Email");
        String email = input.next();
        System.out.println("Enter URL ");
        String url = input.next();
        System.out.println("Enter Address");
        String address = input.next();
        System.out.println("Enter birthday");
        String birthday = input.next();

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

        contacts[index] = contact;
        index++;

    }


    public static void searchContact() {

        Scanner input = new Scanner(System.in);
        System.out.println("Search Contact");
        String search = input.next();
        int count=0;
        for (int i = 0; i < contacts.length; i++) {
            Contact contact = contacts[i];
            if (contact!=null && search.equals(contact.getFirstName())) {
                System.out.println(contact.toString());
                count++;
            }
        }

        if (count==0) {
            System.out.println("Match Not Found");
        }else{
            System.out.println(count+" contacts found.");
        }


    }





}