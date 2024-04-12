package J0412.pdf77;

import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import javax.swing.JButton;

public class App extends JFrame {
	public App() {
		setTitle("Swing App");
		setSize(300,100);
		getContentPane().add(new JButton("OK"), BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter(){
			@Override
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app = new App();
		app.setVisible(true);
	}

}
