import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	public static void main(String[] args) {
		new TypingTutor().createUI();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();

	private void createUI() {
		// TODO Auto-generated method stub

		frame.add(panel);
		frame.setTitle("type or DIE");
		label.setText("" + currentLetter);
		panel.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		frame.pack();
		frame.setVisible(true);
		frame.setSize(200, 75);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

}
