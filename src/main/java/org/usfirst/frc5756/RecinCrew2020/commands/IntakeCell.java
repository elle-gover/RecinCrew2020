package org.usfirst.frc5756.RecinCrew2020.commands;

import org.usfirst.frc5756.RecinCrew2020.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCell extends Command {

    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.powerCellController.powercellIn(0.8);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.powerCellController.powercellIn(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
}