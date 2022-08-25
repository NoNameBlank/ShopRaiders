package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HeaderPanel extends JPanel {
	
	private JButton btnWarenkorb;
	
	
	
	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}



	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
	}



	public HeaderPanel() {
		
		setLayout(null);
		super.setBounds(0,0,1024,150);
		super.setBackground(Color.RED);
		super.setVisible(true);
		
		
		this.setBtnWarenkorb(new JButton("WarenKorb"));
		this.getBtnWarenkorb().setBounds(770,97,111,30);
		super.add(this.getBtnWarenkorb());
		
		
		
	}
	
	

}
