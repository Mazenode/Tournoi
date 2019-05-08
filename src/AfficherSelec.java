import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AfficherSelec extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

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
	public AfficherSelec(int choix, ArrayList<Equipe> listeEquipeSelec, ArrayList<Joueur> listeJoueurSelec, ArrayList<Entrainneur> listeEntrainneurSelec) {

		if (choix == 2) choix = 1;
		else if (choix == 4) choix = 2;
		else if (choix == 5) choix = 3;
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String titre = "";
		String contenu = "";
		Image imageQuitter = new ImageIcon(this.getClass().getResource("Quitter.png")).getImage();
		

		JPanel Parent = new JPanel();
		Parent.setBounds(10, 11, 448, 389);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
				
		JPanel Menu1 = new JPanel();
		Parent.add(Menu1, "name_149768487873600");
		Menu1.setBackground(new Color(91,64,153));
		Menu1.setLayout(null);
		
		switch (choix) {
			case 1:
				contenu = "Afficher les joueurs déjà séléctionnés :";
				String nomColonnesJ[] = {"Nom","Prénom","Âge", "Nationnalité","Poste"};
				Object[][] donneJ = new Object[listeJoueurSelec.size()] [5];
				JTable table = new JTable(donneJ, nomColonnesJ);
				
				table.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeJoueurSelec.size();i++) {
					donneJ[i][0] = listeJoueurSelec.get(i).getnom();
					
					donneJ[i][1] = listeJoueurSelec.get(i).getprenom();
					
					donneJ[i][2] = listeJoueurSelec.get(i).getage();
					
					donneJ[i][3] = listeJoueurSelec.get(i).getnationnalite();
					
					donneJ[i][4] = listeJoueurSelec.get(i).getposte();
					
				}
				
				Menu1.add(table);
			break;
			case 2:
				contenu = "Afficher les entraînneurs déjà séléctionnés :";
				String nomColonnesE[] = {"Nom","Prénom","Âge", "Nationnalité"};
				Object[][] donneE = new Object[listeEntrainneurSelec.size()] [4];
				JTable tableE = new JTable(donneE,nomColonnesE);
				
				tableE.setBounds(64, 128, 361, 174);		
				for(int i = 0;i <listeEntrainneurSelec.size();i++) {
					donneE[i][0] = listeEntrainneurSelec.get(i).getnom();
					
					donneE[i][1] = listeEntrainneurSelec.get(i).getprenom();
					
					donneE[i][2] = listeEntrainneurSelec.get(i).getage();
					
					donneE[i][3] = listeEntrainneurSelec.get(i).getnationnalite();					
				}
				
				Menu1.add(tableE);
			break;
			case 3:
				contenu = "Afficher les équipes déjà séléctionnés :";
			break;			
		}		
		
		JLabel quitter1 = new JLabel("");
		quitter1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
		quitter1.setIcon(new ImageIcon(imageQuitter));
		quitter1.setBounds(408, 11, 40, 36);
		Menu1.add(quitter1);
		
		JLabel TitreAfficher = new JLabel(contenu);
		TitreAfficher.setHorizontalAlignment(SwingConstants.CENTER);
		TitreAfficher.setForeground(Color.WHITE);
		TitreAfficher.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		TitreAfficher.setBounds(0, 39, 448, 47);
		Menu1.add(TitreAfficher);
		
		
	}
}
