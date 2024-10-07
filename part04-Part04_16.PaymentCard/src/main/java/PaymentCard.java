/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        double affordable = 2.60;
        if (this.balance >= affordable) {
            this.balance = this.balance - affordable;
        }

    }

    public void eatHeartily() {
        double healty = 4.60;
        if (this.balance >= healty) {
            this.balance = this.balance - healty;
        }
    }

    public void addMoney(double amount) {
        if (!(amount < 0)) {
            if (this.balance + amount <= 150) {
                this.balance = this.balance + amount;
            } else{
                this.balance = 150.0;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
