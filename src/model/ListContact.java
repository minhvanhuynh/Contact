/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import view.Validation;

/**
 *
 * @author This PC
 */
public class ListContact {
    private ArrayList<Contact> list;
    private Validation validation;
    
    public ListContact(){
        list= new ArrayList<>();
        validation= new Validation();
    }
    
    public void addContact(){
        System.out.println("-------- Add a Contact --------");
        while(true){
            String name= validation.checkInputName("Enter Full Name: ");
            System.out.print("Enter Group: ");
            String group= validation.checkInputString();
            System.out.print("Enter Address: ");
            String address= validation.checkInputString();
            String phone= validation.checkPhone("Enter Phone: ");
            Contact contact= new Contact(list.size()+1, name, group, address, phone, name.split(" ")[1],  name.split(" ")[0]);
            list.add(contact);
            System.out.println("Successful!");
            System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
            if(!validation.checkInputYesNo()){
                return;
            }
        }
    }
    
    public void displayContact(){
        if(list.isEmpty()){
            System.err.println("List is Empty!");
            return;
        }
        System.out.println("----- Display all Contact -----");
        System.out.println("ID    Name         First Name     Last Name     Group     Address     Phone");
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }
    
    public void delete(){
        System.out.println("----- Delete a Contact -----");     
        int id= validation.checkInputInt("Enter ID: ");
        Contact find_contact= findIdExist(id);
        if(find_contact!=null){
            list.remove(find_contact);
            System.out.println("Deleted Successful!");
        }else{
            System.err.println("No found contact!");
        }
    }
    
    public Contact findIdExist(int id){
        Contact find_contact= null;
        for (Contact contact : list) {
            if(contact.getID()==id){
                find_contact= contact;
            }
        }
        return find_contact;
    }
    
    
}
