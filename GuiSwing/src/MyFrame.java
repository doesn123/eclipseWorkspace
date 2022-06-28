import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
//		JFrame frame = new JFrame();
		this.setSize(420, 420);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Title goes here");
		this.setResizable(true);
		
		ImageIcon image = new ImageIcon("metro.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.BLACK);
	}
}
