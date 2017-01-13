package com.saintsrobotics.corebot.tasks.autonomous;

import com.saintsrobotics.corebot.Robot;
import com.saintsrobotics.corebot.coroutine.Task;
import com.saintsrobotics.corebot.coroutine.Wait;

public class DriveStraightAutonTask extends Task {
    
    @Override
    protected void run() {
        Robot.motors.allMotors.set(0.3);
        yield(Wait.forSeconds(3));
        Robot.motors.allMotors.set(0);
    }
}
