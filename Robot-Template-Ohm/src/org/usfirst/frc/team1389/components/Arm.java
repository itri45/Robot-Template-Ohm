package org.usfirst.frc.team1389.components;

import com.team1389.hardware.inputs.software.DigitalIn;
import com.team1389.hardware.inputs.software.PercentIn;
import com.team1389.hardware.outputs.software.PercentOut;
import com.team1389.system.Subsystem;
import com.team1389.util.list.AddList;
import com.team1389.watch.Watchable;


public class Arm extends Subsystem{
	
	PercentIn thumbPos;
	DigitalIn intakeButton;
	PercentOut armAxis;
	PercentOut intakeVal;
	
	/**
	 * Moves the arm of a robot and allow the arm to intake gears
	 * 
	 * @param thumbPos
	 * 			The percent position of the thumbstick of the controller
	 * @param intakeButton
	 * 			The button that controls the intake motor
	 * @param armAxis
	 * 			The position of the arm
	 * @param intakeVal
	 * 			Percent value of intake motor
	 */
	
	public Arm(PercentIn thumbPos, DigitalIn intakeButton, PercentOut armAxis, PercentOut intakeVal)
	{
		this.thumbPos = thumbPos;
		this.intakeButton = intakeButton;
		this.armAxis = armAxis;
		this.intakeVal = intakeVal;
	}
	
	/**
	 * Sets the percent value of arm position to the percent value of the thumbstick position
	 */
	
	public void mapArmMotor()
	{
		armAxis.set(thumbPos.get());
	}
	
	/**
	 * Moves the intake motor if a button is pressed 
	 */
	
	public void moveIntakeMotor()
	{
		if (intakeButton.get())
		{
			intakeVal.set(-0.7);
		}
		
			intakeVal.set(0);
		
	}

	@Override
	public AddList<Watchable> getSubWatchables(AddList<Watchable> stem) {
		
		return stem;
	}

	@Override
	public String getName() {
		return "Arm";
	}

	@Override
	public void init() {
		
	}

	@Override
	public void update() {
		moveIntakeMotor();
		mapArmMotor();
	}
}
