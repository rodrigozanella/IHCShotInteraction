package Controller.ViewController;

import View.MainView;
import com.jme3.app.SimpleApplication;

/**
 * This class controls the view
 * @author Rodrigo Zanella Ribeiro
 */
public class ViewController {
    private SimpleApplication actualView;
    
    public ViewController(){
        actualView = new MainView();
    }
    
    public void playScene(){
        actualView.start();
    }
    
}
