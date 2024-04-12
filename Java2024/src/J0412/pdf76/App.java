package J0412.pdf76;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends Frame implements ActionListener{
	private Button b;
	
	public App() {
		setTitle("AWT App");
		setSize(300, 100);
		b = new Button("OK");
		add(b, BorderLayout.SOUTH);		
		b.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("OK")) {
			System.out.println("OK");
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.setVisible(true);
	}
}
