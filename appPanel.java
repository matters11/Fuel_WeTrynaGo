import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class appPanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 800;
    static final int SCREEN_HEIGHT = 600;
    JButton calculateButton;
    JTextField orbitAltitude;
    JTextField satelliteDryMass; //no fuel in sattelite
    JTextField fuelAtStart; //fuel at start
    JTextField engineEfficiency;
    JTextField crossSectionArea; // size of the satellites facing the directon its going
    JTextField deorbitReserve; //fuel u do not spend on going
    JTextField missionLength;
    JTextField sunActivity;

    appPanel(){
        //just setting up the layout
        this.setLayout(null);
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        orbitAltitude = new JTextField();
        satelliteDryMass = new JTextField();
        fuelAtStart = new JTextField();
        engineEfficiency = new JTextField();
        crossSectionArea = new JTextField();
        deorbitReserve = new JTextField();
        missionLength = new JTextField();
        sunActivity = new JTextField();
        calculateButton = new JButton("Calculate!");
        orbitAltitude.setBounds(100, 35, 100, 25);
        satelliteDryMass.setBounds(100, 60, 100, 25);
        fuelAtStart.setBounds(100, 80, 100, 25);
        engineEfficiency.setBounds(100, 105, 100, 25);
        crossSectionArea.setBounds(100, 130, 100, 25);
        deorbitReserve.setBounds(100, 155, 100, 25);
        missionLength.setBounds(100, 180, 100, 25);
        sunActivity.setBounds(100, 205, 100, 25);
        calculateButton.setBounds(100, 240, 100, 25);
        calculateButton.addActionListener(this);
        JLabel orbitLabel = new JLabel("Orbit Altitude:");
        JLabel massLabel = new JLabel("Satelite Mass:");
        JLabel fuelStart = new JLabel("Fuel At Start:");
        JLabel efficiencyLabel = new JLabel("Engine Efficiency:");
        JLabel crossLabel = new JLabel("Cross Section Area:");
        JLabel deorbitLabel = new JLabel("Deorbit Mass");
        JLabel lengthLabel = new JLabel("Mission Length:");
        JLabel sunLabel = new JLabel("Sun Activity:");
        orbitLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        massLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        fuelStart.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        efficiencyLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        crossLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        deorbitLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        lengthLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        sunLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15 ));
        orbitLabel.setBounds(5, -5, 100, 100);
        massLabel.setBounds(5, 20, 100, 100);
        fuelStart.setBounds(5, 45, 100, 100);
        efficiencyLabel.setBounds(5, 70, 100, 100);
        crossLabel.setBounds(5, 95, 100, 100);
        deorbitLabel.setBounds(5, 120, 100, 100);
        lengthLabel.setBounds(5, 145, 100, 100);
        sunLabel.setBounds(5, 170, 100, 100);
        this.add(calculateButton);
        this.add(orbitAltitude);
        this.add(orbitLabel);
        this.add(satelliteDryMass);
        this.add(massLabel);
        this.add(fuelAtStart);
        this.add(fuelStart);
        this.add(engineEfficiency);
        this.add(efficiencyLabel);
        this.add(crossSectionArea);
        this.add(crossLabel);
        this.add(deorbitReserve);
        this.add(deorbitLabel);
        this.add(missionLength);
        this.add(lengthLabel);
        this.add(sunActivity);
        this.add(sunLabel);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}