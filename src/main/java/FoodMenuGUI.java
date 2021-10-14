import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodMenuGUI extends JFrame implements ActionListener
{
    private JTable tblItem;
    private JLabel lblMenu;
    private JButton btnMainMenu;
    private Font ftContent, ftHeading, ftButtons;

    public FoodMenuGUI()
    {
        super("FoodMenu");

        JLabel lblItem = new JLabel("Food Menu");

        String[][] data =
                {
                        {"001", "Pizza", "R 10 "},
                        {"002", "Burger", "R 15 "},
                        {"003", "Wrap", "R 12"},
                };

        String[] columnNames = {"ID", "Item", "Price"};
        tblItem = new JTable(data, columnNames);

        btnMainMenu = new JButton("Main Menu");

        ftHeading = new Font("Arial", Font.BOLD, 40);
        ftContent = new Font("Arial", Font.PLAIN, 17);
        ftButtons = new Font("Arial", Font.PLAIN, 19);

        lblItem.setFont(ftHeading);

        tblItem.setFont(ftContent);

        tblItem.setRowHeight(30);
        JScrollPane sp = new JScrollPane(tblItem);

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
        pane.add(lblItem, c);

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
        setTitle("Food Menu");
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
