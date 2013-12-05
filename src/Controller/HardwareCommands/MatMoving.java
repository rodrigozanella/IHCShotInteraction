/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.HardwareCommands;

import Controller.HardwareInterface.Moving;
import Model.Coordinate;
import Model.Dispositives.JInputJoystick;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JToggleButton;
import net.java.games.input.Controller;
import net.java.games.input.Component;

/**
 *
 * @author Zanella
 */
public class MatMoving implements Moving{
    private JInputJoystick joystick;
    
    public MatMoving(){
        joystick = new JInputJoystick(Controller.Type.STICK, Controller.Type.GAMEPAD);
    }
    
    @Override
    public Coordinate getPosition() {
            if( joystick.pollController() ) {
            
            // Left controller joystick
            int xValuePercentageLeftJoystick = joystick.getX_LeftJoystick_Percentage();
            int yValuePercentageLeftJoystick = joystick.getY_LeftJoystick_Percentage();
            
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
            
            if(xValuePercentageLeftJoystick==49){
                xValuePercentageLeftJoystick = 0;
            }
            else{
                if(xValuePercentageLeftJoystick == 0){
                    xValuePercentageLeftJoystick = -1;
                }
                else{
                    if(xValuePercentageLeftJoystick == 100){
                        xValuePercentageLeftJoystick = 1;
                    }
                }
            }
            
            if(yValuePercentageLeftJoystick==49){
                yValuePercentageLeftJoystick = 0;
            }
            else{
                if(yValuePercentageLeftJoystick == 0){
                    yValuePercentageLeftJoystick = 1;
                }
                else{
                    if(yValuePercentageLeftJoystick == 100){
                        yValuePercentageLeftJoystick = -1;
                    }
                }
            }

            return new Coordinate(xValuePercentageLeftJoystick, 
            yValuePercentageLeftJoystick,0);
    }
            
    return null;
    }
}
