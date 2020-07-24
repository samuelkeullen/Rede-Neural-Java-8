package samuelkeullen.miraikeullen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TrainArea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void train(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainArea frame = new TrainArea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrainArea() {
		setTitle("Área de Treino");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
