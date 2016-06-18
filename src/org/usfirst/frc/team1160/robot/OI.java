package org.usfirst.frc.team1160.robot;

import org.usfirst.frc.team1160.robot.commands.ShootGroup;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	static Joystick stick;
	JoystickButton fire;
	
	
	public OI(){
		stick = new Joystick(1);
		buttons();
	}
	
	public void buttons(){
		fire = new JoystickButton(stick, 1);
		tieButtons();
	}
	
	public void tieButtons(){
		fire.whenPressed(new ShootGroup());
	}
	
	public static Joystick getStick(){
		return stick;
	}
}

