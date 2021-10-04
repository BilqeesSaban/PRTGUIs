import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LandingPageGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    private JLabel lblIcon;
    private JButton btnProfile, btnFoodMenu, btnOrders, btnAbout, btnHelp, btnLogout;
    private Font ftButtons;

    public LandingPageGUI()
    {
        super("WELCOME");

        lblIcon = new JLabel(new ImageIcon("Images/logo.png"));
        JPanel logopnl = new JPanel();
        logopnl.add(lblIcon);
        getContentPane().add(logopnl,BorderLayout.NORTH);

        btnProfile = new JButton("Profile");
        btnFoodMenu = new JButton("FoodMenu");
        btnOrders = new JButton("Orders");
        btnAbout = new JButton("About");
        btnHelp = new JButton("Help");
        btnLogout = new JButton("Logout");

        ftButtons = new Font("Arial", Font.PLAIN, 19);

        Color greenMint = new Color(159,234,201);

        logopnl.setBackground(greenMint);
        btnProfile.setBackground(greenMint);
        btnFoodMenu.setBackground(greenMint);
        btnOrders.setBackground(greenMint);
        btnAbout.setBackground(greenMint);
        btnHelp.setBackground(greenMint);
        btnLogout.setBackground(greenMint);

        btnProfile.addActionListener(this);
        btnFoodMenu.addActionListener(this);
        btnOrders.addActionListener(this);
        btnAbout.addActionListener(this);
        btnHelp.addActionListener(this);
        btnLogout.addActionListener(this);

        Container pane = new Container();
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
        pane.add(btnProfile, c);

        c.insets = new Insets(10,50,10,50);
        c.gridy++;
        pane.add(btnFoodMenu, c);

        c.gridy++;
        pane.add(btnOrders, c);

        c.gridy++;
        pane.add(btnAbout, c);

        c.gridy++;
        pane.add(btnHelp, c);

        c.gridy++;
        pane.add(btnLogout, c);
        getContentPane().add(pane,BorderLayout.CENTER);
        setTitle("WELCOME");
        getContentPane().setBackground(greenMint);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new LandingPageGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getActionCommand().equals("Profile"))
        {
         ProfileGUI profileGUI = new ProfileGUI();
         this.dispose();
        }
        if (e.getActionCommand().equals("Orders"))
        {
            OrdersGUI ordersGUI = new OrdersGUI();
            this.dispose();
        }
        if (e.getActionCommand().equals("About"))
        {
            AboutGUI aboutGUI = new AboutGUI();
            this.dispose();
        }
        if (e.getActionCommand().equals("Help"))
        {
            HelpGUI helpGUI = new HelpGUI();
            this.dispose();
        }
        if (e.getActionCommand().equals("Logout"))
        {
            LogoutGUI logoutGUI = new LogoutGUI();
            this.dispose();
        }
    }
}
