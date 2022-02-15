package com.unprecedented_shabbar;
import java.util.*;
public class Tester {
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        TelephoneDirectory tel = new TelephoneDirectory();
        System.out.println("=====================================");
        System.out.println("WELCOME TO MY PHONE DIRECTORY APPLICATION");
        System.out.println();
        System.out.println("=========================================");
        int choice;
        while(true){
            System.out.print("CHOOSE:\n");
            System.out.println("1. FOR ADDING CONTACTS................");
            System.out.println("2. FOR UPDATING CONTACTS...............");
            System.out.println("3. FOR SHOWING  CONTACTS..............");
            System.out.println("4. FOR DELETING CONTACT...............");

            System.out.println("5. FOR SEARCHING CONTACTS............");
            System.out.println("6. FOR EMPTYING CONTACT LIST.............");
            System.out.println("7. TO EXIT...........................");
            System.out.println("YOUR OPTION IS  ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter name and number\n");
                    String my_name = sc.next();
                    String my_number = sc.next();
                    tel.addContacts(my_name,my_number);
                    break;

                case 2:
                    System.out.println("enter name and number\n");
                    String my_name1 = sc.next();
                    String my_number1 = sc.next();
                    tel.updateContact(my_name1,my_number1);
                    break;

                case 3:
                    tel.showAllContacts();
                    break;
                case 4:
                    System.out.println("enter name \n");
                    String my_name2 = sc.next();
                    tel.deleteContact(my_name2);
                    break;

                case 5:
                    System.out.println("enter name \n");
                    String my_name3 = sc.next();
                    tel.searchContact(my_name3);
                    break;
                case 6:

                    tel.emptyAllContactList();
                    break;
                case 7:
                    System.out.println("***THANKS FOR USING PHONE DIRECTORY APP**");
                    System.exit(0);
                    break;
                case 8:
                    System.out.println("Invalid input ..kindly give value 1,2,3,4,5,6,7");
                    break;
            }

        }
    }
}
