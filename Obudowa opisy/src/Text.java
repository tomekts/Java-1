import javax.swing.*;

public class Text  {

    private LeftBox okno_obj;
    JPanel pane = new JPanel();
    JTextArea place;
    LeftBox ll = new LeftBox();
    String modli="bla";



    public Text(){
        place = new JTextArea("By Tomek",20,80);
        place.setLineWrap(true);
        place.setWrapStyleWord(true);
        pane.add(place);

    }
    public void textZmiana(LeftBox dd){
        okno_obj=dd;
        String typObudowy="";
        if (okno_obj.typ.isSelected()){
            typObudowy+=" typu ";
            if (okno_obj.fullC.isSelected())
                typObudowy+="Full Tower,";
            if (okno_obj.microC.isSelected())
                typObudowy+="Micro Tower,";
            if (okno_obj.miniC.isSelected())
                typObudowy+="Mini Tower,";
            if (okno_obj.midiC.isSelected())
                typObudowy+="Midi Tower,";
        }
        String kompatybil="";
        if (okno_obj.socketC.isSelected()){
            kompatybil+="a w jej wnętrzu znalazło się miejsce na płytę główną w formacie ";
            if (okno_obj.ATXC.isSelected())
                kompatybil+="ATX,";
            if (okno_obj.uATXC.isSelected())
                kompatybil+=" Micro ATX,";
            if (okno_obj.ITXC.isSelected())
                kompatybil+=" Mini ITX,";
            if (okno_obj.eATXC.isSelected())
                kompatybil+=" E-ATX";
        }
        String okno="";
        if (okno_obj.okno.isSelected()){
            okno="Nie zabrakło również bocznego okna.";
        }


        place.setText(okno_obj.model.getText()+", to obudowa"+typObudowy+" firmy "+okno_obj.producent.getText()+" posiadająca nowoczesny wygląd, który może przypaść do gustu osobom ceniącym sobie design komputera.\n" +
                "Została wykonana z wysokiej jakości komponentów oraz oferuje funkcjonalność, która powinna spełnić oczekiwania nawet najbardziej wymagających konsumentów.\n" +
                "Cała konstrukcja ma wymiary "+okno_obj.wymG.getText()+"x"+okno_obj.wymS.getText()+"x"+okno_obj.wymW.getText()+"mm, "+kompatybil+".\n" +
                "Oprócz tego użytkownik może w niej zamontować kartę graficzną o maksymalnej długości "+okno_obj.gpu.getText()+" mm oraz układ chłodzenia o wysokości do "+okno_obj.cpu.getText()+" mm.\n"+
                "Cała konstrukcja została starannie wykonana z wysokiej jakości komponentów, ważąc "+okno_obj.waga.getText()+"kg.\n"+okno
        );


    }
}

