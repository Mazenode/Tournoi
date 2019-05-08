import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;


public class CreerParticipant extends JDialog implements WindowListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Joueur> listeJ;
	private ArrayList<Arbitre> listeA;
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
	
	/*public CreerParticipant() {
		
	}*/
	
	public CreerParticipant(ArrayList<Joueur> listeJoueur, ArrayList<Arbitre> listeArbitre, ArrayList<Entrainneur> listeEntrainneur) {
		String nomEquipe = "Aucune";
		setBounds(470, 250, 468, 411);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image imagePersonneBlanc = new ImageIcon(this.getClass().getResource("PersonnePetitBlanc.png")).getImage();
		Image imagePersonneViolet = new ImageIcon(this.getClass().getResource("PersonnePetitViolet.png")).getImage();
		Image imageSiffletBlanc = new ImageIcon(this.getClass().getResource("SiffletPetitBlanc.png")).getImage();
		Image imageSiffletViolet = new ImageIcon(this.getClass().getResource("SiffletPetitViolet.png")).getImage();
		Image imageEntrainneurBlanc = new ImageIcon(this.getClass().getResource("EntrainneurPetitBlanc.png")).getImage();
		Image imageEntrainneurViolet = new ImageIcon(this.getClass().getResource("EntrainneurPetitViolet.png")).getImage();
		
		String[] nationnalites = { "Allemand", "Argentin", "Belge", "Bresilien", "Sud Coréen", "Espagnol", "Français","Islandais", "Italien", "Portugais","Russe" };
		String[] posteJoueur = { "Attaquant", "Défenseur", "Gardien"};
		String[] posteArbitre = { "Arbitre central", "Arbitre de touche", "Arbitre assistant"};
		
		JPanel Parent = new JPanel();
		
		Parent.setBounds(0, 0, 468, 411);
		contentPane.add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		JPanel ChoisirPoste = new JPanel();
		Parent.add(ChoisirPoste, "name_253688711928100");
		
			ChoisirPoste.setLayout(null);
			ChoisirPoste.setBackground(new Color(91, 64, 153));
			
			JLabel lblJeVeuxCrer = new JLabel("Je veux cr\u00E9er :");
			lblJeVeuxCrer.setForeground(Color.WHITE);
			lblJeVeuxCrer.setFont(new Font("Segoe UI", Font.PLAIN, 23));
			lblJeVeuxCrer.setBounds(160, 69, 157, 47);
			ChoisirPoste.add(lblJeVeuxCrer);
			
			JPanel BoutonCreerJoueur = new JPanel();			
			BoutonCreerJoueur.setBackground(new Color(100, 84, 163));
			BoutonCreerJoueur.setBounds(33, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerJoueur);
			BoutonCreerJoueur.setLayout(null);
			
			JLabel lblJoueur = new JLabel("Joueur");
			lblJoueur.setForeground(Color.WHITE);
			lblJoueur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblJoueur.setBounds(36, 11, 52, 25);
			BoutonCreerJoueur.add(lblJoueur);	
			
			JLabel ImagePersonne = new JLabel("");
			ImagePersonne.setIcon(new ImageIcon(imagePersonneBlanc));
			ImagePersonne.setBounds(36, 48, 52, 47);
			BoutonCreerJoueur.add(ImagePersonne);						
			
			
			JPanel BoutonCreerArbitre = new JPanel();			
			BoutonCreerArbitre.setBackground(new Color(100, 84, 163));
			BoutonCreerArbitre.setBounds(172, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerArbitre);
			BoutonCreerArbitre.setLayout(null);
			
			JLabel lblArbitre = new JLabel("Arbitre");
			lblArbitre.setBounds(37, 11, 53, 20);
			lblArbitre.setForeground(Color.WHITE);
			lblArbitre.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			BoutonCreerArbitre.add(lblArbitre);
			
			JLabel ImageSifflet = new JLabel("");
			ImageSifflet.setIcon(new ImageIcon(imageSiffletBlanc));
			ImageSifflet.setBounds(38, 42, 52, 47);
			BoutonCreerArbitre.add(ImageSifflet);			
			
			JPanel BoutonCreerEntrainneur = new JPanel();			
			BoutonCreerEntrainneur.setBackground(new Color(100, 84, 163));
			BoutonCreerEntrainneur.setBounds(313, 172, 118, 117);
			ChoisirPoste.add(BoutonCreerEntrainneur);
			BoutonCreerEntrainneur.setLayout(null);
			
			JLabel lblEntrainneur = new JLabel("Entrainneur");
			lblEntrainneur.setBounds(26, 11, 82, 20);
			lblEntrainneur.setForeground(Color.WHITE);
			lblEntrainneur.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			BoutonCreerEntrainneur.add(lblEntrainneur);
			
			JLabel ImageEntrainneur = new JLabel("");
			ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurBlanc));
			ImageEntrainneur.setBounds(36, 42, 52, 47);
			BoutonCreerEntrainneur.add(ImageEntrainneur);
				ChoisirPoste.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								BoutonCreerJoueur.setBackground(new Color(100, 84, 163));
								lblJoueur.setForeground(Color.white);					
								ImagePersonne.setIcon(new ImageIcon(imagePersonneBlanc));
								BoutonCreerArbitre.setBackground(new Color(100, 84, 163));
								lblArbitre.setForeground(Color.white);
								ImageSifflet.setIcon(new ImageIcon(imageSiffletBlanc));
								BoutonCreerEntrainneur.setBackground(new Color(100, 84, 163));
								lblEntrainneur.setForeground(Color.white);
								ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurBlanc));
							}
						});
						
						BoutonCreerJoueur.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								BoutonCreerJoueur.setBackground(Color.white);
								lblJoueur.setForeground(new Color(91,64,153));
								ImagePersonne.setIcon(new ImageIcon(imagePersonneViolet));
							}
							@Override
							public void mousePressed(MouseEvent e) {
								dispose();
								CreerJoueur fenetreJ = new CreerJoueur(listeJoueur, nomEquipe);
								listeJ = fenetreJ.getList();
								fenetreJ.setVisible(true);
							}
						});
						
						BoutonCreerArbitre.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								BoutonCreerArbitre.setBackground(Color.white);
								lblArbitre.setForeground(new Color(91,64,153));
								ImageSifflet.setIcon(new ImageIcon(imageSiffletViolet));
							}
							@Override
							public void mousePressed(MouseEvent e) {
								dispose();
								CreerArbitre fenetreA = new CreerArbitre(listeArbitre);
								fenetreA.setVisible(true);
							}
						});
						

						BoutonCreerEntrainneur.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								BoutonCreerEntrainneur.setBackground(Color.white);
								lblEntrainneur.setForeground(new Color(91,64,153));
								ImageEntrainneur.setIcon(new ImageIcon(imageEntrainneurViolet));
							}
							@Override
							public void mousePressed(MouseEvent e) {
								dispose();
								CreerEntrainneur fenetreE = new CreerEntrainneur(listeEntrainneur);
								listeE = fenetreE.getList();
								fenetreE.setVisible(true);
							}
						});
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
