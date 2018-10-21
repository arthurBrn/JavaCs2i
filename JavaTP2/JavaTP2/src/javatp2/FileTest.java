/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp2;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Utilisateur
 */
public class FileTest {
    //Tests sur linked list
    
    Scanner input = new Scanner(System.in);
    
    String nom;
    int age;
    
    public String getNom(){ return nom;}
    public int getAge(){return age; }
    
    public void setNom(String unNom){nom=unNom;}
    public void setAge(int nAge){age = nAge;}
    
    public void entered(){
        System.out.println("Entre nom : ");
        setNom(input.nextLine());
        
        System.out.println("Entre age : ");
        setAge(input.nextInt());
        
        
    }
    
    public static void main(String[] args){
             
        FileTest bla = new FileTest();
        
        bla.entered();
        
        System.out.println("Nom : " + bla.getNom());
        System.out.println("Age : " + bla.getAge());
    }
}
