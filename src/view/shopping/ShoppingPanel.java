package view.shopping;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ShoppingPanel extends JPanel {

	private JPanel displayPanel;
	private List<ArtikelPanel> artikelList;
	private JScrollPane sPane;

	public JPanel getDisplayPanel() {
		return displayPanel;
	}

	public void setDisplayPanel(JPanel displayPanel) {
		this.displayPanel = displayPanel;
	}

	public List<ArtikelPanel> getArtikelList() {
		return artikelList;
	}

	public void setArtikelList(List<ArtikelPanel> artikelList) {
		this.artikelList = artikelList;
	}

	public JScrollPane getsPane() {
		return sPane;
	}

	public void setsPane(JScrollPane sPane) {
		this.sPane = sPane;
	}

	public ShoppingPanel() {
		super.setLayout(null);
		super.setBounds(0, 0, 924, 618);
		super.setBackground(Color.ORANGE);
		super.setOpaque(true);

		this.setDisplayPanel(new JPanel());
		this.getDisplayPanel().setLayout(new GridLayout(20, 1));

		this.setsPane(new JScrollPane());
		this.getsPane().setBounds(0, 0, 910, 618);
		this.getsPane().setViewportView(this.getDisplayPanel());
		this.getsPane().getVerticalScrollBar().setUnitIncrement(16);
		super.add(this.getsPane());

		for (int i = 0; i < 3; i++) {
			this.getDisplayPanel().add(new ArtikelPanel());
		}

	}

}
