import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Apk extends JFrame implements ActionListener {

    JPanel jj= new JPanel();
    JButton input, output;
    JTextArea text = new JTextArea(30,30);
    Sql s = new Sql();


    public Apk(){
        super("logi");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout main = new BoxLayout(jj, BoxLayout.Y_AXIS);
        jj.setLayout(main);
        input = new JButton("pobierz");
        input.addActionListener(this);
        //output = new JButton("zaloguj");
        //output.addActionListener(this);
        JPanel but = new JPanel();
        but.add(input);
        //but.add(output);
        jj.add(text);
        jj.add(but);
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(jj);

        pack();
        setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object sorce = e.getSource();
        if (sorce==input){
            text.setText(String.valueOf(s.pobierz()));
        }
    }
}
