package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.kasse.KassePanel;
import view.shopping.ShoppingPanel;
import view.warenkorb.WarenkorbPanel;

//Also eine Panel kann nicht einfach Angezeigt werden? Es muss auf einem Frame angezeigt werden?
public class CardPanel extends JPanel {

	private ShoppingPanel shoppingPanel;
	private WarenkorbPanel warenKorbPanel;
	private KassePanel kassePanel;
	
	private CardLayout cardLayout;
	
	private final String warenkorb = "warenkorb";
	private final String kasse = "kasse";
	
	
	
	
	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}

	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}

	public WarenkorbPanel getWarenKorbPanel() {
		return warenKorbPanel;
	}

	public void setWarenKorbPanel(WarenkorbPanel warenKorbPanel) {
		this.warenKorbPanel = warenKorbPanel;
	}

	
		
	
	
	//CardLayout = Layoutmanager
	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}
	
	
	

	public KassePanel getKassePanel() {
		return kassePanel;
	}

	public void setKassePanel(KassePanel kassePanel) {
		this.kassePanel = kassePanel;
	}

	public CardPanel() {

		
		super.setBounds(100, 150, 924, 618);
		super.setBackground(Color.PINK);
		
		this.setCardLayout(new CardLayout());
		super.setLayout(this.getCardLayout());
		
		this.setShoppingPanel(new ShoppingPanel());
		super.add(this.getShoppingPanel());
		
		this.setWarenKorbPanel(new WarenkorbPanel());
		super.add(this.getWarenKorbPanel(),  this.warenkorb);
		
		this.setKassePanel(new KassePanel());
		super.add(this.getKassePanel(), this.kasse);
		

	}
	
	public void showWarenkorbPanel() {
		this.getCardLayout().show(this, this.warenkorb);
	}

	public void showKassePanel() {
		this.getCardLayout().show(this, this.kasse);
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWarenKorbPanel().addActionListenerToBtnKasse(al);
	}
	
}
