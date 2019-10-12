package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

	 


		

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String china = "download.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component ussr;
		// 3. use the "createImage()" method below to initialize your Component
		ussr = createImage("https://vignette.wikia.nocookie.net/pewdiepie/images/5/51/Water_Sheep.png/revision/latest?cb=20190826022918");
		// 4. add the image to the quiz window
		quizWindow.add(ussr);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String germany = JOptionPane.showInputDialog(null, "has water sheep died in a pewdiepie video?");
		// 7. print "CORRECT" if the user gave the right answer
		if(germany.equals("yes")) {
		System.out.println("correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
		System.out.println("incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(ussr);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component nsgwp;
		nsgwp = createImage("https://vignette.wikia.nocookie.net/pewdiepie/images/e/ef/Sven-mc.png/revision/latest/scale-to-width-down/180?cb=20190922220753");
		

		// 11. add the second image to the quiz window
		quizWindow.add(nsgwp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String unitednations = JOptionPane.showInputDialog("when did pewdiepie get sven?");
		// 14+ check answer, say if correct or incorrect, etc.
			if(unitednations.equals("7th video")) {
			System.out.println("correct");
			}
			else {
			System.out.println("incorrect");	
			}
			quizWindow.remove(nsgwp);
			Component point;
			point = createImage("https://vignette.wikia.nocookie.net/pewdiepie/images/6/67/Jorgen-mc-square.png/revision/latest/scale-to-width-down/180?cb=20190629212733");
			
			quizWindow.add(point);
			quizWindow.pack();
			String warsawpact = JOptionPane.showInputDialog("how many times has joergen died");
			if(warsawpact.equals("3")) {
			System.out.println("correct");
			}
			else {
			System.out.println("incorrect");	
			}
			
	}
		
 
	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
 
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
