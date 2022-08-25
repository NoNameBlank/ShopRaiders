package view;

import java.awt.Color;

import javax.swing.JPanel;

import view.shopping.ShoppingPanel;

//Also eine Panel kann nicht einfach Angezeigt werden? Es muss auf einem Frame angezeigt werden?
public class CardPanel extends JPanel {
	
	private ShoppingPanel shoppingPanel;
	
	
	
	
	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}




	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}




	public CardPanel() {
		
		super.setLayout(null);
		super.setBounds(100,150,924,618);
		super.setBackground(Color.PINK);
		
		this.setShoppingPanel(new ShoppingPanel());
		super.add(this.getShoppingPanel());
		
		
	
	
	}

}
