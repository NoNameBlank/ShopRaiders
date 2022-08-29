package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.kategorie.KategoriePanel;

public class MainPanel extends JPanel {
	
	private HeaderPanel headerPanel;
	private CardPanel cardPanel;
	private KategoriePanel kategoriePanel;
	
	
	
	
	
	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}



	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}

	
	


	public CardPanel getCardPanel() {
		return cardPanel;
	}



	public void setCardPanel(CardPanel cardPanel) {
		this.cardPanel = cardPanel;
	}

	
	


	public KategoriePanel getKategoriePanel() {
		return kategoriePanel;
	}



	public void setKategoriePanel(KategoriePanel kategoriePanel) {
		this.kategoriePanel = kategoriePanel;
	}



	public MainPanel() {
		super.setLayout(null);
		super.setBounds(0,0,1024, 794);
		super.setBackground(Color.green);
		
		this.setHeaderPanel(new HeaderPanel());
		super.add(this.getHeaderPanel());
		
		this.setCardPanel(new CardPanel());
		super.add(this.getCardPanel());
		
		this.setKategoriePanel(new KategoriePanel());
		super.add(this.getKategoriePanel());
		
		
		
	}
	
	//BtnWarenkorb MainPanel wird gesagt was zutun ist
	public void addActionListenerToBtnWarenkorb(ActionListener al) {
		this.getHeaderPanel().addActionListenerToBtnWarenkorb(al);
	}
	
	//BtnKasse 
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getCardPanel().getWarenKorbPanel().addActionListenerToBtnKasse(al);
	}
	
	//Befehl für Warenkorb anzeigen
	public void  showWarenkorb() {
		this.getCardPanel().showWarenkorbPanel();
	}

	public void showKassePanel() {
		this.getCardPanel().showKassePanel();
	}

}
