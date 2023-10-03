/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManagerContact;
import view.Menu;

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "Contact Program";
        String[] s= new String[] {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};
        Menu<String> menu= new ManagerContact(title, s);
        menu.run();
    }
}
