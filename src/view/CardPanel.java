package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import view.shopping.ShoppingPanel;
import view.warenkorb.WarenkorbPanel;

//Also eine Panel kann nicht einfach Angezeigt werden? Es muss auf einem Frame angezeigt werden?
public class CardPanel extends JPanel {

	private ShoppingPanel shoppingPanel;
	private WarenkorbPanel warenKorbPanel;
	private HeaderPanel headerPanel;

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

		
	
	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}

	public CardPanel() {

		super.setLayout(null);
		super.setBounds(100, 150, 924, 618);
		super.setBackground(Color.PINK);

		this.setShoppingPanel(new ShoppingPanel());
		super.add(this.getShoppingPanel());
		
		this.setWarenKorbPanel(new WarenkorbPanel());
		super.add(this.getWarenKorbPanel());

	}

	public void addActionListenerToBtnWarenkorb(ActionListener al) {
		this.getHeaderPanel().addActionListenerToBtnWarenkorb(al);
	}
	
	public void showWarenkorbPanel() {
		this.showWarenkorbPanel();
	}

}
