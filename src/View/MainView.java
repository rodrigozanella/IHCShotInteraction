/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.jme3.font.BitmapText;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import java.util.ArrayList;

/**
 *
 * @author Zanella
 */
public class MainView extends ViewImpl{
    private ArrayList<BitmapText> buttons;
    private int state;
    @Override
    public void simpleInitApp() {
        buttons = new ArrayList<BitmapText>();
        exit = false;
        // Display a line of text with a default font
        guiNode.detachAllChildren();
        guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
        //Iniciar
        BitmapText iniciar = new BitmapText(guiFont, false);
        iniciar.setSize(guiFont.getCharSet().getRenderedSize());
        iniciar.setText("Start Game");
        iniciar.setColor(ColorRGBA.Yellow);
        iniciar.setLocalTranslation(300, iniciar.getLineHeight() + 300, 0);
        guiNode.attachChild(iniciar);
        buttons.add(0, iniciar);
        
        //Configurações
        BitmapText config = new BitmapText(guiFont, false);
        config.setSize(guiFont.getCharSet().getRenderedSize());
        config.setText("Configurations");
        config.setColor(ColorRGBA.White);
        config.setLocalTranslation(300, config.getLineHeight() + 250, 0);
        guiNode.attachChild(config);
        buttons.add(1, config);
        
        //Sobre
        BitmapText about = new BitmapText(guiFont, false);
        about.setSize(guiFont.getCharSet().getRenderedSize());
        about.setText("About");
        about.setColor(ColorRGBA.White);
        about.setLocalTranslation(300, about.getLineHeight() + 200, 0);
        guiNode.attachChild(about);
        buttons.add(2, about);
        
        //Sair
        BitmapText exit = new BitmapText(guiFont, false);
        exit.setSize(guiFont.getCharSet().getRenderedSize());
        exit.setText("Exit");
        exit.setColor(ColorRGBA.White);
        exit.setLocalTranslation(300, exit.getLineHeight() + 150, 0);
        guiNode.attachChild(exit);
        buttons.add(3, exit);
        
        // You must add a light to make the model visible
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f));
        rootNode.addLight(sun);
        initKeys();
    }
    
     private void initKeys() {
    // You can map one or several inputs to one named action
    inputManager.addMapping("Down",  new KeyTrigger(KeyInput.KEY_UP));
    inputManager.addMapping("Up",   new KeyTrigger(KeyInput.KEY_DOWN));
    inputManager.addMapping("Enter",   new KeyTrigger(KeyInput.KEY_RETURN));
    
    // Add the names to the action listener.
    inputManager.addListener(menuActions, new String[]{"Up", "Down", "Enter"});
    }
    private ActionListener menuActions = new ActionListener() {
    @Override
    public void onAction(String name, boolean keyPressed, float tpf) {
      if (name.equals("Up")&& !keyPressed) {
        BitmapText tmp = buttons.get(state);
        tmp.setColor(ColorRGBA.White);
        state++;
        if(state==4){
            state = 0;
        }
        tmp = buttons.get(state);
        tmp.setColor(ColorRGBA.Yellow);
        System.out.print(state);
      }
      
      if (name.equals("Down")&& !keyPressed) {
        BitmapText tmp = buttons.get(state);
        tmp.setColor(ColorRGBA.White);
        state--;
        if(state==-1){
            state = 3;
        }
        tmp = buttons.get(state);
        tmp.setColor(ColorRGBA.Yellow);
        System.out.print(state);
      }
      
      if(name.equals("Enter") && !keyPressed){
          exit = true;
      }    
    }
  };
    
    @Override
     public void simpleUpdate(float tpf) {   
         if(exit){
            this.stop();
         }
     }
     
    public String getState(){
        String response = "";
        switch (state){
            case 0:
                response = "start";
                break;
            case 1:
                response = "configurations";
                break;
            case 2:
                response = "about";
                break;
            case 3:
                response = "exit";
                break;
        }
        return response;
    }
}
