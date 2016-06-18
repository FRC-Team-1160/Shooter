package org.usfirst.frc.team1160.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Air extends Subsystem{
	
	Compressor comp;
	Solenoid chooch;
	
	static Air instance;
	
	public static Air getInstance(){
		if(instance == null){
			instance = new Air();
		}
		return instance;
	}
	
	private Air(){
		comp = new Compressor();
		chooch = new Solenoid(0);
	}
	
	public void open(){
		chooch.set(true);
	}
	
	public void close(){
		chooch.set(false);
	}

	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
