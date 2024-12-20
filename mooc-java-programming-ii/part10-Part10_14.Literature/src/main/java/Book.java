/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Book {

    private String name;
    private int ageRec;

    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeRec() {
        return ageRec;
    }

    public void setAgeRec(int ageRec) {
        this.ageRec = ageRec;
    }

    public String toString() {

        return this.name + " (recommended for " + this.ageRec + " year-olds or older)";
    }
}
