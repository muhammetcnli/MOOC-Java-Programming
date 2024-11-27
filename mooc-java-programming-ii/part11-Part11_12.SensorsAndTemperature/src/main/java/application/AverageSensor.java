/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muhammet Canlı
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> aver;

    public AverageSensor() {

        this.sensors = new ArrayList<>();
        this.aver = new ArrayList<>();

    }

    @Override
    public boolean isOn() {
        boolean isOn = false;

        for (Sensor e : sensors) {
            if (e.isOn() == true) {
                isOn = true;
            } else {
                isOn = false;
                break;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {

        for (Sensor e : sensors) {
            e.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor e : sensors) {
            e.setOff();
        }
    }

    @Override
    public int read() {

        int sum = 0;
        if (isOn() && !sensors.isEmpty()) {

            for (Sensor e : sensors) {

                sum += e.read();

            }

            int average = sum / sensors.size();

            aver.add(average);

            return average;
        } else {
            throw new IllegalArgumentException("error getting average of sensors");
        }

    }

    public void addSensor(Sensor toAdd) {

        sensors.add(toAdd);
    }

    public List<Integer> readings() {

        return aver;

    }

}
