import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class musicStuff {
	void playMusic(String musicLocation) {

		int k = 30;
		int l = 0;
		
		ImageIcon obama = new ImageIcon("res\\obama.jpg");

		try {

			File musicPath = new File(musicLocation);
			if (musicPath.exists()) {

				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();

				// song se loopuje do nekoneèna
				// clip.loop(clip.LOOP_CONTINUOUSLY);

				JFrame frame = new JFrame("guess the song bitchass");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.setVisible(true);
				frame.setSize(1300, 800);

				JFrame timeframe = new JFrame("your time:");

				timeframe.setResizable(false);
				timeframe.setVisible(true);
				timeframe.setSize(100, 100);

				Container content = frame.getContentPane();
				content.setLayout(new GridLayout(2, 2));

				Border border = LineBorder.createGrayLineBorder();

				JLabel timelabel = new JLabel();

				JLabel label1 = new JLabel();

				label1.setHorizontalTextPosition(JLabel.RIGHT);
				label1.setVerticalTextPosition(JLabel.BOTTOM);
				label1.setBorder(border);
				content.add(label1);

				JLabel label2 = new JLabel();

				label2.setHorizontalTextPosition(JLabel.RIGHT);
				label2.setVerticalTextPosition(JLabel.BOTTOM);
				label2.setBorder(border);
				content.add(label2);

				JLabel label3 = new JLabel();

				label3.setHorizontalTextPosition(JLabel.RIGHT);
				label3.setVerticalTextPosition(JLabel.BOTTOM);
				label3.setBorder(border);
				content.add(label3);

				JLabel label4 = new JLabel();

				label4.setHorizontalTextPosition(JLabel.RIGHT);
				label4.setVerticalTextPosition(JLabel.BOTTOM);
				label4.setBorder(border);
				content.add(label4);
				// JOptionPane.showMessageDialog(null, "ok - stop");

				JButton LeftUp = new JButton("The Scotts - Travis Scott & Kid Cuddi");
				JButton RightUp = new JButton("Look at me - XXXTENTACION");
				JButton LeftDown = new JButton("GOOBA - 6IX9INE");
				JButton RightDown = new JButton("Hul skero - Dollar Prync");

				RightUp.setBounds(642, 0, 300, 20);
				LeftUp.setBounds(0, 0, 300, 20);
				RightDown.setBounds(642, 380, 300, 20);
				LeftDown.setBounds(0, 380, 300, 20);

				frame.add(RightUp);
				frame.add(LeftUp);
				frame.add(RightDown);
				frame.add(LeftDown);
				timeframe.add(timelabel);

				LeftUp.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						clip.stop();
						try {
							System.out.println("You got it right!");

							Thread.sleep(500);
							System.exit(0);
						} catch (InterruptedException e1) {
							System.err.println(e1.getMessage());
						}

					}
				});

				RightUp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clip.stop();
						try {
							System.out.println("You got it right!");

							Thread.sleep(500);
							System.exit(0);
						} catch (InterruptedException e1) {
							System.err.println(e1.getMessage());
						}

					}
				});

				LeftDown.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clip.stop();
						try {
							System.out.println("You got it right!");

							Thread.sleep(500);
							System.exit(0);
						} catch (InterruptedException e1) {
							System.err.println(e1.getMessage());
						}

					}
				});

				RightDown.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						clip.stop();
						try {
							System.out.println("You got it right!");

							Thread.sleep(500);
							System.exit(0);
						} catch (InterruptedException e1) {
							System.err.println(e1.getMessage());
						}

					}
				});

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				timelabel.setText("Zbývající èas:" + String.valueOf(k--));
				Thread.sleep(1000);

				if (Integer.toString(k + 1).equalsIgnoreCase(Integer.toString(l))) {
					Thread.sleep(1000);

					frame.setVisible(false);
					timeframe.setVisible(false);

					JFrame youlost = new JFrame("baited");
					youlost.setSize(500, 750);
					youlost.setVisible(true);
					JLabel lost = new JLabel();
					lost.setIcon(obama);
					youlost.add(lost);
					clip.stop();
				}

				timeframe.setLayout(null);
				Thread.sleep(30000);

			} else {

				System.out.println("nemùžu najít soubor idiote");

			}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}
