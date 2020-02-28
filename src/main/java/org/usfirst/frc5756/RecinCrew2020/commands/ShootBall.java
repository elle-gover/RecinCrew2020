package org.usfirst.frc5756.RecinCrew2020.commands;

import org.usfirst.frc5756.RecinCrew2020.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShootBall extends Command{

    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.powerCellController.powercellOut(1.0);
        Robot.powerCellController.powerCellFeed(-1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        Robot.powerCellController.powercellOut(0.0);
        Robot.powerCellController.powerCellFeed(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
    
}
