import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class CreerCompet extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField EntreeNomCompet;
	private JTextField EntreeNbEquipes;
	private JTextField EntreeLieuCompet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreerCompet creerCompet = new CreerCompet();
					creerCompet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreerCompet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Parent = new JPanel();
		Parent.setBounds(0, 0, 468, 411);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel CreerCompet1 = new JPanel();
		Parent.add(CreerCompet1, "name_149768487873600");
		CreerCompet1.setBackground(new Color(91,64,153));
		CreerCompet1.setLayout(null);
		
		JLabel TitreCreerCompet1 = new JLabel("Cr\u00E9er une comp\u00E9tition :");
		TitreCreerCompet1.setForeground(Color.WHITE);
		TitreCreerCompet1.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreCreerCompet1.setBounds(112, 62, 249, 47);
		CreerCompet1.add(TitreCreerCompet1);
		
		JLabel lblNomDeLa = new JLabel("Nom de la comp\u00E9tition :");
		lblNomDeLa.setForeground(Color.WHITE);
		lblNomDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNomDeLa.setBounds(49, 157, 174, 47);
		CreerCompet1.add(lblNomDeLa);
		
		EntreeNomCompet = new JTextField();
		EntreeNomCompet.setBounds(233, 173, 159, 20);
		CreerCompet1.add(EntreeNomCompet);
		EntreeNomCompet.setColumns(10);
		
		JLabel lblNombreDquipesParticipantes = new JLabel("Nombre d'\u00E9quipes participantes :");
		lblNombreDquipesParticipantes.setForeground(Color.WHITE);
		lblNombreDquipesParticipantes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNombreDquipesParticipantes.setBounds(49, 192, 243, 47);
		CreerCompet1.add(lblNombreDquipesParticipantes);
		
		EntreeNbEquipes = new JTextField();
		EntreeNbEquipes.setBounds(302, 208, 47, 20);
		CreerCompet1.add(EntreeNbEquipes);
		EntreeNbEquipes.setColumns(10);
		
		JLabel lblLieuDeDroulement = new JLabel("Lieu de d\u00E9roulement :");
		lblLieuDeDroulement.setForeground(Color.WHITE);
		lblLieuDeDroulement.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblLieuDeDroulement.setBounds(49, 226, 167, 47);
		CreerCompet1.add(lblLieuDeDroulement);
		
		EntreeLieuCompet = new JTextField();
		EntreeLieuCompet.setBounds(220, 242, 158, 20);
		CreerCompet1.add(EntreeLieuCompet);
		EntreeLieuCompet.setColumns(10);
		
		JPanel CreerCompet2 = new JPanel();
		
		JButton btnContinuer = new JButton("Continuer");
		btnContinuer.setForeground(new Color(91,64,153) );
		btnContinuer.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnContinuer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parent.removeAll();
				Parent.add(CreerCompet2);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		btnContinuer.setBackground(Color.WHITE);
		btnContinuer.setBounds(140, 344, 186, 23);
		CreerCompet1.add(btnContinuer);
		
		
		CreerCompet2.setLayout(null);
		CreerCompet2.setBackground(new Color(91, 64, 153));
		Parent.add(CreerCompet2, "name_149922086670100");
		
		JLabel label = new JLabel("Cr\u00E9er une comp\u00E9tition :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		label.setBounds(112, 62, 249, 47);
		CreerCompet2.add(label);
		
		JButton btnAjouterUnequipe = new JButton("Ajouter une \u00E9quipe \u00E9xistante");
		btnAjouterUnequipe.setForeground(new Color(91, 64, 153));
		btnAjouterUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAjouterUnequipe.setBackground(Color.WHITE);
		btnAjouterUnequipe.setBounds(112, 186, 249, 23);
		CreerCompet2.add(btnAjouterUnequipe);
		
		JLabel lblOu = new JLabel("ou");
		lblOu.setForeground(Color.WHITE);
		lblOu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblOu.setBounds(222, 219, 23, 23);
		CreerCompet2.add(lblOu);
		
		JButton btnCrerUnequipe = new JButton("Cr\u00E9er une \u00E9quipe puis l'ajouter");
		btnCrerUnequipe.setForeground(new Color(91, 64, 153));
		btnCrerUnequipe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnCrerUnequipe.setBackground(Color.WHITE);
		btnCrerUnequipe.setBounds(112, 253, 249, 23);
		CreerCompet2.add(btnCrerUnequipe);
	}
}
