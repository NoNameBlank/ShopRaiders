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
	
		
		
	}
	
	private void startBtn(ActionEvent e) {
		this.getMainView().showMainPanel();
	}

}
