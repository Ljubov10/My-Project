/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojistenych;

/**
 *
 * @author ljubovregyko
 */
class Person {
    
    public String name;
    public String surname;
    int age;
    int telefone;
    private final int number;


    public Person(String name, String surname, int age, int number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "  "+ surname + "  " + age + "  "+ number ;
    }
}
