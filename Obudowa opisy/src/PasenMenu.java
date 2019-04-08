import javax.swing.*;

public class PasenMenu  {

    public JMenuBar meni;

    public PasenMenu() {
        meni = new JMenuBar();
        JMenuItem save = new JMenuItem("Zapisz");
        JMenuItem load = new JMenuItem("Wczytaj");
        JMenuItem exit = new JMenuItem("Zamknij");
        JMenu opcje = new JMenu("Opcje");
        opcje.add(save);
        opcje.add(load);
        opcje.addSeparator();
        opcje.add(exit);
        // zakladka wyglad
        JMenuItem nimbus = new JMenuItem("Nimbus");
        JMenuItem windows = new JMenuItem("Windows");
        JMenu wyglad = new JMenu("Wygląd");
        wyglad.add(nimbus);
        wyglad.add(windows);
        meni.add(opcje);
        meni.add(wyglad);
    }
}
