import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class Main extends JFrame {

	public JPanel
		address_panel, window_panel;

	public JLabel
		address_label;

	public JTextField
		address_tf;

	public JEditorPane
		window_pane;

	public JScrollPane
		window_scroll;

	public JButton
		address_b;
	
	public JButton
		home_b;
	
	public JButton
		set_b;
	
	public String
		homeSet;
	public String
		homesave = "http://www.google.com";
	private Go go = new Go();
	private H home = new H();
	private S set = new S();
	public Main() throws IOException {

		address_label = new JLabel(" address: ", SwingConstants.CENTER);
		address_tf = new JTextField("http://www.google.com");
		address_tf.addActionListener(go);
		address_b = new JButton("Go");
		address_b.addActionListener(go);
		home_b = new JButton("Home");
		home_b.addActionListener(home);
		set_b = new JButton("Set Home");
		set_b.addActionListener(set);
		
		window_pane = new JEditorPane("http://www.google.com");
		window_pane.setContentType("text/html");
		window_pane.setEditable(false);

		address_panel = new JPanel(new BorderLayout());
		window_panel = new JPanel(new BorderLayout());

		address_panel.add(address_label, BorderLayout.WEST);
		address_panel.add(address_tf, BorderLayout.CENTER);
		address_panel.add(address_b, BorderLayout.EAST);

		window_scroll = new JScrollPane(window_pane);
		window_panel.add(window_scroll);

		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());

		pane.add(address_panel, BorderLayout.NORTH);
		pane.add(window_panel, BorderLayout.CENTER);
		address_panel.add(home_b, BorderLayout.WEST);
		address_panel.add(set_b, BorderLayout.NORTH);
		
		setIconImage(new ImageIcon("C:/Users/Alex/Desktop/BS/icon.png").getImage());
		setTitle("GLYPH v0.0002");
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public class S implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			homesave = (address_tf.getText());
		}
		
	}
	public class H implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
				homeSet = homesave;
			try{
				
				window_pane.setPage(homeSet); 
				
			} catch (MalformedURLException e) {     
				window_pane.setText("MalformedURLException: " + e);
			} catch (IOException e) {               
				window_pane.setText("IOException: " + e);
			}
		}
		
	}
	public class Go implements ActionListener{

		public void actionPerformed(ActionEvent ae){

			try {
				
				window_pane.setPage(address_tf.getText());
				
			} catch (MalformedURLException e) {     
				window_pane.setText("MalformedURLException: " + e);
			} catch (IOException e) {              
				window_pane.setText("IOException: " + e);
			}

		}

	}

	public static void main(String args[]) throws IOException {
		Main wb = new Main();
	}

}