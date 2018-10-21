/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brnproject;

/**
 *
 * @author BARON
 */
public class Person {
    protected static String firstName;
    protected static String lastName;
    protected static int age;
    protected static String statut;
    protected static String profession;
    protected static String tuition;
    
    // ##### GETTERS #####
    public static String getFirstName(){return firstName;}
    public static String getLastName(){return lastName;}
    public static int getAge(){return age;}
    public static String getStatut(){return statut;}
    public static String getProfession(){return profession;}
    public static String getTuition(){return tuition;}
    
    // ##### SETTERS #####
    public static void setFirstName(String newFirstName){firstName = newFirstName;}
    public static void setLastName(String newLastName){lastName=newLastName;}
    public static void setAge(int newAge){age = newAge;}
    public static void setStatut(String newStatut){statut=newStatut;}
    public static void setProfession(String newProfession){profession=newProfession;}
    public static void setTuition(String newTuition){tuition=newTuition;}

    
}
