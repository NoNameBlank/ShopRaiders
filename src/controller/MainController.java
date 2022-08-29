package controller;

import java.awt.event.ActionEvent;

import view.MainView;

public class MainController {

	private MainView mainView;

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	public MainController() {
		this.setMainView(new MainView());
		this.getMainView().addActionListenerToStartBtn(this::startBtn);
		this.getMainView().addActionListenerToBtnWarenkorb(this::showWarenkorbPanel);
		this.getMainView().addActionListenerToBtnKasse(this::showKassePanel);

		this.getMainView().getMainPanel().getKategoriePanel().getKatList().get(0).addActionListener(this::kat1);
		this.getMainView().getMainPanel().getKategoriePanel().getKatList().get(1).addActionListener(this::kat2);
		this.getMainView().getMainPanel().getKategoriePanel().getKatList().get(2).addActionListener(this::kat3);

	}

	private void startBtn(ActionEvent e) {
		this.getMainView().showMainPanel();
	}

	// Btn Warenkorb
	private void showWarenkorbPanel(ActionEvent e) {
		//System.out.println("AUsgabe: WarenkorbAnzeigen");
		this.getMainView().showWarenkorbPanel();
	}
	
	//Btn zeig KassePanel

	private void showKassePanel(ActionEvent e) {
		this.getMainView().showKassePanel();
	}
	
	
	
	private void kat1(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat1", "Kat1 ", "Kat1",
				0);
	}

	private void kat2(ActionEvent e) {
		//System.out.println("Kat2 MainController");
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat2", "Kat2 ", "Kat2",
				0);
	}

	private void kat3(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat3", "Kat3 ", "Kat3",
				0);
	}

}
