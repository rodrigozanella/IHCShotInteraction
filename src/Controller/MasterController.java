package Controller;

import Controller.HardwareCommands.MatMoving;
import Controller.HardwareInterface.GunButtons;
import Controller.HardwareInterface.GunDirection;
import Controller.HardwareInterface.Moving;
import Controller.ViewController.ViewController;

/**
 * The master controller controls the application
 * @author Rodrigo Zanella Ribeiro
 */
public class MasterController {
    private GunDirection aGunDirection;
    private GunButtons aGunButtons;
    private Moving aMoving;
    private ViewController aViewController;
    
    /**
     * Initializes the MasterController, attributing a GunDirect to aGunDirect
     * variable, a GunButton to aGunButton variable and a Moving to aMoving 
     * variable.
     * @author Rodrigo Zanella Ribeiro
     */
    
    public MasterController(){
        aViewController = new ViewController(this);
        aMoving = new MatMoving();
    }
    
    /**
     * Principal MasterController's method
     * @author Rodrigo Zanella Ribeiro
     */
    public void execute(){
        boolean change = true; 
        while(!aViewController.getNextScene().equalsIgnoreCase("exit")){
            if(change){
                aViewController.playScene();
                change = false;
            }
            while(aViewController.isFinished() && change == false){
                aViewController.nextScene();
                change = true;
            }
        }
    }
    
    public GunDirection getaGunDirection() {
        return aGunDirection;
    }

    public void setaGunDirection(GunDirection aGunDirection) {
        this.aGunDirection = aGunDirection;
    }

    public GunButtons getaGunButtons() {
        return aGunButtons;
    }

    public void setaGunButtons(GunButtons aGunButtons) {
        this.aGunButtons = aGunButtons;
    }

    public Moving getaMoving() {
        return aMoving;
    }

    public void setaMoving(Moving aMoving) {
        this.aMoving = aMoving;
    }
}
