import javax.swing.*;
import java.awt.*;

public class ElementButton extends JButton {
   
   String ingredient1;
   String ingredient2;
   String name;
   
   boolean shouldAddToGame;
   boolean added;
   //boolean elementSelected;
   public ElementButton( String name, String ingredient1, String ingredient2) {
      super( );
      this.name = name;
      this.ingredient1 = ingredient1;
      this.ingredient2 = ingredient2;

      //elementSelected = false;
      //shouldAddToGame = false;
      added = false;
      //setPreferredSize( new Dimension(0,0));
      setEnabled(false);
   } 
}