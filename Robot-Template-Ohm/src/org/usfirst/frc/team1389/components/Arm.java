package org.usfirst.frc.team1389.components;

import com.team1389.hardware.inputs.software.DigitalIn;
import com.team1389.hardware.inputs.software.PercentIn;
import com.team1389.hardware.outputs.software.PercentOut;
import com.team1389.system.Subsystem;
import com.team1389.util.list.AddList;
import com.team1389.watch.Watchable;


public class Arm extends Subsystem{
	
	PercentIn armButton;
	DigitalIn intakeButton;
	PercentOut talonperout;
	PercentOut intakeval;
	
	public Arm(PercentIn armButton, DigitalIn intakeButton, PercentOut talonperout, PercentOut intakeval)
	{
		this.armButton = armButton;
		this.intakeButton = intakeButton;
		this.talonperout = talonperout;
		this.intakeval = intakeval;
	}
	
	public void mapArmMotor()
	{
		talonperout.set(armButton.get());
	}
	
	
	public void moveIntakeMotor()
	{
		if (intakeButton.get())
			intakeval.set(0.5);
		
		else
			intakeval.set(0);
		
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
