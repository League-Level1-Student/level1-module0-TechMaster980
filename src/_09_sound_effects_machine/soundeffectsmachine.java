package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffectsmachine implements ActionListener { 

	void chinagui() {
		 JFrame frame = new JFrame();
			JPanel panel = new JPanel();
		 
		 System.out.println("Button clicked");

		 

		frame.setVisible(true);
      JButton button = new JButton();
      frame.add(button);
      frame.pack();
      button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		playSound("whatfinnishheardinwinterwar.wav");
		
	}
	
	private void playSound(String fileName) {

	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

	    sound.play();

	}

}
		
	
	
	
	


