package view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class KategoriePanel extends JPanel {

	private List<JMenuItem> katList;


	public List<JMenuItem> getKatList() {
		return katList;
	}


	public void setKatList(List<JMenuItem> katList) {
		this.katList = katList;
	}


	public KategoriePanel() {
		//super.setLayout(null); sofern der Befehl drin ist zeichnet er nicht die Bottuns
		super.setBounds(0, 150, 100, 618);
		super.setBackground(Color.WHITE);
		
		
		this.setKatList(new ArrayList<>());
		
		
		String[] kategories = {"Kat 1", "Kat 2", "Kat 3"};
		System.out.println(kategories[0]);
		Arrays.stream(kategories).forEach(k-> this.getKatList().add(new JMenuItem(k)));
		
		this.getKatList().forEach(item-> super.add(item));

	}

}
