import javax.swing.*;

public class RighBox {

    JPanel pane = new JPanel();

    public RighBox(){
        BoxLayout box = new BoxLayout(pane,BoxLayout.Y_AXIS);
        pane.setLayout(box);
        JButton but1 = new JButton("kot");
        JButton but2 = new JButton("pies");
        JButton but3 = new JButton("rok");
        JButton but4 = new JButton("mik");
        JButton but5 = new JButton("czesc");
        JButton but6 = new JButton("lubie");
        JButton but7 = new JButton("aligator");
        pane.add(but1);
        pane.add(but2);
        pane.add(but3);
        pane.add(but4);
        pane.add(but5);
        pane.add(but6);
        pane.add(but7);
    }
}
