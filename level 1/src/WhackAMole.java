import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	public static void main(String[] args) {
		new WhackAMole().createUI();
	}

	private void createUI() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		panel.add(button);
		panel.add(button);
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
}
