package com.unprecedented_shabbar;
import java.util.*;
class MyComparator implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        return -str1.compareToIgnoreCase(str2);
    }
}

public class TelephoneDirectory  {
    // CREATING MAP OBJECT REFERENCE
    Map<String, String>  map;

    public TelephoneDirectory( ) {
        //INITIALIZING MAP OBJECT INSIDE CONSTRUCTOR
        MyComparator mc = new MyComparator();
        map = new TreeMap<>(mc);
    }

    //ADDING ENTRY TO MAP...
    public void addContacts(String name, String number)
    {
        if(!map.containsKey(name)){
            map.put(name,number);
            System.out.println("1 contact added successfully");
        }
        else{
            System.out.println("phone number already exist with this name..");
        }

    }
    public void showAllContacts() {
        if (!map.isEmpty()) {
            Set<Map.Entry<String, String>> set = map.entrySet();
            Iterator<Map.Entry<String, String>> it = set.iterator();
            int index = 1;
            while (it.hasNext()) {
                Map.Entry<String, String> entry = it.next();
                System.out.println(index + ". " + entry.getKey() +
                        ".................>" + entry.getValue());
                index++;
            }
        }
        else{
            System.out.println("Your contact list is empty!!!!!!!! 😂😂😂😂.....");
        }
    }
    public void searchContact(String name)
    {
        if(map.containsKey(name)){

            System.out.println(name+" 🤣🤣🤣 , Your phone number is: "+map.get(name));
        }
        else{
            System.out.println(" 😥😥 No phone number belongs to "+name);
        }

    }
    public void deleteContact(String name){
        if(map.containsKey(name))
        {
            map.remove(name);
            System.out.println("Contact deleted successfully!!");
        }
    }
    public void updateContact(String name,String value){
        if(map.containsKey(name)){
            map.put(name,value);
            System.out.println("Contact updated successfully");
        }
        else{
            map.put(name,value);
            System.out.println("Contact added because it was not existed earlier");
        }
    }
    public void emptyAllContactList(){
        map.clear();
        System.out.println("No contact existed anymore!!!");
    }




}
