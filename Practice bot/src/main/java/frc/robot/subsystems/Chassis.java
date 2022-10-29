package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
 
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase; 

import frc.robot.Constants;
import static frc.robot.RobotContainer.controller;

public class Chassis extends SubsystemBase {

    WPI_TalonFX leftmotor;
    WPI_TalonFX rightmotor;
    DifferentialDrive driveyboi;
    private final double forwardscale = 0.35;
    private final double rotationscale = 0.35;


    public Chassis(){
        leftmotor = new WPI_TalonFX(0);
        rightmotor = new WPI_TalonFX(1);
        driveyboi = new DifferentialDrive(leftmotor, rightmotor);

    }
    public void driveyboi(double forward, double rotation){
     driveyboi.arcadeDrive(forward * forwardscale, rotation * rotationscale);

    }

    @Override
    public void periodic() {
        driveyboi.feed();
    }
}