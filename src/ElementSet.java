import java.io.*;
import java.util.*;

class ElementSet {
   private File elements;
   private PrintWriter save;
   private Scanner scan;
   private ArrayList<String> elementInfo;
   
   ElementSet() throws FileNotFoundException {
      elements = new File("resources/elements.txt");
      scan = new Scanner( elements);
      elementInfo = new ArrayList<>();
      
      while( scan.hasNextLine()) {
         elementInfo.add( scan.nextLine());
      }
      saveElements();
   }
   
   void addElement(String name, String ing1, String ing2) {
      elementInfo.add( name + "," + ing1 + "," + ing2);
   }
   
   void saveElements() throws FileNotFoundException {
      save = new PrintWriter( elements);
      
      for( String i : elementInfo) {
         save.println( i);
      }
      save.close();  
   }
   
   void deleteLastElement() throws FileNotFoundException {
      elementInfo.remove( elementInfo.size() - 1);
      
      save = new PrintWriter( elements);
      
      for( String i : elementInfo) {
         save.println( i);
      }
      save.close();  
   }
}

