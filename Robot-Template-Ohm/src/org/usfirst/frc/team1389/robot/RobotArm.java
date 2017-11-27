package org.usfirst.frc.team1389.robot;

import com.team1389.system.Subsystem;
import com.team1389.util.list.AddList;
import com.team1389.watch.Watchable;

public class RobotArm extends Subsystem
{
	@Override
	public AddList<Watchable> getSubWatchables(AddList<Watchable> stem)
	{

		return stem;
	}

	@Override
	public String getName()
	{

		return "";
	}

	@Override
	public void init()
	{
		RobotSoftware();
	}

	@Override
	public void update()
	{
		
	}

}
