// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Example;
//import frc.robot.commands.AutoAlignToAprilTagCommand;

//import frc.robot.Commands.Getballcommand;


public class RobotContainer {

    //private final CommandXboxController joystick = new CommandXboxController(0);
    private final CommandXboxController m_driverJoystick = new CommandXboxController(0);

    //subsystem 声明子系统 执行构造函数
    public final Example testmotor = new Example();

    public RobotContainer() {

      //bind the all the commands
      configureBindings();
        
    }

    private void configureBindings() {

      //绑定按键写在这
      m_driverJoystick.a().whileTrue(testmotor.motor_MoveCommand2());
      m_driverJoystick.b().whileTrue(testmotor.motor_MoveCommand3());

    }

  }
