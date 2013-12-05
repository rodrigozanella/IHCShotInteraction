/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.HardwareInterface.Moving;
import com.jme3.app.SimpleApplication;


public class ViewImpl extends SimpleApplication {
    protected boolean exit;
    protected Moving moving;
    
    public boolean isFinished(){
        return exit;
    }
    public String getState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void simpleInitApp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setMoving(Moving newMoving){
        moving = newMoving;
    }
    
    public Moving getMoving(){
        return moving;
    }
    
}
