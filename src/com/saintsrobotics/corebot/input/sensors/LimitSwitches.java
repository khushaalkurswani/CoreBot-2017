package com.saintsrobotics.corebot.input.sensors;

import edu.wpi.first.wpilibj.DigitalInput;

import java.util.ArrayList;
import java.util.List;

public class LimitSwitches {
    
    private List<LimitSwitch> switches = new ArrayList<>();
    
    public final LimitSwitch exampleSwitch;
    /*
     * Defines exampleSwitch as a Limit Switch
     * Adds exampleSwitch to the list of the switches ArrayList
     * @param exampleSwitchPin refers to the pin on the RoboRio that exampleSwitch is connected to
     */
    public LimitSwitches(int exampleSwitchPin) {
        exampleSwitch = new LimitSwitch(exampleSwitchPin);
        switches.add(exampleSwitch);
    }
    /*
     * Initializes all of the the limit switches.
     */
    public void init() {
        switches.forEach(LimitSwitch::init);
    }
    /*
     * Disables all of the the limit switches.
     */
    public void disable() {
        switches.forEach(LimitSwitch::disable);
    }
    /*
     * Defines the Limit Switches
     */
    public static class LimitSwitch {
        
        private final int pin;
        private DigitalInput switchInput;
        
        LimitSwitch(int pin) {
            this.pin = pin;
        }
        
        private void init() {
            if (switchInput == null) switchInput = new DigitalInput(pin);
        }
        
        private void disable() {
            if (switchInput != null) {
                switchInput.free();
                switchInput = null;
            }
        }
         /*
         * Gets the value from a digital input channel
         * @return the status of the switch
         */
        public boolean get() {
            return switchInput.get();
        }
    }
}
