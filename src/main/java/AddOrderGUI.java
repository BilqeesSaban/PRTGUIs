import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOrderGUI extends JFrame implements ActionListener {
    private JPanel panelN, panelC, panelS;
    private JLabel lblQuantity, lblName, lblItem, lblHeading;
    private JTextField txtQuantity, txtName, txtItem;
    private JButton btnMainMenu;
    private JButton btnSave, btnClear, btnExit;

    public AddOrderGUI() {
        super("Order");
        panelN = new JPanel();
        panelS = new JPanel();
        panelC = new JPanel();

        lblHeading= new JLabel("Order");

        lblName = new JLabel("Name: ",SwingConstants.LEFT);
        txtName = new JTextField();
        lblItem = new JLabel("Item: ",SwingConstants.LEFT);
        txtItem = new JTextField();
        lblQuantity = new JLabel("Quantity: ",SwingConstants.LEFT);
        txtQuantity = new JTextField();

        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");
        btnExit = new JButton("Exit");

        panelN.setLayout(new GridLayout(1,2));
        panelS.setLayout(new GridLayout(1,3));
        panelC.setLayout(new GridLayout(6,3));

        panelN.add(lblHeading);

        panelC.add(lblName);
        panelC.add(txtName);
        panelC.add(lblItem);
        panelC.add(txtItem);
        panelC.add(lblQuantity);
        panelC.add(txtQuantity);

        panelS.add(btnSave);
        panelS.add(btnClear);
        panelS.add(btnExit);

        this.add(panelS, BorderLayout.SOUTH);
        this.add(panelC, BorderLayout.CENTER);
        this.add(panelN, BorderLayout.NORTH);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
        btnExit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Clear"))
        {
            txtName.setText("");
            txtItem.requestFocus();
            txtQuantity.setText("");
        }
        else if (e.getActionCommand().equals("Exit"))
        {
            System.exit(0);
        }

        switch (e.getActionCommand()) {
            case "Main Menu":
                LandingPageGUI main = new LandingPageGUI();
                main.getContentPane();
                this.dispose();
            default:
                break;

        }
    }
}
