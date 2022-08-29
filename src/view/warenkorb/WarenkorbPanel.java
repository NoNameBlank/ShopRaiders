package view.warenkorb;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		super.setBounds(0, 0, 924, 650);
		super.setBackground(Color.GREEN);
		
		this.setWkHeader(new WarenkorbHeader());
		super.add(this.getWkHeader());
		
		this.setCartItems(new ArrayList<>());
		for (int i = 0; i < 10; i++) {
			this.getCartItems().add(new WarenkorbPanelItem());
		}
		this.setCartPanel(new JPanel());
		this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(),0));
		
		JScrollPane scrollPane = new JScrollPane(this.getCartPanel());
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.setBounds(0, 50, 924, 618);
		this.add(scrollPane);
		
		for (int i = 0; i < this.getCartItems().size(); i++) {
			this.getCartPanel().add(this.getCartItems().get(i));
		}
		
	}
	
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkHeader().addActionListenerToBtnKasse(al);
	}

}
