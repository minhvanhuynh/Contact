/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.ListContact;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManagerContact extends Menu<String>{
    
    private ListContact list_contact= new ListContact();
    
    public ManagerContact(String title, String[] s){
        super(title,s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list_contact.addContact();
                break;
            case 2:
                list_contact.displayContact();
                break;
            case 3:
                list_contact.delete();
                break;
            case 4:
                System.exit(0);
        }
    }
    
}
