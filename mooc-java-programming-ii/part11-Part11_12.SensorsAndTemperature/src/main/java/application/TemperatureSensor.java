/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Muhammet Canlı
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        if (!isOn) {
            this.isOn = true;
        }
    }

    @Override
    public void setOff() {
        if (isOn) {
            this.isOn = false;
        }
    }

    @Override
    public int read() {
        if (isOn) {
            
            Random rand = new Random();
            
            int range = 61;
            
            return rand.nextInt(range) + (-30);
            
        } else {
            throw new IllegalStateException("Sensor is off.");
        }
    }

}
