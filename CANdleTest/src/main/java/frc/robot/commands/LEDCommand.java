// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.LEDSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class LEDCommand<m_subsystem> extends Command {
  LEDSubsystem m_subsystem;
  /** Creates a new LEDCommand. */
  public LEDCommand(LEDSubsystem subsystem) {
    m_subsystem = subsystem;
    addRequirements(getRequirements());
    addRequirements(m_subsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  public LEDCommand(LEDSubsystem m_LEDSubsystem, Joystick joystick) {
    //TODO Auto-generated constructor stub
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    int[] rgb = {100, 300, 200};
    m_subsystem.setAllLEDToColor(rgb);
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.setLEDOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
