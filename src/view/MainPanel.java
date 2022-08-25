package view;

import java.awt.Color;

import javax.swing.JPanel;

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
		super.setBounds(0,0,1024, 768);
		super.setBackground(Color.green);
		
		this.setHeaderPanel(new HeaderPanel());
		super.add(this.getHeaderPanel());
		
		this.setCardPanel(new CardPanel());
		super.add(this.getCardPanel());
		
		this.setKategoriePanel(new KategoriePanel());
		super.add(this.getKategoriePanel());
		
		
		
	}
	
	
	

}
