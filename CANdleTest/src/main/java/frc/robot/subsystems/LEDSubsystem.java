// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.led.CANdle;
import com.ctre.phoenix.led.CANdleConfiguration;
import com.ctre.phoenix.led.CANdle.LEDStripType;
import com.ctre.phoenix.led.CANdle.VBatOutputMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LEDSubsystem extends SubsystemBase {
  /** Creates a new LEDSubsystem. */
  private CANdle candle;

  public LEDSubsystem() {
    candle = new CANdle(0);

    CANdleConfiguration configAll = new CANdleConfiguration();
    configAll.statusLedOffWhenActive = false;
    configAll.disableWhenLOS = false;
    configAll.stripType = LEDStripType.RGB;
    configAll.brightnessScalar = 0.1;
    configAll.vBatOutputMode = VBatOutputMode.Modulated;
    candle.configAllSettings(configAll, 100);
  }
  public void setAllLEDToColor(int[] rgb) {
    candle.setLEDs(rgb[0], rgb[1], rgb[2]);
    candle.modulateVBatOutput(0.9);
  }
  public void setLEDOff() {
    candle.setLEDs(0, 0, 0);
    candle.modulateVBatOutput(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
