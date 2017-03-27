package vista;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//TODO claseari izena aldatu BigarrenLehioa beharrean BezeroKudeatzailea
public class BigarrenLeihoa extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public BigarrenLeihoa() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnBezeroak = new JButton("Bezeroak");
		btnBezeroak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBezeroak.setBounds(133, 86, 137, 23);
		contentPanel.add(btnBezeroak);
		
		JButton btnConsulta = new JButton("Kontsulta");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsulta.setBounds(133, 146, 137, 23);
		contentPanel.add(btnConsulta);
		
		JLabel lblBigarrenLeihoa = new JLabel("Bigarren Leihoa :");
		lblBigarrenLeihoa.setBounds(126, 30, 144, 20);
		contentPanel.add(lblBigarrenLeihoa);
	}
}
