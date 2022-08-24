package view;

import javax.swing.JFrame;

public class MainView extends JFrame {

	 private StartPanel startPanel;
	 
	 

	public StartPanel getStartPanel() {
		return startPanel;
	}



	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}



	public MainView() {
		super.setLayout(null);
		super.setBounds(0, 0, 1024, 794);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setStartPanel(new StartPanel());
		super.setContentPane(this.getStartPanel());
		
		
		super.setVisible(true);
		
	//Test Push via GUI Eclipse
	}
}
