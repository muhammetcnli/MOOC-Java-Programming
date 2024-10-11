/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Timer {

    private ClockHand hunderedthSecond;
    private ClockHand second;

    public Timer() {
        this.hunderedthSecond = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance() {

        if (this.hunderedthSecond.value() >= 99) {
            this.second.advance();
            if (this.second.value() >= 60) {
                this.second = new ClockHand(60);
            }

            
            
        }

        this.hunderedthSecond.advance();

    }

    public String toString() {

        return this.second + ":" + this.hunderedthSecond;
    }

}
