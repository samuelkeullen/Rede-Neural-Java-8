package samuelkeullen.miraikeullen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TrainArchive extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void archive(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainArchive frame = new TrainArchive();
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
	public TrainArchive() {
		setTitle("Arquivo de Treino");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
