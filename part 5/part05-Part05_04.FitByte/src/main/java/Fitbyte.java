/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammet Canlı
 */
public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {

        double maximum = 206.3 - (0.711 * this.age);
        
        double target = (maximum - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
                
                
        return target;
    }

}
