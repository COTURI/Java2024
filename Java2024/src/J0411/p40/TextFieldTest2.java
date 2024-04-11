package J0411.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest2 {
	private Frame f;
	private Button b;
	private Label lid;
	private Label lpwd;
	private TextField id;
	private TextField pwd;
	private TextField log;
	private String Log_ID = "green";
	private String Log_pwd = "ujb1234";

	public TextFieldTest2() {
		f = new Frame("Login");
		b = new Button("확인");
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		id = new TextField(10);
		pwd = new TextField(10);
		log = new TextField("로그인 성공", 60);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inpId = id.getText();
				String inpPwd = pwd.getText();

				if (inpId.equals(Log_ID) && inpPwd.equals(Log_pwd)) {
					log.setText("로그인 성공");
				} else {
					log.setText("로그인 실패");
				}

			}
		});

		lid.setLocation(0, 75);
		id.setLocation(150, 75);
		lpwd.setLocation(300, 75);
		pwd.setLocation(450, 75);
		log.setLocation(600, 150);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setLayout(new FlowLayout());

		b.setSize(50, 50);
		b.setLocation(180, 75);

		f.add(b);
		f.add(log);
		f.setSize(400, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldTest2();

	}

}
