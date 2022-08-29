package view.shopping;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
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

		this.setArtikelList(new ArrayList<>());

		for (int i = 0; i < 3; i++) {
			this.getDisplayPanel().add(new ArtikelPanel());
		}

	}

	public void showSearchResults(String name, String bild, String produktBeschr, double preis) {
		this.getArtikelList().clear();
		if (bild.equals("Kat1 ")) {
			System.out.println("Kat 1 gedrückt ShoppingPanel ausgabe");
			for (int i = 0; i < 10; i++) {
				this.getArtikelList()
						.add(new ArtikelPanel(name + " " + i, bild + " " + i, produktBeschr + " " + i, +preis));
			}

		} else if (bild.equals("Kat2 ")) {
			System.out.println("Kat 2 gedrückt ShoppingPanel ausgabe");
			for (int i = 0; i < 10; i++) {
				this.getArtikelList()
						.add(new ArtikelPanel(name + " " + i, bild + " " + i, produktBeschr + " " + i, +preis));
			}
		} else if (bild.equals("Kat3 ")) {
			System.out.println("Kat 3 gedrückt ShoppingPanel ausgabe");
			for (int i = 0; i < 10; i++) {
				this.getArtikelList()
						.add(new ArtikelPanel(name + " " + i, bild + " " + i, produktBeschr + " " + i, +preis));
			}
		

		}

		// Alle ArtikelPanel entfernen
		this.getDisplayPanel().removeAll();
		// Dem AnzeigePanel ein neues GridLayout geben, da so viele Zeilen benoetigt
		// werden,
		// wie Panels in der Liste sind.
		this.getDisplayPanel().setLayout(new GridLayout(this.getArtikelList().size(), 1));
		// Dem AnzeigePanel die Artikelpanel hinzufuegen.
		this.getArtikelList().forEach(item -> this.getDisplayPanel().add(item));
		// Das Anzeigepanel muss neu gemalt werden.
		super.revalidate();
		super.repaint();

	}

}
