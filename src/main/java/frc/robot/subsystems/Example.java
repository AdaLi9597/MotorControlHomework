package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Example extends SubsystemBase {//变量写在这里

    //声明电机
    private final TalonFX m_motor1 = new TalonFX(1,"rio");
    private final TalonFX m_motor2 = new TalonFX(2,"rio");
    private final TalonFX m_motor3 = new TalonFX(3,"rio");
    
   //声明控制请求 还没有实际和电机发生关系
   private final VoltageOut motor1_Voltage_request = new VoltageOut(0);
   private final VoltageOut motor2_Voltage_request = new VoltageOut(0);
   private final VoltageOut motor3_Voltage_request = new VoltageOut(0);


    //方法1：构造函数
    public Example() {


    }

    //其他方法写在这里

   /**
     * Sets the motor position.
     * 
     * @param voltage
     */
    public void setVoltage(double voltage) { //方法

        //setControl设置控制模式 把请求发给电
        m_motor1.setControl(motor1_Voltage_request.withOutput(voltage)); //将请求用到电机上
        
    }

    public void setVoltage2(double voltage) { //方法

        //setControl设置控制模式 把请求发给电
        m_motor2.setControl(motor2_Voltage_request.withOutput(voltage)); //将请求用到电机上
        
    }

    public void setVoltage3(double voltage) { //方法

        //setControl设置控制模式 把请求发给电
        m_motor3.setControl(motor3_Voltage_request.withOutput(voltage)); //将请求用到电机上
        
    }

    //一个电机，速度控制，位置控制，电压控制



    //命令写在这里
    /**
     * Set the motor to a specific position.
     * 
     * @return
     */
    public Command motor_MoveCommand() { //command里必须要return

        return startEnd(
            
            () -> setVoltage(2),//start

            () -> setVoltage(-2)//end
        );
    }

    public Command motor_MoveCommand2() { //command里必须要return

        return startEnd(
            
            () -> setVoltage(50),//start

            () -> setVoltage(-50)//end
        );
    }

    public Command motor_MoveCommand3() { //command里必须要return

        return startEnd(
            
            () -> setVoltage(50),//start

            () -> setVoltage(-50)//end
        );
    }

}