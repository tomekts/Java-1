import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftBox implements ActionListener {
    JPanel jj = new JPanel();
    JCheckBox ITXC, uATXC, eATXC,ATXC, socketC,okno, midiC, miniC, microC,fullC, typ;
    JTextField model, producent,wymW,wymS, wymG, waga,gpu,cpu;
    int bla = 50;


    public  LeftBox(){
        BoxLayout flo =  new BoxLayout(jj, BoxLayout.Y_AXIS);
        jj.setLayout(flo);

        JPanel p1 = new JPanel();
        JLabel modelL = new JLabel("Podaj model*");
         model = new JTextField(10);
        p1.add(modelL);
        p1.add(model);

        JPanel p2 = new JPanel();
        JLabel producentL = new JLabel("Podaj producenta*");
         producent = new JTextField(10);
        p2.add(producentL);
        p2.add(producent);

        JPanel p3 = new JPanel();
        JLabel wymL= new JLabel("Wymiar*");
        JLabel wymMm = new JLabel("mm");
        JLabel wymWL=new JLabel("W");
         wymW = new JTextField(3);
        JLabel wymSL=new JLabel("S");
         wymS = new JTextField(3);
        JLabel wymGL=new JLabel("G");
         wymG = new JTextField(3);
        p3.add(wymL);
        p3.add(wymWL);
        p3.add(wymW);
        p3.add(wymSL);
        p3.add(wymS);
        p3.add(wymGL);
        p3.add(wymG);
        p3.add(wymMm);

        JPanel p4 = new JPanel();
        JLabel wagaL= new JLabel("Waga*");
        JLabel wagaMm = new JLabel("kg");
         waga = new JTextField(10);
        p4.add(wagaL);
        p4.add(waga);
        p4.add(wagaMm);

        JPanel p5 = new JPanel();
        JLabel gpuL= new JLabel("Długość GPU*");
        JLabel gpuMm = new JLabel("mm");
         gpu = new JTextField(3);
        p5.add(gpuL);
        p5.add(gpu);
        p5.add(gpuMm);

        JPanel p6 = new JPanel();
        JLabel cpuL= new JLabel("Długość chłodzenia CPU*");
        JLabel cpuMm = new JLabel("mm");
         cpu = new JTextField(3);
        p6.add(cpuL );
        p6.add(cpu);
        p6.add(cpuMm);

        JPanel p7 = new JPanel();
        JLabel oknoL=new JLabel("Czy posiada okno");
         okno = new JCheckBox();
        p7.add(oknoL);
        p7.add(okno);

        JPanel p8 = new JPanel();
        JLabel socketL= new JLabel("Kompatybilność*");
         socketC = new JCheckBox();
         socketC.addActionListener(this);
        JPanel p8A = new JPanel();
        p8A.add(socketL);
        p8A.add(socketC);

        BoxLayout bb = new BoxLayout(p8,BoxLayout.Y_AXIS);
        p8.setLayout(bb);
        p8.add(p8A);
        JPanel p8B = new JPanel();

        //ATX
        JLabel ATXL= new JLabel("ATX");
         ATXC = new JCheckBox();
         ATXC.setEnabled(false);
        p8B.add(ATXL);
        p8B.add(ATXC);

        //e-ATX
        JLabel eATXL= new JLabel("e-ATX");
         eATXC = new JCheckBox();
         eATXC.setEnabled(false);
        p8B.add(eATXL);
        p8B.add(eATXC);
       //   uATX
        JLabel uATXL= new JLabel("Micro ATX");
          uATXC = new JCheckBox();
          uATXC.setEnabled(false);
        p8B.add(uATXL);
        p8B.add(uATXC);

        //Mini ITX
        JLabel ITXL= new JLabel("Mini ITX");
         ITXC = new JCheckBox();
         ITXC.setEnabled(false);
        p8B.add(ITXL);
        p8B.add(ITXC);

       // typ
        JPanel p9 = new JPanel();
        ButtonGroup group = new ButtonGroup();
        JLabel typL= new JLabel("Typ obudowy");
        typ = new JCheckBox();
        typ.addActionListener(this);
        JPanel p9A = new JPanel();
        p9A.add(typL);
        p9A.add(typ);

        BoxLayout dd = new BoxLayout(p9,BoxLayout.Y_AXIS);
        p9.setLayout(dd);
        p9.add(p9A);
        JPanel p9B = new JPanel();

        //Midi
        JLabel midiTL= new JLabel("Midi");
        midiC = new JCheckBox();
        midiC.setEnabled(false);
        p9B.add(midiTL);
        p9B.add(midiC);
        group.add(midiC);

        //Mini
        JLabel miniL= new JLabel("Mini");
        miniC = new JCheckBox();
        miniC.setEnabled(false);
        p9B.add(miniL);
        p9B.add(miniC);
        group.add(miniC);
        //   Micro
        JLabel microL= new JLabel("Micro");
        microC = new JCheckBox();
        microC.setEnabled(false);
        p9B.add(microL);
        p9B.add(microC);
        group.add(microC);

        //Full
        JLabel fullL= new JLabel("Full");
        fullC = new JCheckBox();
        fullC.setEnabled(false);
        p9B.add(fullL);
        p9B.add(fullC);
        group.add(fullC);
        p9.add(p9B);


        p8.add(p8B);
        //dodawania

       jj.add(p2);
       jj.add(p1);
       jj.add(p3);
       jj.add(p4);
       jj.add(p5);
       jj.add(p6);
       jj.add(p7);
       jj.add(p9);
       jj.add(p8);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==typ){
            if (typ.isSelected()) {
                midiC.setEnabled(true);
                miniC.setEnabled(true);
                microC.setEnabled(true);
                fullC.setEnabled(true);
            }
            else if (typ.isSelected()==false){
                midiC.setEnabled(false);
                miniC.setEnabled(false);
                microC.setEnabled(false);
                fullC.setEnabled(false);
            }
        }
        if (source==socketC){
            if (socketC.isSelected()){
                ITXC.setEnabled(true);
                eATXC.setEnabled(true);
                ATXC.setEnabled(true);
                uATXC.setEnabled(true);
            }
            else if (socketC.isSelected()==false){
                ITXC.setEnabled(false);
                eATXC.setEnabled(false);
                ATXC.setEnabled(false);
                uATXC.setEnabled(false);
            }
        }

    }
}
