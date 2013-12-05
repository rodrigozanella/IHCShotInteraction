package Controller.ViewController;

import Controller.MasterController;
import View.AboutView;
import View.ConfigView;
import View.GameView;
import View.MainView;
import View.ViewImpl;
import java.util.HashMap;
/**
 * This class controls the view
 * @author Rodrigo Zanella Ribeiro
 */
public class ViewController {
    private ViewImpl actualView;
    private HashMap<String,ViewImpl> states;
    private String nextScene;
    private FormView form;
    private MasterController masterController;
    
    public ViewController(MasterController mc){
        states = new HashMap<String,ViewImpl>();
        states.put("main", new MainView());
        states.put("start", new GameView());
        states.put("configurations", new ConfigView());
        states.put("about", new AboutView());
        states.put("exit", null);
        nextScene = "main";
        masterController = mc;
        
    }
    
    public void playScene(){
        actualView = states.get(nextScene);
        actualView.setMoving(masterController.getaMoving());
        //form.setNewView(actualView);
        actualView.start();
    }
    
    public void nextScene(){
      nextScene = actualView.getState();
    }
    
    public String getNextScene(){
        return nextScene;
    }
    
    public boolean isFinished(){
        return actualView.isFinished();
    }
}
