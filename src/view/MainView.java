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
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.YELLOW);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		super.setContentPane(this.getStartPanel());

		super.setVisible(true);

	}

	// Sage der Main View wo der ActionListener ist
	public void addActionListenerToStartBtn(ActionListener al) {
		this.getStartPanel().addActionListenerToBtnStart(al);
	}

	// BtnWarenkorb
	public void addActionListenerToBtnWarenkorb(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnWarenkorb(al);
	}

	//KassePanel
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnKasse(al);
	}

	public void showMainPanel() {
		super.setContentPane(this.getMainPanel());
	}

	// WarenKorb
	public void showWarenkorbPanel() {
		this.getMainPanel().showWarenkorb();

	}

	// KassePanel
	public void showKassePanel() {
		this.getMainPanel().showKassePanel();

	}

}
