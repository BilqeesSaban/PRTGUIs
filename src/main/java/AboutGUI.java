import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblHeading;
    private JButton btnMainMenu;
    private Font ftContent, ftHeading, ftButtons;
    private JTextField text;

    public AboutGUI()
    {
        super("About Page");


        lblHeading = new JLabel("About Us");

        text = new JTextField("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

        btnMainMenu = new JButton("Main Menu");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);

        lblHeading.setFont(ftHeading);
        lblHeading.setForeground(Color.WHITE);

        btnMainMenu.setFont(ftButtons);

        btnMainMenu.addActionListener(this);

        JPanel pane = new JPanel();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        pane.setBackground(Color.WHITE);

        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(40,50,40,50);
        c.weightx = 0.1;
        c.weighty = 0.1;
        c.gridwidth = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        pane.add(lblHeading, c);

        c.ipadx = 700;
        c.ipady = 50;

        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10,50,10,50);

        c.ipadx = 200;
        c.ipady = 20;

        c.insets = new Insets(50,10,20,10);
        btnMainMenu.setBackground(Color.WHITE);
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
