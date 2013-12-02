package Controller.ViewController;

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
    
    public ViewController(){
        states = new HashMap<String,ViewImpl>();
        states.put("main", new MainView());
        states.put("configurations", null);
        states.put("about", null);
        states.put("exit", null);
        nextScene = "main";
    }
    
    public void playScene(){
        actualView = states.get(nextScene);
        actualView.start();
    }
    
    public void nextScene(){
        nextScene = actualView.getState();
    }
}
