import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;


public class ElementCollection implements Iterable<ElementButton> {
   private ArrayList<ElementButton> elements;

   ElementCollection() throws FileNotFoundException {

      File gameElementsFile = new File("resources/elements.txt");
      Scanner elementScanner = new Scanner(gameElementsFile);

      elements = new ArrayList<>();

      // Copies each element from txt to the elements
      while( elementScanner.hasNextLine()) {
         String tempString = elementScanner.nextLine();
         String[] elementAttributes = tempString.split(",");

         ElementButton button = new ElementButton( elementAttributes[0], elementAttributes[1], elementAttributes[2]);
         elements.add( button);
      }
      
   }
   public Iterator<ElementButton> iterator() {
      return elements.iterator();
   }

   ElementButton getElementAt(int index) {
      return elements.get( index);
   }

   void set(ElementButton elementButton) {
      elementButton.setEnabled( true);
      elementButton.setText(elementButton.name);
   }
   
   int elementNum() {
      return elements.size();
   }
}