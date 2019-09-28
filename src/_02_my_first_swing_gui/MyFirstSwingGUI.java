



package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	
	public static void main(String[] args) {
		MyFirstSwingGUI capitalism = new MyFirstSwingGUI();
		capitalism.run();
	}
	public void run() {

		// 1. Create and initialize an object of the JFrame class
		JFrame benitomussolini = new JFrame();
		// 2. Set your JFrame object to be visible
		benitomussolini.setVisible(true);
		// 3. Run your program. Do you see your window? It's probably very
		// small.

		// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		benitomussolini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Create and initialize an object of the JPanel class
	JPanel karlhenrichmarx = new JPanel();
		// 6. Create and initialize an object of the JLabel class

	JLabel  VladimirIlyichUlyanov = new JLabel();
	// VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	//JLabel  VladimirIlyichUlyanov1 = new JLabel();
	// VladimirIlyichUlyanov1.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov2 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov3 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov4 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov5 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov6 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	 JLabel  VladimirIlyichUlyanov7 = new JLabel();
	 VladimirIlyichUlyanov.setText("hello Ioseb Besarionis dze Jughashvili Vladimir Ilyich Ulyanov Karl Heinrich Marx Lev Davidovich Bronshtein Benito Amilcare Andrea Mussolini Nikita Sergeyevich Khrushchev Leonid Ilyich Brezhnev Vladimir Vladimirovich Putin Fidel Alejandro Castro Ruz Michinomiya Hirohito Mikhail Sergeyevich Gorbachev Boris Nikolayevich Yeltsin Ernesto Rafael Guevara de la Serna get out");
	
	 // 7. Set the text of the JLabel to a lovely greeting.

		// 8. Add the JPanel object to the JFrame
		benitomussolini.add(karlhenrichmarx);
		// 9. Add the JLabel object to the JPanel
		//karlhenrichmarx.add(VladimirIlyichUlyanov);
	//	karlhenrichmarx.add(VladimirIlyichUlyanov1);
		karlhenrichmarx.add(VladimirIlyichUlyanov2);
		karlhenrichmarx.add(VladimirIlyichUlyanov3);
		karlhenrichmarx.add(VladimirIlyichUlyanov4);
		karlhenrichmarx.add(VladimirIlyichUlyanov5);
		karlhenrichmarx.add(VladimirIlyichUlyanov6);
		karlhenrichmarx.add(VladimirIlyichUlyanov7);
		
		// 10. Pack your JFrame.
		benitomussolini.pack();
		// 11. Run your program again. Do you see your message.

		// 12. Use the loadImage method to set the icon of the JLabel object.
		//VladimirIlyichUlyanov.setIcon(loadImage());
	//	VladimirIlyichUlyanov1.setIcon(loadImage1());
		VladimirIlyichUlyanov2.setIcon(loadImage2());
		VladimirIlyichUlyanov3.setIcon(loadImage3());
		VladimirIlyichUlyanov4.setIcon(loadImage4());
		VladimirIlyichUlyanov5.setIcon(loadImage5());
		VladimirIlyichUlyanov6.setIcon(loadImage6());
		VladimirIlyichUlyanov7.setIcon(loadImage7());
	
		// 13. Re-pack the JFrame object.
		benitomussolini.pack();
		// 14. Run the program one more time. Do you see the image?

	}

	//public ImageIcon loadImage() {
	//	try {
	//		return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download.jpg")));
	//	} catch (IOException e) {

		//	return null;
		//}
	//}
//	public ImageIcon loadImage1() {
//		try {
//			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-3.jpg")));
//		} catch (IOException e) {
//
//			return null;
//		}
//	}
	public ImageIcon loadImage2() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-1.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	public ImageIcon loadImage3() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-6.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	public ImageIcon loadImage4() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-4.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	public ImageIcon loadImage5() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-7.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	public ImageIcon loadImage6() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-5.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	public ImageIcon loadImage7() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("download-8.jpg")));
		} catch (IOException e) {

			return null;
		}
	}
	
}
