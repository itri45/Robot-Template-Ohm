package org.usfirst.frc.team1389.systems;

import org.usfirst.frc.team1389.robot.controls.ControlBoard;

import com.team1389.hardware.inputs.software.PercentIn;
import com.team1389.hardware.outputs.software.PercentOut;
import com.team1389.system.Subsystem;
import com.team1389.system.drive.TankDriveSystem;
import com.team1389.util.list.AddList;
import com.team1389.watch.Watchable;

public class GearArmSystem extends Subsystem {

	ControlBoard control = new ControlBoard();
	TankDriveSystem tank;

	public PercentOut armIntake;
	public PercentOut armOutTake;
	public PercentOut armMotion;

	public PercentIn armIntakeAxis;
	public PercentIn armOutTakeAxis;
	public PercentIn armAngleAxis;

	public GearArmSystem(PercentOut armIntake, PercentIn armIntakeAxis,
			PercentIn armOutTakeAxis,PercentIn armAngleAxis, PercentOut armMotion) {

		this.armIntake = armIntake;
		this.armIntakeAxis = armIntakeAxis;

		this.armOutTakeAxis = armOutTakeAxis;

		this.armMotion = armMotion;
		this.armAngleAxis = armAngleAxis;
	}

	@Override
	public AddList<Watchable> getSubWatchables(AddList<Watchable> stem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
		return null;

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		armMotion.set(armAngleAxis.get());
		armIntake.set(armIntakeAxis.get());
		armOutTake.set(-armOutTakeAxis.get());
	}

}
