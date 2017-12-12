package com.saintsrobotics.corebot.input.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
/**
 * This class operates the potentiometer
 * 
 */
public class Potentiometer {
    
    private int pin;
    private AnalogPotentiometer pot;
    /**
     * This constructor basically says that the private variable pin is the same as the public variable pin.
     * @param pin references the pin on the roboRIO on the robot to which the Potentiometer is connected.
     */
    public Potentiometer(int pin) {
        this.pin = pin;
    }
    
    public void init() {
        pot = new AnalogPotentiometer(pin, 270, 0);
    }
    
    public double get() {
        return pot.get();
    }
    
    public void disable() {
        if (pot != null) {
            pot.free();
        }
        pot = null;
    }
}
