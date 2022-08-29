package view.shopping;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;

public class ArtikelPanel extends JPanel {

	private JLabel lblProductName;
	private JLabel lblProductPicture;
	private JLabel lblProductDescription;
	private JLabel lblPreis;
	private JSpinner spinnerMenge;
	private JButton warenkorb;

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
	}

	public JLabel getLblProductDescription() {
		return lblProductDescription;
	}

	public void setLblProductDescription(JLabel lblProductDescription) {
		this.lblProductDescription = lblProductDescription;
	}

	public JLabel getLblPreis() {
		return lblPreis;
	}

	public void setLblPreis(JLabel lblPreis) {
		this.lblPreis = lblPreis;
	}

	public JSpinner getSpinnerMenge() {
		return spinnerMenge;
	}

	public void setSpinnerMenge(JSpinner spinnerMenge) {
		this.spinnerMenge = spinnerMenge;
	}

	public JButton getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(JButton warenkorb) {
		this.warenkorb = warenkorb;
	}

	public ArtikelPanel() {

		setLayout(null);
		super.setBackground(Color.WHITE);
		super.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLACK, null));
		super.setPreferredSize(new Dimension(924, 300));

		// Produkt Name
		this.setLblProductName(new JLabel("Name vom Produkt!!!!"));
		this.getLblProductName().setBackground(Color.ORANGE);
		this.getLblProductName().setBounds(325, 11, 130, 25);
		this.getLblProductName().setOpaque(true);
		super.add(this.getLblProductName());

		// Produkt Bild
		this.setLblProductPicture(new JLabel());
		this.getLblProductPicture().setBackground(Color.MAGENTA);
		ImageIcon picGraka = new ImageIcon(ArtikelPanel.class.getResource("/3090.png"));
		ImageIcon scaledIcon = new ImageIcon(picGraka.getImage().getScaledInstance(295, 245, 0));
		this.getLblProductPicture().setIcon(scaledIcon);
		
		this.getLblProductPicture().setBounds(15, 11, 300, 250);
		this.getLblProductPicture().setOpaque(true);
		super.add(this.getLblProductPicture());

		// Produktbeschreibung
		this.setLblProductDescription(new JLabel("Produkt beschreibung: bla bla bla bla bla bla bla bla bla bla bla bla bla"));
		this.getLblProductDescription().setBackground(Color.ORANGE);
		this.getLblProductDescription().setBounds(326, 86, 300, 100);
		this.getLblProductDescription().setOpaque(true);
		super.add(this.getLblProductDescription());

		// Label als Titel für den EinzelPreis
		// Wurde jetzt Lokal im Konstruktor erstellt da keine wirkliche Aufgabe, sonder
		// Bezeichnet nur ein anderes Label
		JLabel lblPreisTitel = new JLabel("Einzelpreis:");
		lblPreisTitel.setBackground(Color.pink);
		lblPreisTitel.setBounds(325, 225, 65, 25);
		lblPreisTitel.setOpaque(true);
		super.add(lblPreisTitel);

		// EinzelPreis in 0.0
		this.setLblPreis(new JLabel("0.0"));
		this.getLblPreis().setBackground(Color.RED);
		this.getLblPreis().setBounds(424, 225, 50, 25);
		this.getLblPreis().setOpaque(true);
		super.add(this.getLblPreis());

		// Spinner
		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
		this.setSpinnerMenge(new JSpinner(model));
		this.getSpinnerMenge().setBounds(850, 26, 50, 20);
		this.getSpinnerMenge().setOpaque(true);
		super.add(this.getSpinnerMenge());

		// Warenkorb Btn
		this.setWarenkorb(new JButton("Warenkorb"));
		this.getWarenkorb().setBackground(Color.gray);
		this.getWarenkorb().setBounds(776, 250, 100, 25);
		this.getWarenkorb().setOpaque(true);
		super.add(this.getWarenkorb());

	}
		//konstruktur mit gezielten Parameter für die Kategorien abfrage
		public ArtikelPanel(String name, String bild, String produktBeschr, double preis ) {
			this(); //?
			this.getLblProductName().setText(name);
			this.getLblProductPicture().setText(bild);
			this.getLblProductDescription().setText(produktBeschr);
			this.getLblPreis().setText("euroi" + preis);
		}






}

