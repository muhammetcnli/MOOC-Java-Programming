/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Person {

    private String name;
    private String adress;

    public Person(String name, String adress) {

        this.adress = adress;
        this.name = name;
    }

    @Override
    public String toString() {

        return this.name + "\n" + "  " + this.adress;
    }

}
