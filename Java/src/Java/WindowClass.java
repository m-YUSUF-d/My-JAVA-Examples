package Java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Window extends JFrame
		implements ActionListener, ItemListener, WindowListener, MouseListener, MouseMotionListener, KeyListener {

	JPanel[] panles;
	Color[] colors;
	JButton[] buttons;
	JComboBox comboBox;
	JCheckBox[] checkings;
	JLabel label;
	JTextField textField;
	JRadioButton[] radioButton;
	String old;

	Window(String baslik) {
		super(baslik);
		int en = 600;
		int boy = 450;
		this.setBounds(50, 150, en, boy + 50);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);

		colors = new Color[3];
		colors[0] = Color.RED;
		colors[1] = Color.BLUE;
		colors[2] = Color.GREEN;

		panles = new JPanel[3];
		for (int i = 0; i < panles.length; i++) {
			panles[i] = new JPanel();
			panles[i].setBackground(colors[i]);
			panles[i].setBounds(0, i * boy / 3, en, boy / 3);
			panles[i].setLayout(new FlowLayout());
			this.add(panles[i]);
		}

		buttons = new JButton[5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("" + (i + 1));
			buttons[i].addActionListener(this);
			panles[0].add(buttons[i]);
		}

		comboBox = new JComboBox(new String[] { "Java", "C++", "Python", "Delphi", "Basic" });
		comboBox.addActionListener(this);
		panles[0].add(comboBox);

		String[] takimlar = { "Galatasaray", "Fenerbahce", "Trabzonspor" };
		checkings = new JCheckBox[3];

		for (int i = 0; i < checkings.length; i++) {
			checkings[i] = new JCheckBox(takimlar[i]);
			checkings[i].addItemListener(this);
			checkings[i].setOpaque(false);
			checkings[i].setSelected(true);
			panles[1].add(checkings[i]);
		}

		String[] meyveler = { "Elma", "Armut", "Portakal", "Avokado" };
		radioButton = new JRadioButton[4];
		ButtonGroup bg = new ButtonGroup();

		for (int i = 0; i < radioButton.length; i++) {
			radioButton[i] = new JRadioButton(meyveler[i]);
			radioButton[i].addActionListener(this);
			radioButton[i].setOpaque(false);
			bg.add(radioButton[i]);
			panles[1].add(radioButton[i]);
		}

		panles[2].setLayout(null);

		label = new JLabel("Ad: ");
		label.setBounds(10, 10, 100, 30);
		panles[2].add(label);

		textField = new JTextField("Varsayilan");
		old = textField.getText();
		textField.setBounds(110, 10, 100, 30);
		panles[2].add(textField);

		this.addWindowListener(this);
		buttons[1].addMouseListener(this);
		this.addMouseMotionListener(this);
		textField.addKeyListener(this);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object nesne = e.getSource();
		if (nesne instanceof JButton) {
			JButton kaynak = (JButton) nesne;
			String metin = kaynak.getText();
			int sayi = Integer.parseInt(metin);

			if (sayi == 4) {
				textField.setText("");
			} else if (sayi == 5) {
				JOptionPane.showMessageDialog(null, textField.getText());
			} else if (sayi % 2 == 0) // tek indisli düğmeye basıldıysa
			{
				panles[1].setVisible(!panles[1].isVisible());
			} else {
				panles[2].setVisible(!panles[2].isVisible());
			}
		} else if (nesne instanceof JComboBox) {
			JComboBox jcbref = (JComboBox) nesne;
			String secilen = (String) jcbref.getSelectedItem();
			JOptionPane.showMessageDialog(null, secilen + " secildi!!!!");
		} else if (nesne instanceof JRadioButton) {
			JRadioButton jrbref = (JRadioButton) nesne;
			System.out.println(e.getActionCommand() + " secildi");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		Object nesne = e.getSource();

		if (nesne instanceof JCheckBox) {
			JCheckBox tiklanan = (JCheckBox) nesne;

			if (tiklanan.isSelected()) {
				System.out.println(tiklanan.getText() + " tiklendi");
			} else {
				System.out.println(tiklanan.getText() + " tik kaldirildi");
			}
		}
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosing(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("Pencere simge durumuna kuculdu");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("Pencere simge durumundan cikti");
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Dugme2 sınırlarına girildi");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("Dugme2 sınırlarından cikildi");
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("Drag var, lastikler yaniyor");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
		char basilantus = e.getKeyChar();
		System.out.println(basilantus + " tuslandi");

		if (basilantus >= '0' && basilantus <= '9') {
			textField.setText(old);
		} else
			old = textField.getText();
	}
}

public class WindowClass {
	public static void main(String[] args) {
		new Window("Pencerem");
	}
}