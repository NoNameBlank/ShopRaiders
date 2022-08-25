package view.warenkorb;

import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;

public class WarenkorbPanel extends JPanel {

	private WarenkorbHeader wkHeader;
	private JPanel cartPanel;
	private List<WarenkorbPanelItem> cartItems;

	public WarenkorbHeader getWkHeader() {
		return wkHeader;
	}

	public void setWkHeader(WarenkorbHeader wkHeader) {
		this.wkHeader = wkHeader;
	}

	public JPanel getCartPanel() {
		return cartPanel;
	}

	public void setCartPanel(JPanel cartPanel) {
		this.cartPanel = cartPanel;
	}

	public List<WarenkorbPanelItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<WarenkorbPanelItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	public WarenkorbPanel() {
		super.setLayout(null);
		super.setBounds(0, 0, 924, 618);
		super.setBackground(Color.GREEN);
		
	}

}
