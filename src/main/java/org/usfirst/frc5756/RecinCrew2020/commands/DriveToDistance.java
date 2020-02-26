package org.usfirst.frc5756.RecinCrew2020.commands;
import org.usfirst.frc5756.RecinCrew2020.Robot;

import edu.wpi.first.wpilibj.command.Command;
public class DriveToDistance extends Command {

    public DriveToDistance() {

    }

    @Override
    protected void initialize() {
        Robot.driveTrain.stop();
        setTimeout(5);
    }

    @Override
    protected void execute() {
        Robot.driveTrain.drive(1.0, 0.0);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
    @Override
    protected void end() {
    
    }

    @Override
    protected void interrupted() {
    }

}