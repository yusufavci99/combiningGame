import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main( String[] args) throws FileNotFoundException {

        GameTestFrame test;
        test = new GameTestFrame();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        WindowListener ci;
//        ci = new WindowAdapter(){
//            @Override
//            public void windowClosing( WindowEvent e) {
//                try {
//                    System.out.println("HELLO");
//                    FileOutputStream fos;
//                    ObjectOutputStream oos;
//                    fos = new FileOutputStream("gamesave.ser");
//                    System.out.println("HELLO");
//                    oos = new ObjectOutputStream( fos);
//                    System.out.println("HELLO");
//                    oos.writeObject( test);
//                    System.out.println("HELLOX");
//                    oos.close();
//                    System.exit(0);
//                }
//                catch ( IOException ex){
//                    ex.printStackTrace();
//                }
//                //System.exit(0);
//            }
//
//        };
//        test.addWindowListener( ci);

    }


}
