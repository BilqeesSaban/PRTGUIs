import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfileGUI extends JFrame implements ActionListener
{
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    private JLabel lblIcon;
    private JTable tblDetails;
    private JLabel lblHeading;
    private JButton btnMainMenu;
    private Font ftContent, ftHeading, ftButtons;

    public ProfileGUI()
    {
        super("Profile Page");


        lblHeading = new JLabel("Profile Details");
        lblIcon = new JLabel(new ImageIcon("ProfilePicture.png"));

        String[][] data =
                {
                        {"25", "Billie", "Bear", "082896695", "23", "Not Delivered"},
                };

        String[] columnNames = {"Customer Number", "First Name", "Surname", "Phone Number", "Order Number", "Order Status"};
        tblDetails = new JTable(data, columnNames);

        btnMainMenu = new JButton("Main Menu");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);

        lblHeading.setFont(ftHeading);

        tblDetails.setFont(ftContent);

        tblDetails.setRowHeight(30);
        tblDetails.setBackground(Color.WHITE);
        JScrollPane sp = new JScrollPane(tblDetails);

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

        c.gridy = 1;
        pane.add(sp, c);

        c.ipadx = 200;
        c.ipady = 20;

        c.insets = new Insets(50,10,20,10);
        btnMainMenu.setBackground(Color.WHITE);
        c.gridy = 2;
        pane.add(btnMainMenu, c);

        getContentPane().add(pane,BorderLayout.CENTER);
        setTitle("Profile");
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
