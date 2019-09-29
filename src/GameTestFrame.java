import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class GameTestFrame extends JFrame implements Serializable{

   private ElementCollection collection;
   private MyMouseListener l;
   private ElementButton firstClick;

   // Each button uses the same mouse listener but mouse listeners are separately added.
   public GameTestFrame() throws FileNotFoundException {

      super(GameTexts.GAME_TITLE);
      setLayout( new BorderLayout());
      
      setSize(800,600);

      JOptionPane.showMessageDialog(null, GameTexts.INTRODUCTION);

      // Button Theme
      try {
         for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      }
      catch (Exception e) {
         throw new RuntimeException();
      }

      collection = new ElementCollection();
      l = new MyMouseListener();
      JPanel elementPanel = new JPanel();
      elementPanel.setLayout( new GridLayout(0,10));
      for( int i = 0; i < collection.elementNum(); i++) {
            elementPanel.add(collection.getElementAt( i));

      }
      collection.set(collection.getElementAt(0));

      collection.getElementAt( 0).addMouseListener( l);
      add(elementPanel, BorderLayout.NORTH);
      setVisible( true);
   }
   
   private class MyMouseListener extends MouseAdapter {
      public void mouseClicked( MouseEvent e) {
         
         boolean selected;
         selected = false;
         
         for( ElementButton i : collection) {
            if( i.isSelected()) {
               selected = true;
            }
         }
         
         if( !selected) {
            ((ElementButton)e.getSource()).setSelected( true);
            ((ElementButton)e.getSource()).setBackground( new Color(102,205,0));
            firstClick = ((ElementButton)e.getSource());
         }
         if( selected) {
            firstClick.setSelected( false);
            ElementButton secondClick = ((ElementButton) e.getSource());
            firstClick.setBackground( null);
            for( ElementButton i : collection ) {
               if( (i.ingredient1.equals( firstClick.name) && i.ingredient2.
                       equals( secondClick.name)) || (i.ingredient1.equals( secondClick.name) &&
                                             i.ingredient2.equals( firstClick.name))) {
                  collection.set(i);
                  i.addMouseListener( l);
               }
            }
         }
         
      }
   }
   
   
   
}