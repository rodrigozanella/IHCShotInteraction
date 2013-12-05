/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.jme3.font.BitmapText;
import com.jme3.math.ColorRGBA;

/**
 *
 * @author Zanella
 */
public class AboutView extends ViewImpl{
    @Override
    public void simpleInitApp() {
        // Display a line of text with a default font
        guiNode.detachAllChildren();
        guiFont = assetManager.loadFont("Interface/Fonts/Default.fnt");
        //Iniciar
        BitmapText iniciar = new BitmapText(guiFont, false);
        iniciar.setSize(guiFont.getCharSet().getRenderedSize());
        iniciar.setText("BLA BLA BLA BLA BLA BLA BLA BLA BLA");
        iniciar.setColor(ColorRGBA.White);
        iniciar.setLocalTranslation(300, iniciar.getLineHeight() + 300, 0);
        guiNode.attachChild(iniciar);
    }
}
