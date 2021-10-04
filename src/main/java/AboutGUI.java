import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblHeading, text;
    private JButton btnMainMenu;
    private Font ftContent, ftHeading, ftButtons;


    public AboutGUI()
    {
        super("About Page");

        Color greenMint = new Color(159,234,201);
        lblHeading = new JLabel("About Us");
        text= new JLabel("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        btnMainMenu = new JButton("Main Menu");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);

        lblHeading.setFont(ftHeading);

        btnMainMenu.setFont(ftButtons);

        btnMainMenu.addActionListener(this);

        JPanel pane = new JPanel();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        pane.setBackground(greenMint);

        c.weightx = 0.1;
        c.weighty = 0.1;

        c.anchor = GridBagConstraints.CENTER;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridheight = 1;
        c.ipady = 20;
        c.ipadx = 100;
        c.insets = new Insets(50,50,10,50);
        c.gridx = 1;
        c.gridy = 0;
        pane.add(lblHeading, c);

        c.insets = new Insets(10,50,10,50);
        c.gridy++;
        pane.add(text, c);

        c.gridy++;
        pane.add(btnMainMenu, c);


        c.insets = new Insets(50,10,20,10);
        btnMainMenu.setBackground(greenMint);
        c.gridy = 2;
        pane.add(btnMainMenu, c);


        getContentPane().add(pane,BorderLayout.CENTER);
        setTitle("About");
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand())
        {
            case "Main Menu":
                LandingPageGUI main = new LandingPageGUI();
                main.getContentPane();
                this.dispose();
            default:
                break;
        }
    }
}
