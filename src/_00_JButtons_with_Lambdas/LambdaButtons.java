package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	int randomhold;
	String add1;
	String add2;
	int hold1;
	int hold2;
	int finalproduct;
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		Random r = new Random();

		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		window.setVisible(true);
		window.pack();
		addNumbers.addActionListener((ActionEvent t)->{
			add1 = JOptionPane.showInputDialog("Whats your first number");
			add2 = JOptionPane.showInputDialog("Whats your second number");
			hold1 = Integer.parseInt(add1);
			hold2 = Integer.parseInt(add2);
			finalproduct=hold1+hold2;
			JOptionPane.showMessageDialog(null, "" + finalproduct);
		});
		randNumber.addActionListener((ActionEvent m)->{
			randomhold=r.nextInt();
			JOptionPane.showMessageDialog(null, "" + randomhold );
		});
		tellAJoke.addActionListener((ActionEvent z)->{
			JOptionPane.showMessageDialog(null, "Whats a ghost's favorite color?");
			JOptionPane.showMessageDialog(null, "BooBerries!");
		});
		}
	
	
	public static void main(String[] args) {
		new LambdaButtons();
		
	}
	
	
}
