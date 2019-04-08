import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplikacja extends JFrame implements ActionListener {

    JButton gen;
    Text tx = new Text();
    LeftBox left = new LeftBox();


    public Aplikacja(){
        super("Edytor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        BorderLayout br = new BorderLayout();
        setLayout(br);
        // pasek gorny
        PasenMenu pasek = new PasenMenu();
        setJMenuBar(pasek.meni);
        // lewy box

        add(left.jj,BorderLayout.WEST);
        // prawy box
        RighBox right = new RighBox();
        add(right.pane,BorderLayout.EAST);
        // srodek

        add(tx.pane, BorderLayout.CENTER);
        gen = new JButton("Generuj");
        gen.addActionListener(this);

        add(gen,BorderLayout.SOUTH);
        pack();



        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==gen){
            tx.textZmiana(left);
        }
    }
}
