package org.usfirst.frc.team1389.operation;

import org.usfirst.frc.team1389.components.Arm;
import org.usfirst.frc.team1389.robot.RobotSoftware;
import org.usfirst.frc.team1389.robot.controls.ControlBoard;


import com.team1389.system.SystemManager;

public class TeleopMain {
	SystemManager manager;
	ControlBoard controls;
	RobotSoftware robot;
		
	private Arm armset()
	{
		Arm arm = new Arm (controls.armbuttonA, controls.armbuttonB, controls.armbuttonC, controls.armbuttonD, robot.armAxis, robot.intakeVal);
		
		return arm;
	}

	public TeleopMain(RobotSoftware robot) {
		this.robot = robot;
	}

	public void init() {
		controls = ControlBoard.getInstance();
		manager = new SystemManager(armset());
		manager.init();
		
		
		

	}

	public void periodic() {
		manager.update();
		
	}
}
