import java.io.*;
import java.util.Scanner;

public class ElementEditor {
   public static void main( String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner( System.in);
      
      final String EDITOR_OPTIONS = "1 - ADD NEW ELEMENT\n2 - SAVE CHANGES\n" +
         "3 - DELETE LAST ELEMENT";
      ElementSet editor = new ElementSet();
      int option;
      option = -1;
      while( option != 9) {
         System.out.println(EDITOR_OPTIONS);
         option = scan.nextInt();
         
         if( option == 1) {
            scan.nextLine();
            System.out.println( "1 - NAME\n2 - ING1\n3 - ING2");
            editor.addElement( scan.nextLine(), scan.nextLine(), scan.nextLine());
         }
         else if( option == 2) {
            editor.saveElements();
         }
         else if( option == 3) {
            editor.deleteLastElement();
         }
      }
   }
}