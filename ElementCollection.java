import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;


public class ElementCollection implements Iterable<ElementButton>{
   ArrayList<ElementButton> elements;
   File save;
   Scanner scan;
   String tempString;
   String[] components;
   
   public ElementCollection() throws FileNotFoundException {
      save = new File("elements.txt");
      scan = new Scanner( save);
      elements = new ArrayList<ElementButton>();
      
      
      while( scan.hasNextLine()) {
         tempString = scan.nextLine();
         components = tempString.split(",");
         elements.add( new ElementButton( components[0], components[1], components[2]));
      }
      
   }
   public Iterator<ElementButton> iterator() {
      return elements.iterator();
   }
   public ElementButton getElementAt( int index) {
      return elements.get( index);
   }
   public void set( int index) {
      elements.get( index).setEnabled( true);
      elements.get( index).setText(elements.get( index).name);
   }
   
   public int elementNum() {
      return elements.size();
   }
}