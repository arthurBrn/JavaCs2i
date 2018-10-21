package brnproject;

import java.util.Scanner;

/**
 * Creation date: 29/09/2018 for about an hour or more 
 * @author BARON
 * This programm only purpos is to practice classes and objects in java in order to learn more
 * 
 * The class BrnProject use the class Person.java in which we created getters, setters and attribute of a typical humain being
 */
public class BrnProject {
    //We declare static variable, so classes variables :
static Scanner output=new Scanner(System.in);

static String answer=""; //Use to store the input of the user in the methods : decision(), isStudent() and isWorker();
static String wors;      //Use to store the input of the user in the method : workerOrStudent();
static boolean creation=false; //Use in the while of the method decision(); in order to end or not the while loop according to the user input conformity
static boolean display=false;  //Use in the methods isWorker(); and isStudent(); one more in the whiles loops to know the user input conformity
static boolean ws=false; //Use to end the while loop in isWorkerOrStudent() method;
static Person learner = new Person(); //Creation of a new instance of the object Person named learner set as static to be used in several methods;
static Person worker = new Person();  //Creation of a new instance of the object Person named worker set as static to be used in several methods;
    
/*
* OK, now we're gonna declare the variable of class we'll use for the programm regarding the english test !
*/

static String[] tabQ;
static int nbrQuestions;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        decision(); //Call of the method decision();    
        
        firstPartTest();
       
    
    }
    
    
    
    public static void firstPartTest(){
        System.out.println("You'll now enter the second part of the program. You are free to leave now if you want."
                + "If however you chose to go forward with the test, you'll have to finish it.");
        System.out.println("Do you want to start the test ?");
        answer=output.nextLine();
        
        if(answer.startsWith("y")){
            exam();
        }
        else if(answer.startsWith("n")){
        System.out.println("Alright, have a good evenning");
        }
        else{
            System.out.println("Wrong answer, try again.");
        }
    }
    
    public static void exam(){
        System.out.println("################################");
        System.out.println("##### ENGLISH EXAM - BEGIN #####");
        System.out.println("################################");
        
        /*for(int i=0;i<;i++){
            
        }*/
        
        
        
        
    }
    
    
    
    /*
    * #####################################
    * ########## DECISION METHOD ##########
    * #####################################
    */
    public static void decision(){ //Creation of the method decision();
        do{ //Start of a do while loop;
        System.out.println("Do you want to create a person? (yes/no)"); // Ask the user wether or not he wants to create a person;
        answer = output.nextLine(); //We store the user input into the String variable 'answer' decare in static above;
            if(answer.startsWith("y")){ //We verify that the answer start with an 'y' (this program isn't about regex so this verifications will do fine);
                creation=true; //If it does, we set creation as true to end the while loop;
                System.out.println("LET'S GET THIS PARTY STARTED! "); System.out.println(); //We launch the party of course!
                workerOrStudent(); //We call the method workerOrStudent declared down below
            }
            
            else if(answer.startsWith("n")){ //If the answer start with an "n" (implied no);
                creation=true; //Then we set creation as true to end the do while loop;
                System.out.println("Ok, you're off the hook young fella"); // and we let the young fella go back to his occupations;
            }
            else{ //If the input do not respect one of those two conditions, we start the while loop once more by setting creation as false;
                creation=false; System.out.println("Nop, try again");
            }
        }while(creation==false);
    }
    
    
    
    
    /*
    * ##############################################
    * ########## workerOrStudent() METHOD ##########
    * ##############################################
    */
    
    /*Creation of workerOrStudent() method
    * Purpos of this method is to see wether the user is creating a student or a worker (as there is only those two possibilities for now;
    * We'll add comment to the rest of the methods tomorrow morning, happy to work and learn one more !!!!! (;)
    */
    public static void workerOrStudent(){
        do{
            System.out.println("Is your person a worker or a student ? (sutdent/worker)");
            wors=output.nextLine();
                if(wors.startsWith("s")){
                    ws=true;
                    isStudent();
                }
                else if(wors.startsWith("w")){
                    ws=true;
                    isWorker();
                }
                else{ws = false;}
        }while(ws==false);
    }
    
    
    /*
    * ########################################
    * ########## ISSTUDENT() METHOD ##########
    * ########################################
    */
    public static void isStudent(){
        studentCreation(learner);
            do{
                System.out.println("Do you want to display the person you just created ? (yes/no)");
                answer=output.nextLine();
                    if(answer.startsWith("y")){display=true; displayStudent(learner);}
                    else if(answer.startsWith("n")){display=true;System.out.println("Shame, ok then.");
                    }
                    else{display=false;System.out.println("Wrong answer, try again.");
                    }
            }while(display==false);
    }
    
    /*
    * #######################################
    * ########## ISWORKER() METHOD ##########
    * #######################################
    */
    public static void isWorker(){
        workerCreation(worker);
                    do{
                       System.out.println("Do you want to see the person you just created?(yes/no)");
                       answer=output.nextLine();
                       if(answer.startsWith("y")){display=true; displayWorker(worker);}
                       else if(answer.startsWith("n")){display=true;System.out.println("Shame, ok then.");}
                       else{display=false;System.out.println("Wrong answer, try again");}
                    }while(display==false);
    }
            
        
 
    
    
    public static void studentCreation(Person persona){
        System.out.println(" ############################");
        System.out.println(" ##### STUDENT CREATION #####");
        System.out.println(" ############################");
        System.out.println("");
        System.out.println("First name : ");    persona.setFirstName(output.nextLine());
        System.out.println("Last name : ");     persona.setLastName(output.nextLine());
        System.out.println("Age (numbers) : "); persona.setAge(output.nextInt()); output.nextLine();
        System.out.println("Tuition : ");       persona.setTuition(output.nextLine());
    }
    
    public static void displayStudent(Person persona){
        System.out.println(" ###########################");
        System.out.println(" ##### STUDENT DISPLAY #####");
        System.out.println(" ###########################");
        System.out.println("");
        System.out.println("First name : "+ persona.getFirstName());
        System.out.println("Last name : " + persona.getLastName());
        System.out.println("Age : "       + persona.getAge());
        System.out.println("Tuition :    "+ persona.getTuition());
        System.out.println("########## END ##########");
    }
    
    public static void workerCreation(Person persona){
        System.out.println(" ###########################");
        System.out.println(" ##### WORKER CREATION #####");
        System.out.println(" ###########################");
        System.out.println("");
        System.out.println("First name : "); persona.setFirstName(output.nextLine());
        System.out.println("Last name : ");  persona.setLastName(output.nextLine());
        System.out.println("Age : ");        persona.setAge(output.nextInt()); output.nextLine();
        System.out.println("Work : ");       persona.setProfession(output.nextLine());
    }
    
    public static void displayWorker(Person persona){
        System.out.println(" ##########################");
        System.out.println(" ##### WORKER DISPLAY #####");
        System.out.println(" ##########################");
        System.out.println("");
        System.out.println("First name : "+ persona.getFirstName());
        System.out.println("Last name : " + persona.getLastName());
        System.out.println("Age : "       + persona.getAge());
        System.out.println("Work : "      + persona.getProfession());
    }
    
}
