package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {

	
	private JButton btnStart;
	
	
	
	public JButton getBtnStart() {
		return btnStart;
	}



	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}



	public StartPanel() {
		super.setLayout(null);		
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.BLUE);
		
		
		
		JLabel lblHauptLogo = new JLabel("New label");
		lblHauptLogo.setBounds(298, 72, 209, 77);
		add(lblHauptLogo);
		
		
		/*
		this.setBtnStart(new JButton("Zum Shop"));
		this.getBtnStart().setBounds(288,365, 120, 23);
		super.add(this.getBtnStart());
		*/
		
		
		JButton btnStart = new JButton("Zum Shop");
		btnStart.setBounds(288, 365, 120, 23);
		add(btnStart);
		
		
		JButton btnAktualisieren = new JButton("Aktuallisieren");
		btnAktualisieren.setBounds(412, 364, 114, 23);
		add(btnAktualisieren);
		
		super.setVisible(true);
		
	}
}
