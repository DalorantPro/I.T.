import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Your outfit");

		frame.setTitle("Your outfit");

		frame.setSize(1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

		Container content = frame.getContentPane();
		content.setLayout(new GridLayout(2, 2));

		Border border = LineBorder.createGrayLineBorder();

		JLabel label1 = new JLabel();
		label1.setText("Your tee");
		label1.setHorizontalTextPosition(JLabel.RIGHT);
		label1.setVerticalTextPosition(JLabel.BOTTOM);
		label1.setBorder(border);
		content.add(label1);

		JLabel label2 = new JLabel();
		label2.setText("Your hoodie");
		label2.setHorizontalTextPosition(JLabel.RIGHT);
		label2.setVerticalTextPosition(JLabel.BOTTOM);
		label2.setBorder(border);
		content.add(label2);

		JLabel label3 = new JLabel();
		label3.setText("Your shoes");
		label3.setHorizontalTextPosition(JLabel.RIGHT);
		label3.setVerticalTextPosition(JLabel.BOTTOM);
		label3.setBorder(border);
		content.add(label3);

		JLabel label4 = new JLabel();
		label4.setText("Your pants");
		label4.setHorizontalTextPosition(JLabel.RIGHT);
		label4.setVerticalTextPosition(JLabel.BOTTOM);
		label4.setBorder(border);
		content.add(label4);

		ImageIcon imageJordanGreen = new ImageIcon("res\\img\\" + Boty.factoryAirJordan1PineGreen() + ".jpg");
		ImageIcon imageJordanH2H = new ImageIcon("res\\img\\" + Boty.factoryAirJordan1HomageToHome() + ".jpg");
		ImageIcon imageJordan4Bred = new ImageIcon("res\\img\\" + Boty.factoryAirJordan4Bred() + ".jpg");
		ImageIcon imageAirYeezy = new ImageIcon("res\\img\\" + Boty.factoryAirYeezyRedOctober() + ".jpg");
		ImageIcon imageHumanRace = new ImageIcon("res\\img\\" + Boty.factoryHumanRace() + ".jpg");
		ImageIcon imageAirForce = new ImageIcon("res\\img\\" + Boty.factoryAirForce1TravisScott() + ".jpg");
		ImageIcon imageDunks = new ImageIcon("res\\img\\" + Boty.factoryTravisScottDunkLow() + ".jpg");
		ImageIcon imageWave = new ImageIcon("res\\img\\" + Boty.factoryYeezy700Waverunner() + ".jpg");
		ImageIcon imageJordanSatin = new ImageIcon("res\\img\\" + Boty.factoryAirJordan1SatinBlackToe() + ".jpg");
		ImageIcon imageTailwind = new ImageIcon("res\\img\\" + Boty.factorySupremeTailwind() + ".jpg");
		ImageIcon imageRaf = new ImageIcon("res\\img\\" + Boty.factoryRafSimonsBunny() + ".jpg");
		ImageIcon imageJ6TS = new ImageIcon("res\\img\\" + Boty.factoryAJ6Travis() + ".jpg");
		ImageIcon imageCDGconv = new ImageIcon("res\\img\\" + Boty.factoryCDGconverse() + ".jpg");
		ImageIcon imageAF1 = new ImageIcon("res\\img\\" + Boty.factoryAF1white() + ".jpg");

		ImageIcon imageFog = new ImageIcon("res\\img\\" + Kalhoty.factoryFearOfGod() + ".jpg");
		ImageIcon imageAdidas = new ImageIcon("res\\img\\" + Kalhoty.factoryAdidasSweats() + ".jpg");
		ImageIcon imageBlackDistressed = new ImageIcon("res\\img\\" + Kalhoty.factoryBlackDistressedJeans() + ".jpg");
		ImageIcon imageBlackJeans = new ImageIcon("res\\img\\" + Kalhoty.factoryBlackJeans() + ".jpg");
		ImageIcon imageBlueDistressed = new ImageIcon("res\\img\\" + Kalhoty.factoryBlueDistressedJeans() + ".jpg");
		ImageIcon imageBlueJeans = new ImageIcon("res\\img\\" + Kalhoty.factoryBlueJeans() + ".jpg");
		ImageIcon imageCargos = new ImageIcon("res\\img\\" + Kalhoty.factoryCarharrtCargos() + ".jpg");
		ImageIcon imageNike = new ImageIcon("res\\img\\" + Kalhoty.factoryNikeSweats() + ".jpg");
		ImageIcon imagePlayboyPants = new ImageIcon("res\\img\\" + Kalhoty.factorySupremePlayboySweats() + ".jpg");
		ImageIcon imageSplitPants = new ImageIcon("res\\img\\" + Kalhoty.factorySupremeSplitSweats() + ".jpg");
		ImageIcon imageGreyStraight = new ImageIcon("res\\img\\" + Kalhoty.factoryGreyStraight() + ".jpg");
		ImageIcon imageBrownCargos = new ImageIcon("res\\img\\" + Kalhoty.factoryBrownCargos() + ".jpg");

		ImageIcon imageUniqlo = new ImageIcon("res\\img\\" + Trika.factoryUniqloKaws() + ".jpg");
		ImageIcon imageCk = new ImageIcon("res\\img\\" + Trika.factoryCalvinKlein() + ".jpg");
		ImageIcon imageBBC = new ImageIcon("res\\img\\" + Trika.factoryBillionareBoysClub() + ".jpg");
		ImageIcon imageBalenciaga = new ImageIcon("res\\img\\" + Trika.factoryBalenciaga() + ".jpg");
		ImageIcon imageScarface = new ImageIcon("res\\img\\" + Trika.factorySupremeScarface() + ".jpg");
		ImageIcon imagePleasures = new ImageIcon("res\\img\\" + Trika.factoryPleasuresAGIAG() + ".jpg");
		ImageIcon imagePablo = new ImageIcon("res\\img\\" + Trika.factoryPablo() + ".jpg");
		ImageIcon imageAdidasTee = new ImageIcon("res\\img\\" + Trika.factoryAdidasTee() + ".jpg");
		ImageIcon imageAdidasPharrell = new ImageIcon("res\\img\\" + Trika.factoryAdidasPharrell() + ".jpg");
		ImageIcon imageSupremecdgTee = new ImageIcon("res\\img\\" + Trika.factorySupremeCDG() + ".jpg");
		ImageIcon imageKithTee = new ImageIcon("res\\img\\" + Trika.factoryKith() + ".jpg");
		ImageIcon imageNikeClubTee = new ImageIcon("res\\img\\" + Trika.factoryNikeTee() + ".jpg");
		ImageIcon imageSupremeTupac = new ImageIcon("res\\img\\" + Trika.factorySupremeTupac() + ".jpg");

		ImageIcon imagePlayboy = new ImageIcon("res\\img\\" + Mikiny.factorySupremePlayboy() + ".jpg");
		ImageIcon imageBogo = new ImageIcon("res\\img\\" + Mikiny.factorySupremeBoxLogo() + ".jpg");
		ImageIcon imageTravis = new ImageIcon("res\\img\\" + Mikiny.factoryNikeTravisScott() + ".jpg");
		ImageIcon imageNikeHood = new ImageIcon("res\\img\\" + Mikiny.factoryNike() + ".jpg");
		ImageIcon imageKith = new ImageIcon("res\\img\\" + Mikiny.factoryKithLogo() + ".jpg");
		ImageIcon imageASSC = new ImageIcon("res\\img\\" + Mikiny.factoryASSC() + ".jpg");
		ImageIcon imagePlayboyASSC = new ImageIcon("res\\img\\" + Mikiny.factoryPlayboyASSC() + ".jpg");
		ImageIcon imageSupremePolka = new ImageIcon("res\\img\\" + Mikiny.factorySupremeCDGPolka() + ".jpg");
		ImageIcon imageStussy = new ImageIcon("res\\img\\" + Mikiny.factoryStussy() + ".jpg");
		ImageIcon imageSupremePatchwork = new ImageIcon("res\\img\\" + Mikiny.factorySupremePatchwork() + ".jpg");
		ImageIcon imageBrownHoodie = new ImageIcon("res\\img\\" + Mikiny.factoryBrownHoodie() + ".jpg");
		ImageIcon imageBrownSweater = new ImageIcon("res\\img\\" + Mikiny.factoryBrownSweater() + ".jpg");

		/* MIKINY */
		JButton playboy = new JButton("Playboy hoodie");
		JButton bogo = new JButton("Bogo hoodie");
		JButton travis = new JButton("Travis x nike hoodie");
		JButton nikehood = new JButton("Nike club hoodie");
		JButton kith = new JButton("Kith logo hoodie");
		JButton ASSC = new JButton("ASSC Mindgames hoodie");
		JButton playboyASSC = new JButton("ASSC Playboy hoodie");
		JButton supremePolka = new JButton("Supreme cdg polka hoodie");
		JButton stussy = new JButton("Stussy 8ball hoodie");
		JButton supremePatchwork = new JButton("Supreme patchwork hoodie");
		JButton brownHood = new JButton("Brown hoodie");
		JButton brownSweater = new JButton("Brown sweater");

		playboy.setBounds(642, 0, 200, 23);
		bogo.setBounds(642, 23, 200, 23);
		travis.setBounds(642, 46, 200, 23);
		nikehood.setBounds(642, 69, 200, 23);
		kith.setBounds(642, 92, 200, 23);
		ASSC.setBounds(642, 115, 200, 23);
		playboyASSC.setBounds(642, 138, 200, 23);
		supremePolka.setBounds(642, 161, 200, 23);
		stussy.setBounds(642, 184, 200, 23);
		supremePatchwork.setBounds(642, 207, 200, 23);
		brownHood.setBounds(642, 230, 200, 23);
		brownSweater.setBounds(642, 253, 200, 23);

		playboy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imagePlayboy);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		bogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageBogo);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		travis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageTravis);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		nikehood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageNikeHood);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		kith.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageKith);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		ASSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageASSC);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		playboyASSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imagePlayboyASSC);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		supremePolka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageSupremePolka);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		stussy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageStussy);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		supremePatchwork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageSupremePatchwork);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		brownHood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageBrownHoodie);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		brownSweater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label2.setIcon(imageBrownSweater);
				playboy.setVisible(false);
				bogo.setVisible(false);
				travis.setVisible(false);
				nikehood.setVisible(false);
				kith.setVisible(false);
				ASSC.setVisible(false);
				playboyASSC.setVisible(false);
				supremePolka.setVisible(false);
				stussy.setVisible(false);
				supremePatchwork.setVisible(false);
				brownHood.setVisible(false);
				brownSweater.setVisible(false);
			}
		});
		frame.add(playboy);
		frame.add(bogo);
		frame.add(travis);
		frame.add(nikehood);
		frame.add(kith);
		frame.add(ASSC);
		frame.add(playboyASSC);
		frame.add(supremePolka);
		frame.add(stussy);
		frame.add(supremePatchwork);
		frame.add(brownHood);
		frame.add(brownSweater);
		/* MIKINY */

		/* TRIKA */
		JButton kaws = new JButton("Uniqlo x Kaws tee");
		JButton ck = new JButton("Ck tee");
		JButton bbc = new JButton("BBC tee");
		JButton balenciaga = new JButton("Balenciaga tee");
		JButton scarface = new JButton("Preme scarface tee");
		JButton pleasures = new JButton("Pleasures AGIAG tee");
		JButton pablo = new JButton("Pablo tee");
		JButton AdidasTee = new JButton("Adidas tee");
		JButton AdidasPWtee = new JButton("Adidas Pharrell Williams");
		JButton supremeCDGtee = new JButton("Supreme cdg tee");
		JButton kithTee = new JButton("Kith tee");
		JButton nikeClubTee = new JButton("Nike club tee");
		JButton supremeTupac = new JButton("Supreme Tupac tee");

		kaws.setBounds(0, 0, 200, 23);
		ck.setBounds(0, 23, 200, 23);
		bbc.setBounds(0, 46, 200, 23);
		balenciaga.setBounds(0, 69, 200, 23);
		scarface.setBounds(0, 92, 200, 23);
		pleasures.setBounds(0, 115, 200, 23);
		pablo.setBounds(0, 138, 200, 23);
		AdidasTee.setBounds(0, 161, 200, 23);
		AdidasPWtee.setBounds(0, 184, 200, 23);
		supremeCDGtee.setBounds(0, 207, 200, 23);
		kithTee.setBounds(0, 230, 200, 23);
		nikeClubTee.setBounds(0, 253, 200, 23);
		supremeTupac.setBounds(0, 276, 200, 23);

		kaws.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageUniqlo);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		ck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageCk);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		bbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageBBC);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		balenciaga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageBalenciaga);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});

		scarface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageScarface);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		pleasures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imagePleasures);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});

		pablo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imagePablo);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		AdidasTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageAdidasTee);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		AdidasPWtee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageAdidasPharrell);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		supremeCDGtee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageSupremecdgTee);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		kithTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageKithTee);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		nikeClubTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageNikeClubTee);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		supremeTupac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label1.setIcon(imageSupremeTupac);
				kaws.setVisible(false);
				ck.setVisible(false);
				bbc.setVisible(false);
				balenciaga.setVisible(false);
				scarface.setVisible(false);
				pleasures.setVisible(false);
				pablo.setVisible(false);
				AdidasTee.setVisible(false);
				AdidasPWtee.setVisible(false);
				supremeCDGtee.setVisible(false);
				kithTee.setVisible(false);
				nikeClubTee.setVisible(false);
				supremeTupac.setVisible(false);
			}
		});
		frame.add(kaws);
		frame.add(ck);
		frame.add(bbc);
		frame.add(balenciaga);
		frame.add(scarface);
		frame.add(pleasures);
		frame.add(pablo);
		frame.add(AdidasTee);
		frame.add(AdidasPWtee);
		frame.add(supremeCDGtee);
		frame.add(kithTee);
		frame.add(nikeClubTee);
		frame.add(supremeTupac);

		/* TRIKA */

		/* KALHOTY */
		JButton fog = new JButton("FOG sweats");
		JButton adidas = new JButton("Adidas sweats");
		JButton blackdis = new JButton("Black dis. jeans");
		JButton black = new JButton("Black jeans");
		JButton bluedis = new JButton("Blue dis. jeans");
		JButton blue = new JButton("Blue jeans");
		JButton cargos = new JButton("Cargo pants");
		JButton nikesweats = new JButton("Nike sweats");
		JButton supremeplayboy = new JButton("Supreme Playboy sweats");
		JButton supremesplit = new JButton("Supreme split sweats");
		JButton greyStraight = new JButton("Grey straight pants");
		JButton brownCargo = new JButton("Brown cargo pants");

		fog.setBounds(642, 380, 200, 23);
		adidas.setBounds(642, 403, 200, 23);
		blackdis.setBounds(642, 426, 200, 23);
		black.setBounds(642, 449, 200, 23);
		bluedis.setBounds(642, 472, 200, 23);
		blue.setBounds(642, 495, 200, 23);
		cargos.setBounds(642, 518, 200, 23);
		nikesweats.setBounds(642, 541, 200, 23);
		supremeplayboy.setBounds(642, 564, 200, 23);
		supremesplit.setBounds(642, 587, 200, 23);
		greyStraight.setBounds(642, 610, 200, 23);
		brownCargo.setBounds(642, 633, 200, 23);

		fog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageFog);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);
			}
		});
		adidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageAdidas);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		blackdis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageBlackDistressed);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageBlackJeans);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		bluedis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageBlueDistressed);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageBlueJeans);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		cargos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageCargos);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);
			}
		});
		nikesweats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageNike);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		supremeplayboy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imagePlayboyPants);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		supremesplit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageSplitPants);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		greyStraight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageGreyStraight);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		brownCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label4.setIcon(imageBrownCargos);
				fog.setVisible(false);
				adidas.setVisible(false);
				blackdis.setVisible(false);
				black.setVisible(false);
				bluedis.setVisible(false);
				blue.setVisible(false);
				cargos.setVisible(false);
				nikesweats.setVisible(false);
				supremeplayboy.setVisible(false);
				supremesplit.setVisible(false);
				greyStraight.setVisible(false);
				brownCargo.setVisible(false);

			}
		});
		frame.add(fog);
		frame.add(adidas);
		frame.add(blackdis);
		frame.add(black);
		frame.add(bluedis);
		frame.add(blue);
		frame.add(cargos);
		frame.add(nikesweats);
		frame.add(supremesplit);
		frame.add(supremeplayboy);
		frame.add(greyStraight);
		frame.add(brownCargo);

		/* KALHOTY */

		/* BOTY */
		JButton green = new JButton("J1 PineGreen");
		JButton h2h = new JButton("J1 Homage to home");
		JButton J4Bred = new JButton("J4 Bred");
		JButton AirYeezy = new JButton("AirYeezy");
		JButton HumanRace = new JButton("HumanRace");
		JButton AirForceTS = new JButton("AirForceTS");
		JButton Dunks = new JButton("Dunks");
		JButton WaveRunner = new JButton("WaveRunner");
		JButton Raf = new JButton("Raf simons bunny");
		JButton Tailwind = new JButton("Supreme tailwind");
		JButton satin = new JButton("J1 satin");
		JButton J6TS = new JButton("AJ6 TS");
		JButton AF1white = new JButton("Air Force 1 white");
		JButton CDGconv = new JButton("CDG Converse");

		green.setBounds(0, 380, 200, 23);
		h2h.setBounds(0, 403, 200, 23);
		J4Bred.setBounds(0, 426, 200, 23);
		AirYeezy.setBounds(0, 449, 200, 23);
		HumanRace.setBounds(0, 472, 200, 23);
		AirForceTS.setBounds(0, 495, 200, 23);
		Dunks.setBounds(0, 518, 200, 23);
		WaveRunner.setBounds(0, 541, 200, 23);
		Raf.setBounds(0, 564, 200, 23);
		Tailwind.setBounds(0, 587, 200, 23);
		satin.setBounds(0, 610, 200, 23);
		J6TS.setBounds(0, 633, 200, 23);
		AF1white.setBounds(0, 655, 200, 23);
		CDGconv.setBounds(0, 678, 200, 23);

		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageJordanGreen);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		h2h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageJordanH2H);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		J4Bred.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageJordan4Bred);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		AirYeezy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageAirYeezy);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		HumanRace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageHumanRace);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});

		AirForceTS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageAirForce);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		Dunks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageDunks);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		WaveRunner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageWave);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		Raf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageRaf);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		Tailwind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageTailwind);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		satin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageJordanSatin);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		J6TS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageJ6TS);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		AF1white.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageAF1);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		CDGconv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label3.setIcon(imageCDGconv);
				green.setVisible(false);
				h2h.setVisible(false);
				J4Bred.setVisible(false);
				AirYeezy.setVisible(false);
				HumanRace.setVisible(false);
				AirForceTS.setVisible(false);
				Dunks.setVisible(false);
				WaveRunner.setVisible(false);
				Raf.setVisible(false);
				Tailwind.setVisible(false);
				satin.setVisible(false);
				J6TS.setVisible(false);
				AF1white.setVisible(false);
				CDGconv.setVisible(false);
			}
		});
		frame.add(green);
		frame.add(h2h);
		frame.add(J4Bred);
		frame.add(AirYeezy);
		frame.add(HumanRace);
		frame.add(AirForceTS);
		frame.add(Dunks);
		frame.add(WaveRunner);
		frame.add(Raf);
		frame.add(Tailwind);
		frame.add(satin);
		frame.add(J6TS);
		frame.add(AF1white);
		frame.add(CDGconv);

		/* BOTY */

		frame.setLayout(null);

	}
}
