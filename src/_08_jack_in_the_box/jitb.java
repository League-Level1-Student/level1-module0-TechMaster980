package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jitb implements ActionListener{
	public static void main(String[] args) {
		
	}
	public void showButton() {
        
		 JFrame frame = new JFrame();
			JPanel panel = new JPanel();
		 
		 System.out.println("Button clicked");
  
   
		frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
   
	 
	 
	 
		 
	 
	 }
	private void showPicture(String fathenry) { 
	     try {
	          JLabel imageLabel = createLabelImage(fathenry);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fathenry) {
	     try {
	          java.net.URL imageURL = getClass().getResource(fathenry);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fathenry);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon();
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fathenry);
	          return new JLabel();
	     }
	}
	
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		  int rand = new Random().nextInt(5);
		  if(rand == 0) {
			 System.out.println("");
		  }
		  if(rand == 1) {
			  
		  }
		  if(rand == 2) {
			  
		  }
		  if(rand == 3) {
			  
		  }
		  if(rand == 4) {
			  
		  }
	
	
	
	
	
	
	}	


	
	
}
