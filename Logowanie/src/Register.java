import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame implements ActionListener
{

    JButton  registerButton, backButton;
    JTextField userText, passText;
    JLabel infoLabel;
    Sql sql = new Sql();

    public Register()
    {
        super("Rejestracja");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // głowny panel
        JPanel main = new JPanel();
        BoxLayout bx = new BoxLayout(main, BoxLayout.Y_AXIS);
        main.setLayout(bx);

        // napis na gorze
        JPanel upPanel = new JPanel();
        JLabel upLabel = new JLabel("Stworz użytkownika");
        upPanel.add(upLabel);


        // penel login
        JPanel panelLogin = new JPanel();
        JLabel loginLabel = new JLabel("Login");
        userText = new JTextField(10);
        panelLogin.add(loginLabel);
        panelLogin.add(userText);

        // panel hasło
        JPanel panelPass = new JPanel();
        JLabel passLabel = new JLabel("Hasło");
        passText = new JTextField(10);
        panelPass.add(passLabel);
        panelPass.add(passText);

        // etykiata info
        JPanel lebelPanel = new JPanel();
        infoLabel = new JLabel(" ");
        lebelPanel.add(infoLabel);

        // przycisk
        JPanel buttonPanel = new JPanel();
        registerButton = new JButton("Zarejestruj");
        backButton = new JButton("Wróć");
        buttonPanel.add(registerButton);
        buttonPanel.add(backButton);
        backButton.addActionListener(this);
        registerButton.addActionListener(this);



        // dodawanie do main
        main.add(upPanel);
        main.add(panelLogin);
        main.add(panelPass);
        main.add(lebelPanel);
        main.add(buttonPanel);

        // dodawanie do okna
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(main);



        setVisible(true);
    }







    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source==registerButton)
        {
            if (userText.getText().equals("")) {
                infoLabel.setText("nie podano Loginu");
            } else if (passText.getText().equals("")) {
                infoLabel.setText("nie podano hasła");
            } else if (sql.sprawdz(userText.getText())) {
                infoLabel.setText("Taki uzytkownik juz jest w bazie");
            } else {
                if (sql.dodaj(passText.getText(), userText.getText())) {
                    infoLabel.setText("dodano uzytkownika");
                } else infoLabel.setText("cos poszło nie tak");
            }
        }

        if (source==backButton)
        {
            Okno ok = new Okno();
            dispose();
        }
    }
}
