package org.usfirst.frc5756.RecinCrew2020;

import com.analog.adis16448.frc.ADIS16448_IMU;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class RobotMap {

    //Climbing
    public WPI_TalonSRX telescopicArmExtender = new WPI_TalonSRX(1);
    public WPI_TalonSRX climbingMotor = new WPI_TalonSRX(2);

    //Wheel spinner thing
    public WPI_TalonSRX wheelExtender = new WPI_TalonSRX(3);
    public WPI_TalonSRX wheelSpinner = new WPI_TalonSRX(4);

    //Powercell system
    public WPI_TalonSRX powercellCollector = new WPI_TalonSRX(5);
    public WPI_TalonSRX powercellFeeder = new WPI_TalonSRX(6);
    public WPI_TalonSRX powercellShooter = new WPI_TalonSRX(7);

    //Drivetrain
    public Spark rightFrontDrivetrain = new Spark(2);
    public Spark rightBackDrivetrain = new Spark (1);
    public SpeedControllerGroup rightDrivetrain = new SpeedControllerGroup(rightFrontDrivetrain, rightBackDrivetrain);
    public Spark leftFrontDrivetrain = new Spark(4);
    public Spark leftBackDrivetrain = new Spark (3);
    public SpeedControllerGroup leftDrivetrain = new SpeedControllerGroup(leftFrontDrivetrain, leftBackDrivetrain);
    public DifferentialDrive differentialDrive = new DifferentialDrive(leftDrivetrain, rightDrivetrain);

    //senors
    public final ADIS16448_IMU imu = new ADIS16448_IMU();
}