/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Coordinate;
import com.jme3.font.BitmapText;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import java.util.ArrayList;

/**
 *
 * @author Zanella
 */
public class GameView extends ViewImpl{
   
    @Override
    public void simpleInitApp() {
         Box b = new Box(1, 4, 1); // create cube shape
        Geometry geom = new Geometry("Box", b);  // create cube geometry from the shape
        Material mat = new Material(assetManager,
          "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
        mat.setColor("Color", ColorRGBA.Blue);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
    }
    
    
    @Override
     public void simpleUpdate(float tpf) {   
         Vector3f cameralocation = cam.getLocation();
         Coordinate coord = moving.getPosition();         
         cam.setLocation(cameralocation.addLocal(coord.getX(), 0, (-1)*coord.getY()));
     }

}
