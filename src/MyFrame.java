import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
		
		private MyPanel p;
		
		public MyFrame(){
			
			super("Project2");
			p = new MyPanel();
			p.setLayout(new FlowLayout());
			
			setContentPane(p);
			setSize(500, 500);
			setVisible(true);
			
		}
}
