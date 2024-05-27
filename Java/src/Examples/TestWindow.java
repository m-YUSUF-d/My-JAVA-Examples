package Examples;

import java.awt.*;
import javax.swing.*;

class Window extends JFrame {
	
	JLabel[] etiketler;

	Window(String baslik) {
		super(baslik);

		int en = 600;
		int boy = 400;

		this.setSize(en, boy);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 5));

		etiketler = new JLabel[20];

		for (int i = 0; i < etiketler.length; i++) {
			etiketler[i] = new JLabel("0");

			etiketler[i].setHorizontalAlignment(0);
			etiketler[i].setFont(new Font("Arial", Font.BOLD, 36));
			etiketler[i].setOpaque(true); // make opaque the background
			etiketler[i].setBackground(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));

			this.add(etiketler[i]);

			sayiArtir gorev = new sayiArtir(etiketler[i]);
			Thread t = new Thread(gorev);
			t.start();
		}

		this.setVisible(true);
	}
}

class sayiArtir implements Runnable {
	JLabel etiket;
	int hiz;

	sayiArtir(JLabel l) {
		etiket = l;
		hiz = (int) (Math.random() * 4000);
	}

	public void run() {
		for (;;) {
			etiket.setText("" + (Integer.parseInt(etiket.getText()) + 1)); // Get the string, turn int and increase by
																			// 1, turn back string
			try {
				Thread.sleep(hiz);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TestWindow {
	public static void main(String[] args) {
		new Window("My Window");
	}
}