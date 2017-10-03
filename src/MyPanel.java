
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel {
	
	public MyPanel() {
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		
		//Title
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.setColor(Color.black);
		g.drawString("Drawing in Java", 60, 60);
		
		
		
		//Squares
		g.setColor(Color.black);
		g.fillRect(300, 220, 150, 150);
		g.setColor(Color.black);
		g.drawRect(300, 220, 150, 150);
		
		g.setColor(Color.red);
		g.fillRect(300, 130, 150, 150);
		g.setColor(Color.black);
		g.drawRect(300, 130, 150, 150);
		
		g.setColor(Color.black);
		g.fillRect(30, 220, 150, 150);
		g.setColor(Color.black);
		g.drawRect(30, 220, 150, 150);
		
		g.setColor(Color.red);
		g.fillRect(30, 130, 150, 150);
		g.setColor(Color.black);
		g.drawRect(30, 130, 150, 150);
		
		//Circle
		g.setColor(Color.green);
		g.fillOval(165, 165, 150, 150);
		g.setColor(Color.black);
		g.drawOval(165,165, 150, 150);
	}
}
