import DisplayConnections.ConnectionManager;
import DisplayConnections.Direction;
import DisplayConnections.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

@SuppressWarnings("ALL")
public class GUI extends JFrame{
    private JPanel mainPanel;
    public JComboBox mainMonitorSelect;
    private JLabel MainDisplayText;
    private JComboBox secondMonitorSelect;
    private JComboBox posSelect;
    private JButton setButton;
    private JButton removeAllButton;
    private JLabel textOutput;
    private JButton applyButton;
    private JLabel SecondDisplayText;
    private JLabel RelPosText;
    private final ConnectionManager connectionManager;

    public GUI(String title, ConnectionManager connectionManager){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setVisible(true);
        this.connectionManager = connectionManager;

        setButton.addActionListener(e -> {
            Direction direction = Direction.values()[posSelect.getSelectedIndex()];
            Integer mainMonitor = mainMonitorSelect.getSelectedIndex();
            Integer secondMonitor = secondMonitorSelect.getSelectedIndex();
            connectionManager.connect(mainMonitor, secondMonitor, direction);
            textOutput.setText("Connected display " + secondMonitor + " to display " + mainMonitor + "'s " + direction.toString());

        });
        removeAllButton.addActionListener(e -> {
            connectionManager.clearConnections();
            textOutput.setText("Cleared all connections");
        });
        applyButton.addActionListener(e -> {
            //TODO
            textOutput.setText("Applied");
        });
    }

    private void updateCombo(JComboBox comboBox, String[] items){
        comboBox.removeAllItems();
        for (String item : items){
            comboBox.addItem(item);
        }
    }

    public void updateMonitorBoxes(){
        ArrayList<String> dropDownOptions = new ArrayList<>();
        for (Display display : connectionManager.getDisplays()){
            dropDownOptions.add(display.getComboName());
        }
        updateCombo(mainMonitorSelect, dropDownOptions.toArray(new String[0]));
        updateCombo(secondMonitorSelect, dropDownOptions.toArray(new String[0]));
    }
}

