package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainView extends JFrame {

	 private StartPanel startPanel;
	 private MainPanel mainPanel;
	 
	 
	 

	public StartPanel getStartPanel() {
		return startPanel;
	}



	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}
	
	



	public MainPanel getMainPanel() {
		return mainPanel;
	}



	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}



	public MainView() {
		super.setLayout(null);
		super.setBounds(0, 0, 1024, 794);
		super.setBackground(Color.YELLOW);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		super.setContentPane(this.getStartPanel());
		
	
		
		
		
		super.setVisible(true);
		
	
	}
	
	//Sage der Main View wo der ActionListener ist
	public void addActionListenerToStartBtn(ActionListener al) {
		this.getStartPanel().addActionListenerToBtnStart(al);
	}

	public void showMainPanel() {
		super.setContentPane(this.getMainPanel());
	}
	
}
