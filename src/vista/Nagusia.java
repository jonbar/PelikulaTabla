package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Nagusia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nagusia frame = new Nagusia();
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
	public Nagusia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBezeroKudeatzailea = new JButton("Bezero Kudeatzailea");
		btnBezeroKudeatzailea.setBounds(132, 101, 177, 23);
		contentPane.add(btnBezeroKudeatzailea);
		
		JButton btnProduktuKudeatzailea = new JButton("Produktu Kudeatzailea");
		btnProduktuKudeatzailea.setBounds(132, 160, 177, 23);
		contentPane.add(btnProduktuKudeatzailea);
		
		JLabel lblBiltegia = new JLabel("BILTEGIA");
		lblBiltegia.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblBiltegia.setBounds(173, 25, 136, 14);
		contentPane.add(lblBiltegia);
	}
}
