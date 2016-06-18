package org.usfirst.frc.team1160.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootGroup extends CommandGroup{
	public ShootGroup(){
		addSequential(new Shoot());
		addSequential(new Wait());
		addSequential(new Close());
	}
}
