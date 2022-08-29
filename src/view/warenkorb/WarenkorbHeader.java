package view.warenkorb;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarenkorbHeader extends JPanel {

	
	
	private JLabel lblGesamtPreisBetrag;
	private JButton btnKasse;
	
	
	
	
	
	public JLabel getLblGesamtPreisBetrag() {
		return lblGesamtPreisBetrag;
	}





	public void setLblGesamtPreisBetrag(JLabel lblGesamtPreisBetrag) {
		this.lblGesamtPreisBetrag = lblGesamtPreisBetrag;
	}





	public JButton getBtnKasse() {
		return btnKasse;
	}





	public void setBtnKasse(JButton btnKasse) {
		this.btnKasse = btnKasse;
	}





	public WarenkorbHeader() {
		setLayout(null);
		super.setBounds(0,0,924,50);
		super.setBackground(Color.yellow);
		
		this.setBtnKasse(new JButton("Kasse"));
		this.getBtnKasse().setBounds(837,19,77,20);
		super.add(this.getBtnKasse());
		
		this.setLblGesamtPreisBetrag(new JLabel("Gesamt Betrag: 0.0"));
		this.getLblGesamtPreisBetrag().setBounds(671,19,115,20);
		super.add(this.getLblGesamtPreisBetrag());
		
				
	}
	
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getBtnKasse().addActionListener(al);
		
	}
	
}
