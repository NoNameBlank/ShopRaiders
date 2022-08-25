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
		
		this.getMainView().getMainPanel().getKategoriePanel().getKatList().get(0).addActionListener(this::kat1);
	
		
		
	}
	
	private void startBtn(ActionEvent e) {
		this.getMainView().showMainPanel();
	}
	
	//Btn Warenkorb
	private void showWarenkorbPanel(ActionEvent e) {
		//this.getMainView().WarenkorbPanel();
	}
	
	private void kat1(ActionEvent e) {
		System.out.println("kat1 wurde gedruckt");
	}
	

}
