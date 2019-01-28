import java.io.*;
import java.util.*;

public class ElementSet {
   File elements;
   PrintWriter save;
   Scanner scan;
   ArrayList<String> elementInfo;
   
   public ElementSet() throws FileNotFoundException {
      elements = new File( "elements.txt");
      scan = new Scanner( elements);
      elementInfo = new ArrayList<String>();
      
      while( scan.hasNextLine()) {
         elementInfo.add( scan.nextLine());
      }
      saveElements();
   }
   
//   public void fillGameInfo() {
//      
//   }
   
   public void addElement( String name, String ing1, String ing2) {
      elementInfo.add( name + "," + ing1 + "," + ing2);
   }
   
   public void saveElements( ) throws FileNotFoundException {
      save = new PrintWriter( elements);
      
      for( String i : elementInfo) {
         save.println( i);
      }
      save.close();  
   }
   
   public void deleteLastElement() throws FileNotFoundException {
      elementInfo.remove( elementInfo.size() - 1);
      
      save = new PrintWriter( elements);
      
      for( String i : elementInfo) {
         save.println( i);
      }
      save.close();  
   }
}

