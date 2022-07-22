// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {

/** Creates a new ExampleSubsystem. */
  private WPI_TalonFX lmotor;
  private WPI_TalonFX rmotor;
  private DifferentialDrive dchassis ;
  public Chassis()

   {lmotor = new WPI_TalonFX(Constants.L_TALON_MOTOR_ID);
    rmotor = new WPI_TalonFX(Constants.R_TALON_MOTOR_ID);
    dchassis = new DifferentialDrive (
    lmotor,rmotor);
    lmotor.setInverted(TalonFXInvertType.CounterClockwise);
    rmotor.setInverted(TalonFXInvertType.Clockwise);
}

public void run_arcade_drive (double speed, double rotation){
    dchassis.arcadeDrive(speed, rotation);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
