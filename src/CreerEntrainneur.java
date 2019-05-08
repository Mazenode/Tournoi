import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CreerEntrainneur extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntreeNom;
	private JTextField EntreeAge;
	private JTextField EntreePrenom;
	private ArrayList<Entrainneur> listeE;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public CreerEntrainneur(ArrayList<Entrainneur> listeE) {
		setBounds(470, 250, 448, 378);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] nationnalites = { "Allemand", "Argentin", "Belge", "Bresilien", "Sud Coréen", "Espagnol", "Français","Islandais", "Italien", "Portugais","Russe" };
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 428, 356);
		panel.setLayout(null);
		panel.setBackground(new Color(91, 64, 153));
		contentPane.add(panel);
		
		JLabel lblCrerUnJoueur = new JLabel("Cr\u00E9er un entraînneur :");
		lblCrerUnJoueur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrerUnJoueur.setForeground(Color.WHITE);
		lblCrerUnJoueur.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblCrerUnJoueur.setBounds(10, 36, 427, 47);
		panel.add(lblCrerUnJoueur);
		
		JLabel label_1 = new JLabel("Nom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_1.setBounds(91, 101, 59, 47);
		panel.add(label_1);
		
		EntreeNom = new JTextField();
		EntreeNom.setColumns(10);
		EntreeNom.setBounds(149, 117, 159, 20);
		panel.add(EntreeNom);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_2.setBounds(91, 135, 76, 44);
		panel.add(label_2);
		
		EntreePrenom = new JTextField();
		EntreePrenom.setColumns(10);
		EntreePrenom.setBounds(159, 148, 159, 20);
		panel.add(EntreePrenom);
		
		JLabel label_3 = new JLabel("\u00C2ge :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_3.setBounds(91, 171, 42, 36);
		panel.add(label_3);
		
		EntreeAge = new JTextField();
		EntreeAge.setColumns(10);
		EntreeAge.setBounds(142, 182, 36, 20);
		panel.add(EntreeAge);
		
		JLabel label_4 = new JLabel("Nationnalit\u00E9 :");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_4.setBounds(91, 205, 107, 36);
		panel.add(label_4);
		
		JComboBox<String> choixNat = new JComboBox<String>(nationnalites);
		choixNat.setBounds(195, 215, 141, 22);
		panel.add(choixNat);

		JButton button = new JButton("Continuer");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String nom = EntreeNom.getText();
				String prenom = EntreePrenom.getText();
				int age = Integer.parseInt(EntreeAge.getText());
				String nat = choixNat.getSelectedItem().toString();
				String nomEquipe = "";
				Entrainneur entrainneur = new Entrainneur(nom, prenom, age, nat, nomEquipe);
				listeE.add(entrainneur);
				System.out.println(listeE.get(0));
				setList(listeE);
				dispose();
			}
		});
		button.setForeground(new Color(91, 64, 153));
		button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(129, 308, 186, 23);
		panel.add(button);		
	}
	
	public void setList(ArrayList<Entrainneur> listeEntrainneur) {
		listeE = listeEntrainneur;
	}
	
	public ArrayList<Entrainneur> getList() {
		return listeE;
	}
}
