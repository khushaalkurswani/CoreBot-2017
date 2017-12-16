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
     /**
      * Initializes the private variable pot as a AnalogPotentiometer().
      */
    public void init() {
        /**
    	 * Controls the Potentiometer in the robot.
    	 * @param pin (integer) the pin on the roboRIO on the robot to which the Potentiometer is connected.
    	 * @param fullRange (double) scaling to multiply the fraction by to get a meaningful unit. In this case fullRange is set to 270.
    	 * @param offset (double) the offset to add to the scaled value for controlling the zero value. In this case the offset is set 0.
    	 */
        pot = new AnalogPotentiometer(pin, 270, 0);
    }
     /*
     * Get the current reading of the potentiometer.
     * Returns
     * 			The current reading. 	
     */
    public double get() {
        return pot.get();
    }
    /*
     * Disables the potentiometer
     */
    public void disable() {
        if (pot != null) {
            pot.free();
        }
        pot = null;
    }
}
