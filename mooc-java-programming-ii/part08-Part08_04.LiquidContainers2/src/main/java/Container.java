/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int addAmount) {
        if (addAmount < 0) {
            return;
        } else if (this.contains() + addAmount <= 100) {

            this.amount += addAmount;
        } else if (this.contains() + addAmount > 100) {
            this.amount = 100;
        } else {
            this.amount = 0;
        }
    }

    public void remove(int remove) {

        if (remove < 0) {
            return;
        } else if (this.amount - remove <= 0) {
            this.amount = 0;
        } else {
            this.amount -= remove;
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";

    }

}
