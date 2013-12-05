/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.ViewController;

import View.MainView;
import View.ViewImpl;
import com.jme3.app.SimpleApplication;

/**
 *
 * @author Zanella
 */
public class FormView extends SimpleApplication  {
    private ViewImpl view;
    public void setNewView(ViewImpl newView){
        view = newView;
    }
    @Override
    public void simpleInitApp() {
        view.simpleInitApp();
    }
    
    @Override
    public void simpleUpdate(float tpf){
        view.simpleUpdate(tpf);
    }
}
