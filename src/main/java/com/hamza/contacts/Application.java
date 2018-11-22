package com.hamza.contacts;

import java.util.Scanner;

public class Application{
    public static void main(String[] args){

        ask();

    }

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
}