package view.warenkorb;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class WarenkorbPanelItem extends JPanel {

	private JLabel lblProductPicture;
	private JButton btnEntfernen;
	private JLabel lblProductName;
	private JLabel lblProductText;
	private JSpinner anzahlArtikel;
	private JLabel lblEinzelpreis;
	private JLabel lblGesamtPreis;

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
	}

	public JButton getBtnEntfernen() {
		return btnEntfernen;
	}

	public void setBtnEntfernen(JButton btnEntfernen) {
		this.btnEntfernen = btnEntfernen;
	}

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblProductText() {
		return lblProductText;
	}

	public void setLblProductText(JLabel lblProductText) {
		this.lblProductText = lblProductText;
	}

	public JSpinner getAnzahlArtikel() {
		return anzahlArtikel;
	}

	public void setAnzahlArtikel(JSpinner anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}

	public JLabel getLblEinzelpreis() {
		return lblEinzelpreis;
	}

	public void setLblEinzelpreis(JLabel lblEinzelpreis) {
		this.lblEinzelpreis = lblEinzelpreis;
	}

	public JLabel getLblGesamtPreis() {
		return lblGesamtPreis;
	}

	public void setLblGesamtPreis(JLabel lblGesamtPreis) {
		this.lblGesamtPreis = lblGesamtPreis;
	}

	public WarenkorbPanelItem() {
		super.setPreferredSize(new Dimension(924, 165));
		super.setLayout(null);

		this.setLblProductPicture(new JLabel());
		this.getLblProductPicture().setBackground(Color.ORANGE);
		this.getLblProductPicture().setOpaque(true);
		this.getLblProductPicture().setBounds(10, 10, 151, 103);
		super.add(this.getLblProductPicture());

		this.setBtnEntfernen(new JButton("Entfernen"));
		this.getBtnEntfernen().setBounds(31, 118, 109, 23);
		super.add(this.getBtnEntfernen());

		this.setLblProductName(new JLabel("Produktname"));
		this.getLblProductName().setBackground(new Color(152, 251, 152));
		this.getLblProductName().setOpaque(true);
		this.getLblProductName().setBounds(171, 11, 211, 23);
		super.add(this.getLblProductName());

		this.setLblProductText(new JLabel("Produkt Text"));
		this.getLblProductText().setBackground(new Color(100, 149, 237));
		this.getLblProductText().setOpaque(true);
		this.getLblProductText().setBounds(171, 45, 622, 96);
		super.add(this.getLblProductText());

		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
		this.setAnzahlArtikel(new JSpinner(model));
		this.getAnzahlArtikel().setBounds(843, 45, 50, 23);
		super.add(this.getAnzahlArtikel());

		this.setLblEinzelpreis(new JLabel("Einzelpreis"));
		this.getLblEinzelpreis().setBackground(new Color(135, 206, 250));
		this.getLblEinzelpreis().setOpaque(true);
		this.getLblEinzelpreis().setBounds(803, 86, 143, 23);
		super.add(this.getLblEinzelpreis());

		this.setLblGesamtPreis(new JLabel("Gesamtpreis"));
		this.getLblGesamtPreis().setBackground(new Color(255, 99, 71));
		this.getLblGesamtPreis().setOpaque(true);
		this.getLblGesamtPreis().setBounds(803, 118, 143, 23);
		super.add(this.getLblGesamtPreis());
	}

}
