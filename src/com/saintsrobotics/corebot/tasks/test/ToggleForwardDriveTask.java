package com.saintsrobotics.corebot.tasks.test;

import com.saintsrobotics.corebot.Robot;
import com.saintsrobotics.corebot.coroutine.Task;

public class ToggleForwardDriveTask extends Task {
    
    @Override
    protected void run() {
        Robot.motors.allDrive.set(0.1);
        wait.until(() -> Robot.oi.drive.buttons.A());
        Robot.motors.allDrive.set(0);
    }
}
