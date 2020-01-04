package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenesstv implements ActionListener {
	
	JButton button1 = new JButton("button1");
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	
	void playVideo(String url) {
		try {
			URI uri = new URI(url);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
	if(e.getSource()== button1) {
	playVideo("https://www.youtube.com/watch?v=U06jlgpMtQs");
	}
	if(e.getSource()== button2) {
	playVideo("https://www.youtube.com/watch?v=Rzjxy1rrkng");
	}
	if(e.getSource()== button3) {
	playVideo("https://www.youtube.com/watch?v=w5x_9KEogM8");
	}
	}


	
	public void showButton() {
// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		System.out.println("button clicked");
		frame.setVisible(true);
		
		panel.add(button1);
		button1.addActionListener(this);
		frame.setVisible(true);
		
		panel.add(button2);
		button2.addActionListener(this);
	
	panel.add(button3);
	button3.addActionListener(this);
	frame.add(panel);
	frame.pack();
	}
	}