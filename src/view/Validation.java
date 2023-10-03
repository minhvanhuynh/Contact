/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


/**
 *
 * @author This PC
 */
public class Validation {
    private final static Scanner sc= new Scanner(System.in);
    
    public int checkInputIntLimit(int min, int max){
        while(true){
            try{
                int check= Integer.parseInt(sc.nextLine().trim());
                if(check < min || check > max)
                    throw new Exception();
                else return check;             
            }catch(Exception e){
                System.out.println("Please input number in range ["+min+", "+max+"]!");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public String checkInputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Not allowed empty!");
                System.out.println("Enter again: ");
            } else {
                return string;
            }
        }
    }
    
    public String checkInputName(String name) {
        while (true) {
            System.out.print(name);
            String string = sc.nextLine().trim();
            String[] s= string.split(" ");
            if (string.isEmpty() || s.length<2) {
                System.out.println("Invalid!");               
            } else {
                return string;
            }
        }
    }
    
    public String checkPhone(String sentences){
        while(true){
            System.out.print(sentences);
            String phone= checkInputString();
            if(phone.matches("^\\d{10}") || phone.matches("^\\d{3} \\d{3} \\d{4}") || phone.matches("^\\d{3}\\.\\d{3}\\.\\d{4}")
                    || phone.matches("^\\(?\\d{3}\\)?\\-\\d{3}\\-\\d{4}")){
                return phone;
            }else{
                System.err.println("Please input Phone flow");
                System.out.println("+ 1234567890");
                System.out.println("+ 123-456-7890");
                System.out.println("+ 123-456-7890 x1234");
                System.out.println("+ 123-456-7890 ext1234");
                System.out.println("+ (123)-456-7890");
                System.out.println("+ 123.456.7890");
                System.out.println("+ 123 456 7890");
                continue;
            }
        }
    
    }
        
    
    public boolean checkInputYesNo(){
        while(true){
            String result= checkInputString();
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }
            System.out.println("Please input y/Y or n/N.");
            System.out.println("Enter again: ");
        }   
    }
    
    public int checkInputInt(String sentences){
        while(true){
            System.out.print(sentences);
            try{
                int number= Integer.parseInt(checkInputString());
                return number;
            }catch(Exception e){
                System.err.println("ID is digit!");
                continue;
            }
        }
    }
    
    
    
   
    
    
}