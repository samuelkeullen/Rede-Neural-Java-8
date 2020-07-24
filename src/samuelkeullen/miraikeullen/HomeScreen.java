package samuelkeullen.miraikeullen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import samuelkeullen.miraikeullen.*;
import javax.swing.JLabel;
import java.awt.Color;

public class HomeScreen {

	private JFrame frmMiraiai;

	/**
	 * Launcher do Programa.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frmMiraiai.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomeScreen() {
		initialize();
	}

	private void initialize() {
		frmMiraiai = new JFrame();
		frmMiraiai.getContentPane().setBackground(Color.BLACK);
		frmMiraiai.setTitle("Mirai (A.I)");
		frmMiraiai.setBounds(100, 100, 450, 300);
		frmMiraiai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiraiai.getContentPane().setLayout(null);
		
		
		JButton btnreaDeTreino = new JButton("Área de Treino");
		btnreaDeTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TrainArea frame = new TrainArea();
				frame.setVisible(true);
				//window.frmTrainArea.setVisible(true);
			}
		});
		btnreaDeTreino.setBounds(26, 12, 130, 40);
		frmMiraiai.getContentPane().add(btnreaDeTreino);
		
		JButton btnArquivoDeTreino = new JButton("Arquivo de Treino");
		btnArquivoDeTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TrainArchive frame = new TrainArchive();
				frame.setVisible(true);
				//window.frmTrainArea.setVisible(true);
			}
		});
		btnArquivoDeTreino.setBounds(26, 64, 130, 40);
		frmMiraiai.getContentPane().add(btnArquivoDeTreino);
		
		JButton btnChat = new JButton("Chat");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Chat frame = new Chat();
				frame.setVisible(true);
				//window.frmTrainArea.setVisible(true);
			}
		});
		btnChat.setBounds(26, 116, 130, 40);
		frmMiraiai.getContentPane().add(btnChat);
		
		JButton btnPesquisa = new JButton("Pesquisa");
		btnPesquisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Search frame = new Search();
				frame.setVisible(true);
				//window.frmTrainArea.setVisible(true);
			}
		});
		btnPesquisa.setBounds(26, 168, 130, 40);
		frmMiraiai.getContentPane().add(btnPesquisa);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About frame = new About();
				frame.setVisible(true);
				//window.frmTrainArea.setVisible(true);
			}
		});
		btnSobre.setBounds(26, 220, 130, 36);
		frmMiraiai.getContentPane().add(btnSobre);
		
		JTextPane txtpnSamuel = new JTextPane();
		txtpnSamuel.setBackground(Color.BLACK);
		txtpnSamuel.setForeground(Color.WHITE);
		txtpnSamuel.setText("© 2020 Samuel Keullen");
		txtpnSamuel.setBounds(281, 247, 153, 21);
		frmMiraiai.getContentPane().add(txtpnSamuel);
		
		JLabel lblIcone = new JLabel("icone");
		lblIcone.setIcon(new ImageIcon(HomeScreen.class.getResource("/images/WhatsApp Image 2020-07-23 at 16.01.54.jpeg")));
		lblIcone.setBounds(254, 0, 180, 236);
		frmMiraiai.getContentPane().add(lblIcone);
		

	}
}

