/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidencepojistenych;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ljubovregyko
 */
public class EvidencePojistenych {

    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Evidence pojistenych");
        System.out.println("-----------------------------");
        System.out.println("");
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("David" , "Capka", 33,123456789));
     //   persons.add("David Jancik 27 123456788");
        printMenu();
        Scanner console = new Scanner(System.in);
        String volba = "0";
         // hlavní cyklus

        
        int menuNum = console.nextInt();
        while (!volba.equals("!=4")) {
            // výpis možností
            if  (menuNum == 1) {
                addPerson(console, persons);
                System.out.println("");
                System.out.println("Data byla ulozena. Pokracujte libovolnou klávesou...");
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
                
                printMenu();
            } else if (menuNum == 2) {
                for(Person p: persons){
                    System.out.println( p.toString());
                }
                System.out.println("");
                System.out.println("Pokracujte libovolnou klávesou...");
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
     
                printMenu();
            } else if (menuNum == 3) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Zadejte jméno pojisteného:");
                String name = scn.nextLine();
                System.out.println("Zadejte príjmení:");
                String surname = scn.nextLine();
                

                boolean flag = true;

                for(Person person: persons){
                    if( person.name.contains(name)){
                       if(person.surname.contains(surname)){
                           System.out.println(person);
                           flag= false;
                System.out.println(""); 
                System.out.println("Pokracujte libovolnou klávesou...");
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
                console.nextLine(); // Čekáme, až uživatel stiskne Enter
                       }
                   }
                }

           if(flag) System.out.println("Žádný takový uživatel neexistuje");



                printMenu();
            } else if (menuNum == 4) {
                System.exit(4);
            }

            menuNum = console.nextInt();

        }
    }

    public static void printMenu(){
        System.out.println("Vyberte si akci\n" +
                "1 - Pridat nového pojisteného\n"+
                "2 - Vypsat vsechny pojistené\n" +
                "3 - Vyhledat pojisteného\n" +
                "4 - Konec\n");


    }

    private static void printAllPersons(String[] persons) {
        for (int i = 0; i < persons.length; i ++){
            System.out.println(persons[i] + "  ");
        }
    }

    private static void addPerson(Scanner console, List<Person> persons) {
        System.out.println("Zadejte jméno pojisteného:");
        String inputPersonName = console.next();
        System.out.println("Zadejte príjmení:");
        String inputPesonSurname = console.next();
        System.out.println("Zadejte telefonní císlo:");
        String inputPersonNumber = console.next();
        System.out.println("Zadejte vek:");
        String inputPersonAge = console.next();
persons.add(new Person(inputPersonName,inputPesonSurname,Integer.parseInt(inputPersonAge),Integer.parseInt(inputPersonNumber)));
    }
}

