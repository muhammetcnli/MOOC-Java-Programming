/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Muhammet Canlı
 */
public class StandardSensor implements Sensor{
    
    private int value;
    
    public StandardSensor(int value){
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        
        return this.value;
    }
    
    
}
