package swing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.io.OutputStream;
import java.util.jar.JarOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame extends JFrame {
	Frame(){
		super("Пробное окно");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JPanel calc = new JPanel();
		
		
		// Output window
		
		// First row
		panel.setLayout(new GridLayout(5, 4));
		// First row 1.1
		panel.add(new JButton("CE"));
		panel.add(new JButton("C"));
		panel.add(new JButton("BackSpace"));
		panel.add(new JButton("÷"));
		// Second row
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("X"));
		// third row
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("-"));
		// forth row
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("+"));
		// fifth row
		panel.add(new JButton("±"));
		panel.add(new JButton("0"));
		panel.add(new JButton(","));
		panel.add(new JButton("="));
		calc.add(panel);
		setContentPane(calc);
		setResizable(false);
		pack();
		}
}
