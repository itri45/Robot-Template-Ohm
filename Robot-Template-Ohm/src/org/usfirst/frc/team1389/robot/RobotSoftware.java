package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.outputs.software.PercentOut;

public class RobotSoftware extends RobotHardware
{
	private static RobotSoftware INSTANCE = new RobotSoftware();
	
	public static RobotSoftware getInstance()
	{
		return INSTANCE;
	}

	public RobotSoftware()
	{
		PercentOut armOut = armMotor.getVoltageOutput();
		armOut.set(1);
	}

}
