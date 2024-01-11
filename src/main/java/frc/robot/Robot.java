package frc.robot;

import com.ctre.phoenix6.SignalLogger;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

    public static RobotContainer robotContainer;

    @Override
    public void robotInit(){
        robotContainer = new RobotContainer(); // MUST CALL FIRST. INITIALIZES CONTROLLERS
        robotContainer.startSubsystemThreads();

        SignalLogger.setPath("/media/sda1/");

// Explicitly start the logger
SignalLogger.start();
    }



    @Override
    public void autonomousInit(){

    }


    @Override
    public void teleopInit(){
        robotContainer.enableState = RobotContainer.EnableState.TELEOP;
    }

    @Override
    public void simulationInit(){
        robotContainer.enableState = RobotContainer.EnableState.TELEOP;
    }

    @Override
    public void disabledInit(){
        // robotContainer.stopSubsystems();
    }

    @Override
    public void robotPeriodic(){
        
    }
    
    @Override
    public void autonomousPeriodic(){

    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void simulationPeriodic() {
        /* Assume 20ms update rate, get battery voltage from WPILib */
        robotContainer.drivetrain.getRawDrivetrain().updateSimState(0.020, RobotController.getBatteryVoltage());
    }

    @Override
    public void disabledPeriodic(){

    }

    @Override
    public void autonomousExit(){

    }

    @Override
    public void teleopExit(){

    }

    @Override
    public void disabledExit(){
        // robotContainer.stopSubsystemThreads();
    }
}
