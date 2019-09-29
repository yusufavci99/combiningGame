import javax.swing.*;

public class ElementButton extends JButton {

    String ingredient1;
    String ingredient2;
    String name;

    boolean added;

    public ElementButton(String name, String ingredient1, String ingredient2) {

        // Button text is not set, because names must be hidden for some of the elements.
        super();
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;

        added = false;

        // Grays out locked elements
        setEnabled(false);
    }
}