package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class StartPanel extends JPanel {

	
	public StartPanel() {
				
		setLayout(null);
		
		JLabel lblHauptLogo = new JLabel("New label");
		lblHauptLogo.setBounds(298, 72, 209, 77);
		add(lblHauptLogo);
		
		JButton btnStart = new JButton("Zum Shop");
		btnStart.setBounds(288, 365, 120, 23);
		add(btnStart);
		
		JButton btnAktualisieren = new JButton("Aktuallisieren");
		btnAktualisieren.setBounds(412, 364, 114, 23);
		add(btnAktualisieren);
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(new Color(192, 192, 192));
		super.setVisible(true);
		
	}
}
