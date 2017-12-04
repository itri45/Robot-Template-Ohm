package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.outputs.software.PercentOut;

public class RobotSoftware extends RobotHardware
{
	private static RobotSoftware INSTANCE = new RobotSoftware();
	
	public PercentOut armAxis;
	public PercentOut intakeVal;
	
	public static RobotSoftware getInstance()
	{
		return INSTANCE;
	}

	public RobotSoftware()
	{
		armAxis = armtalon.getVoltageOutput();
		intakeVal = intakeMotor.getVoltageOutput();
	}

}
