import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CandyMan implements ActionListener {
	CandyMan() {
		frame.add(button);
		frame.setVisible(true);
		frame.pack();
		button.setText("Candy Man");
		button.addActionListener(this);
	}

	int count;
	JFrame frame = new JFrame();
	JButton button = new JButton();

	public static void main(String[] args) {
		CandyMan cm = new CandyMan();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("button clicked");
		count++;
		if (count == (5)) {

			String imageurl = "http://1.bp.blogspot.com/-1eVMM7_MPlA/TbYFWdkaHgI/AAAAAAAAIPI/gNE-2zAhX-I/s1600/barlow.jpg";
			// . imageurl =
			// "https://s-media-cache-ak0.pinimg.com/564x/45/26/25/452625da36ceb0373f5067d1a198f604.jpg";
			this.showPictureFromTheInternet(imageurl);
			this.playSound(CREEPY);
		}

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound(int whichSound) {
		File soundFile = null;
		if (whichSound == CREEPY)
			soundFile = new File("/Users/league/Google Drive/league-sounds/creepy-noise.wav");

		else if (whichSound == SCREAM)
			soundFile = new File("/Users/League/Google Drive/league-sounds/scream.wav");
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
