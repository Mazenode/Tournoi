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

public class CreerJoueur extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntreeNom;
	private JTextField EntreeAge;
	private JTextField EntreePrenom;
	private ArrayList<Joueur> listeJ;

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
	
	public CreerJoueur(ArrayList<Joueur> listeJ, String nomEquipe) {
		setBounds(470, 250, 468, 424);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] nationnalites = { "Allemand", "Argentin", "Belge", "Bresilien", "Sud Coréen", "Espagnol", "Français","Islandais", "Italien", "Portugais","Russe" };
		String[] posteJoueur = { "Attaquant", "Défenseur", "Gardien"};
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 448, 402);
		panel.setLayout(null);
		panel.setBackground(new Color(91, 64, 153));
		contentPane.add(panel);
		
		JLabel lblCrerUnJoueur = new JLabel("Cr\u00E9er un joueur :");
		lblCrerUnJoueur.setHorizontalAlignment(SwingConstants.CENTER);
		lblCrerUnJoueur.setForeground(Color.WHITE);
		lblCrerUnJoueur.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		lblCrerUnJoueur.setBounds(10, 60, 428, 47);
		panel.add(lblCrerUnJoueur);
		
		JLabel label_1 = new JLabel("Nom :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_1.setBounds(99, 125, 59, 47);
		panel.add(label_1);
		
		EntreeNom = new JTextField();
		EntreeNom.setColumns(10);
		EntreeNom.setBounds(157, 141, 159, 20);
		panel.add(EntreeNom);
		
		JLabel label_2 = new JLabel("Pr\u00E9nom :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_2.setBounds(99, 159, 76, 44);
		panel.add(label_2);
		
		EntreePrenom = new JTextField();
		EntreePrenom.setColumns(10);
		EntreePrenom.setBounds(167, 172, 159, 20);
		panel.add(EntreePrenom);
		
		JLabel label_3 = new JLabel("\u00C2ge :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_3.setBounds(99, 195, 42, 36);
		panel.add(label_3);
		
		EntreeAge = new JTextField();
		EntreeAge.setColumns(10);
		EntreeAge.setBounds(150, 206, 36, 20);
		panel.add(EntreeAge);
		
		JLabel label_4 = new JLabel("Nationnalit\u00E9 :");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		label_4.setBounds(99, 229, 107, 36);
		panel.add(label_4);
		
		JComboBox<String> choixNat = new JComboBox<String>(nationnalites);
		choixNat.setBounds(195, 240, 141, 22);
		panel.add(choixNat);
		
		JLabel lblPoste = new JLabel("Poste :");
		lblPoste.setForeground(Color.WHITE);
		lblPoste.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblPoste.setBounds(99, 258, 107, 36);
		panel.add(lblPoste);
		
		JComboBox<String> choixPoste = new JComboBox<String>(posteJoueur);
		choixPoste.setBounds(149, 270, 141, 22);
		panel.add(choixPoste);
		
		JButton button = new JButton("Continuer");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String nom = EntreeNom.getText();
				String prenom = EntreePrenom.getText();
				int age = Integer.parseInt(EntreeAge.getText());
				String nat = choixNat.getSelectedItem().toString();
				String poste = choixPoste.getSelectedItem().toString();
				String nomEquipe = "";
				Joueur joueur = new Joueur(nom, prenom, age, nat, poste, nomEquipe);
				listeJ.add(joueur);
				System.out.println(listeJ.get(0));
				setList(listeJ);
				dispose();
			}
		});
		
		button.setForeground(new Color(91, 64, 153));
		button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(137, 332, 186, 23);
		panel.add(button);		
	}
	
	public void setList(ArrayList<Joueur> listeJoueur) {
		listeJ = listeJoueur;
	}
	
	public ArrayList<Joueur> getList() {
		return listeJ;
	}
}
