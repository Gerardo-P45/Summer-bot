package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;
import pabeles.concurrency.ConcurrencyOps.Reset;

public class Auton extends CommandBase {
    private Chassis m_chassis;
    private Timer m_timer;
    public Auton(Chassis chassis) {
        m_chassis = chassis;
    }
    @Override
    public void initialize() {
        m_timer = new Timer();
        m_timer.reset();
        m_timer.start();
    } 
    @Override
    public void execute() {
    m_chassis.run_arcade_drive(.1,0);   
     }

    @Override
    public boolean isFinished() {
        return m_timer.hasElapsed(1.0);
    }

    @Override
    public void end(boolean interrupted) {
        m_chassis.run_arcade_drive(0, 0);
    }
}

