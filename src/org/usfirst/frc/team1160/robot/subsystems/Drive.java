package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.OI;
import org.usfirst.frc.team1160.robot.commands.Driver;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{

	Jaguar left, right;
	public static Drive instance;
	Timer time;
	
	public static Drive getInstance(){
		if(instance == null){
			instance = new Drive();
		}
		return instance;
	}
	
	private Drive(){
		time = new Timer();
		left = new Jaguar(0);
		right = new Jaguar(1);
	}
	
	public void makeGo(){
		left.set(OI.getStick().getX() - OI.getStick().getY());
		System.out.println(OI.getStick().getX() - OI.getStick().getY());
		right.set(OI.getStick().getX() + OI.getStick().getY());
		System.out.println(OI.getStick().getX() + OI.getStick().getY());
	}
	
	
	public boolean done(){
		if(time.get() >= 0.05){
			time.start();
			return true;
		}
		return false;
	}
	
	public void startTime(){
		time.reset();
		time.start();
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Driver());
	}

}
