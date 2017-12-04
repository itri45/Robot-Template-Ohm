package org.usfirst.frc.team1389.robot.controls;

import com.team1389.hardware.inputs.hardware.JoystickHardware;
import com.team1389.hardware.inputs.software.DigitalIn;
import com.team1389.hardware.inputs.software.DigitalIn.InputFilter;
import com.team1389.hardware.inputs.software.PercentIn;

/**
 * A basic framework for the robot controls. Like the RobotHardware, one instance of the ControlBoard object is created upon startup, then other methods request the singleton ControlBoard instance.
 * 
 * @author amind
 * @see ControlMap
 */
public class ControlBoard extends ControlMap {
	private static ControlBoard mInstance = new ControlBoard();

	public static ControlBoard getInstance() {
		return mInstance;
	}

	private ControlBoard() {
	}

	private final JoystickHardware driveController = new JoystickHardware(DRIVE_CONTROLLER);
	private final JoystickHardware manipController = new JoystickHardware(MANIP_CONTROLLER);
	
	// DRIVER CONTROLS
	public PercentIn throttle = driveController.getAxis(ax_THROTTLE_AXIS).applyDeadband(.02);
	public PercentIn wheel = driveController.getAxis(ax_WHEEL_AXIS).applyDeadband(.02);
	public DigitalIn quickturn = driveController.getButton(btn_QUICK_TURN);
	
	// MANUIPULATOR CONTROLS
	public DigitalIn armbuttonA = manipController.getButton(btn_ARM_POSITION_A);
	public DigitalIn armbuttonB = manipController.getButton(btn_ARM_POSITION_B);
	public DigitalIn armbuttonC = manipController.getButton(btn_ARM_POSITION_C);
	public DigitalIn armbuttonD = manipController.getButton(btn_ARM_POSITION_D);
	
	public DigitalIn turretZero = manipController.getButton(btn_TURRET_ZERO, InputFilter.LATCHED);
	public PercentIn turretAxis = manipController.getAxis(ax_TURRET_AXIS);
	public PercentIn intakeAxis = manipController.getAxis(ax_INTAKE_AXIS);
	public DigitalIn intakeOverride = manipController.getButton(btn_INTAKE_MANUAL_OVERRIDE);
	
}
