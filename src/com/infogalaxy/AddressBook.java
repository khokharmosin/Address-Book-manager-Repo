package com.infogalaxy;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactlist = new ArrayList<>();

    public void getcontact() {
        Contact contact = new Contact();
        System.out.println("Enter The First Name ; ");
        contact.setFirstName(sc.next());
        System.out.println("Enter The Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter The City Name : ");
        contact.setCity(sc.next());
        System.out.println("Enter The State Name : ");
        contact.setState(sc.next());
        System.out.println("Enter The Mobile No : ");
        contact.setMobno(sc.next());
        System.out.println("Enter The Email ID : ");
        contact.setEmail(sc.next());
        System.out.println("Enter The Zip Code : ");
        contact.setZipCode(sc.next());
        contactlist.add(contact);
    }

    public void showcontact() {
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            System.out.println(contact.toString());
        }
    }

    public void editcontact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Name : ");
        String fname = sc.next();
        int temp = 0;
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (fname.equals(contact.getFirstName())) {
                System.out.println("Contact Is Found..");
                temp = 1;
                System.out.println("Enter The Last Name : ");
                contact.setLastName(sc.next());
                System.out.println("Enter The Address : ");
                contact.setAddress(sc.next());
                System.out.println("Enter The City Name : ");
                contact.setCity(sc.next());
                System.out.println("Enter The State Name : ");
                contact.setState(sc.next());
                System.out.println("Enter The Mobile No : ");
                contact.setMobno(sc.next());
                System.out.println("Enter The Email ID : ");
                contact.setEmail(sc.next());
                System.out.println("Enter The Zip Code : ");
                contact.setZipCode(sc.next());
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Contact Is Not Found..");
        }
    }

    public void setState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You Want To Search State Name : ");
        String sname = sc.next();
        int total = 0;
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (sname.equalsIgnoreCase(contact.getState())) {
                System.out.println(contact.getMobno());
                System.out.println(contact.getFirstName());
                total = total + 1;
            }
        }
        System.out.println("Total Contact Having Same State Name Is : " + total);
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Delete Name : ");
        String delete = sc.next();
        for (int i = 0; i < contactlist.size(); i++) {
            Contact contact = contactlist.get(i);
            if (delete.equals(contact.getFirstName())) {
                contactlist.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("***ADDRESS BOOK MANAGER***");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. SERACH STATE \n5. DELETE CONTACT \n6. EXIT");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.getcontact();
                    break;
                case 2:
                    addressBook.showcontact();
                    break;
                case 3:
                    addressBook.editcontact();
                    break;
                case 4:
                    addressBook.setState();
                    break;
                case 5:
                    addressBook.deleteContact();
                    break;
            }
        } while (choice != 6);
    }
}
