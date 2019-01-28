import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class GameTestFrame extends JFrame implements Serializable{
   
   JPanel elementPanel;
   ElementCollection collection;
   MyMouseListener l;
   ElementButton f1;
   ElementButton f2;
   public GameTestFrame() throws FileNotFoundException {
      
      super("TEST");
      setLayout( new BorderLayout());
      
      setSize(800,600);
      
      //addMouseListener( new MyMouseListener());
      collection = new ElementCollection();
      l = new MyMouseListener();
      elementPanel = new JPanel();
      elementPanel.setLayout( new GridLayout(0,10));
      for( int i = 0; i < collection.elementNum(); i++) {
            elementPanel.add(collection.getElementAt( i));
        
         //collection.getElementAt( i).addMouseListener( l);
      }
      collection.set(0);

      collection.getElementAt( 0).addMouseListener( l);
      add( elementPanel, BorderLayout.NORTH);
      setVisible( true);
   }
   
   private class MyMouseListener extends MouseAdapter {
      public void mouseClicked( MouseEvent e) {
         
         int selected;
         selected = 0;
         
         for( ElementButton i : collection) {
            if( i.isSelected()) {
               selected++;
            }
         }
         
         if( selected == 0) {
            ((ElementButton)e.getSource()).setSelected( true);
            ((ElementButton)e.getSource()).setBackground( new Color(102,205,0));
            f1 = ((ElementButton)e.getSource());
         }
         if( selected == 1) {
            f1.setSelected( false);
            f2 = ((ElementButton)e.getSource());
            f1.setBackground( null);
            for( ElementButton i : collection ) {
               if( (i.ingredient1.equals( f1.name) && i.ingredient2.
                       equals( f2.name)) || (i.ingredient1.equals( f2.name) &&
                                             i.ingredient2.equals( f1.name))) {
                  i.setEnabled( true);
                  i.setText( i.name);
                  i.addMouseListener( l);
               }
            }
         }
         
      }
   }
   
   
   
}