package com.hamza.contacts;

import java.util.Scanner;

public class Application{
    public static void main(String[] args){




        ask();


    }

    public static Contact[] contacts=new Contact[];
    public static  int index=0;

    public static void ask(){
        System.out.println("Please select an option");
        System.out.println("1-) List");
        System.out.println("2-) New Contact");
        System.out.println("3-) Search");
        System.out.println("4-) Edit");
        Scanner scanner=new Scanner(System.in);
        Integer selectedOption=scanner.nextInt();
        switch (selectedOption){
            case 1:list(); break;
            default:
                System.out.println("Not available option!");
                ask();
        }
    }

    public static void list(){
        System.out.println("List of Contacts");
    }

    public static void addContact(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=input.next();
        System.out.println("Enter Last Name");
        String lastName=input.next();
        System.out.println("Enter Company");
        String company=input.next();
        System.out.println("Enter Phone Number");
        String phoneNumber=input.next();
        System.out.println("Enter Email");
        String email=input.next();
        System.out.println("Enter URL ");
        String url=input.next();
        System.out.println("Enter Address");
        String address=input.next();
        System.out.println("Enter birthday");
        String birthday=input.next();

        Contact contact=new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setCompany(company);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
        contact.setUrl(url);
        contact.setAddress(address);
        contact.setBirthday(birthday);

        contacts[index]=contact;
        index++;

    }





}