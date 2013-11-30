package Controller;

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
        aViewController = new ViewController();
        aViewController.playScene(); // TODO : isso estará mais tarde no execute 
    }
    
    /**
     * Principal MasterController's method
     * @author Rodrigo Zanella Ribeiro
     */
    public void execute(){
        
    }
    
    
}
