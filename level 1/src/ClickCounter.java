import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClickCounter implements ActionListener {
	int count;
	JFrame jframe;
	JButton jbutton;

	ClickCounter() {
		jframe = new JFrame();
		jbutton = new JButton();
		jbutton.setText("My Button");
		jbutton.addActionListener(this);
		jframe.add(jbutton);
		jframe.setVisible(true);

		jframe.pack();
	}

	public static void main(String[] args) {
		ClickCounter cc = new ClickCounter();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		jbutton.setText("count is " + count);
		count++;

		// TODO Auto-generated method stub

	}
}
