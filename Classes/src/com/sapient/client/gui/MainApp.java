package com.sapient.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Listener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object src = e.getSource();
		if (src instanceof JButton) {
			JButton srcBtn = (JButton) src;
			JOptionPane.showMessageDialog(null, srcBtn.getText() + " Clicked",
					"Sapient", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

public class MainApp {
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setVisible(true);
		frm.setBounds(200, 100, 400, 200);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSave = new JButton("Save");
		JButton btnExit = new JButton("Exit");
		Listener lsnr = new Listener();
		btnSave.addActionListener(lsnr);
		btnExit.addActionListener(lsnr);
		
		
	}
}
