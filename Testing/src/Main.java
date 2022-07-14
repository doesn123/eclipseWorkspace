import javax.swing.JOptionPane;
public class Main {
	
	public static void main(String[]args) {
		String name = JOptionPane.showInputDialog("enter name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("enter age"));
		JOptionPane.showMessageDialog(null, "your name is " + name + "\nYou are " + age + " years old");
		
		
	} 
}

