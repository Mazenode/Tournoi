import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.CardLayout;

public class MP extends JPanel implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame Menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MP window = new MP();
					window.Menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}

	/**
	 * Create the application.
	 */
	public MP() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 ArrayList<Joueur> listeJoueur = new ArrayList();
	     ArrayList<Arbitre> listeArbitre = new ArrayList();
	     ArrayList<Entrainneur> listeEntrainneur = new ArrayList();
	     ArrayList<Competition> listeCompet = new ArrayList();
	     ArrayList<Match> listeMatch = new ArrayList();
	     ArrayList<Equipe> listeEquipe = new ArrayList();
	     ArrayList<Equipe> listeEquipeSelec = new ArrayList();
	     ArrayList<Joueur> listeJoueurSelec = new ArrayList();
	     ArrayList<Entrainneur> listeEntrainneurSelec = new ArrayList();
	     
	     listeJoueur.add(new Joueur("Aubry","Mathieu",19,"France","Attaquant", "aucune"));
		 listeJoueur.add(new Joueur("Chaignaud","Quentin",20,"France","Attaquant","aucune"));
		
		Menu = new JFrame();
		Menu.getContentPane().setLayout(null);
		Menu.setTitle("Gestion de Tournois de Foot");

		addMouseListener(this);
		addMouseMotionListener(this);		
		
		Image imageCoupe = new ImageIcon(this.getClass().getResource("Coupe.png")).getImage();
		Image imagePersonne = new ImageIcon(this.getClass().getResource("Personne.png")).getImage();
		Image imageLivre = new ImageIcon(this.getClass().getResource("Livre.png")).getImage();
		Image imageLivre2 = new ImageIcon(this.getClass().getResource("Livre2.png")).getImage();
		Image imageBallon = new ImageIcon(this.getClass().getResource("Ballon.png")).getImage();
		Image imageBallon2 = new ImageIcon(this.getClass().getResource("Ballon2.png")).getImage();
		Image imageSifflet = new ImageIcon(this.getClass().getResource("Sifflet.png")).getImage();
		Image imageEntrainneur = new ImageIcon(this.getClass().getResource("Entrainneur.png")).getImage();

		JPanel cache = new JPanel();
		cache.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cache.setVisible(true);				
			}
		});
		cache.setBounds(0, 0, 1220, 624);
		Menu.getContentPane().add(cache);
		cache.setBackground(new Color(0,0,0, 120));
		cache.setLayout(null);
		cache.setVisible(false);
		
		JPanel MenuDeGauche = new JPanel();		
		MenuDeGauche.setBackground(new Color(91,64,153));
		MenuDeGauche.setForeground(new Color(255, 255, 255));
		MenuDeGauche.setBounds(0, 0, 379, 624);
		Menu.getContentPane().add(MenuDeGauche);
		MenuDeGauche.setLayout(null);
		
		JLabel Titre1 = new JLabel("Gestion d'un Tournoi");
		Titre1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		Titre1.setForeground(new Color(255, 255, 255));
		Titre1.setBounds(85, 39, 248, 24);
		MenuDeGauche.add(Titre1);
		
		JLabel Titre2 = new JLabel("de Foot");
		Titre2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		Titre2.setForeground(Color.WHITE);
		Titre2.setBounds(150, 66, 105, 24);
		MenuDeGauche.add(Titre2);
		
		JPanel BoutonMP = new JPanel();		
		BoutonMP.setBackground(new Color(100,84,163));
		BoutonMP.setBounds(0, 233, 379, 44);
		MenuDeGauche.add(BoutonMP);
		BoutonMP.setLayout(null);
		
		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setBounds(80, 0, 147, 44);
		lblMenuPrincipal.setForeground(new Color(255, 255, 255));
		lblMenuPrincipal.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		BoutonMP.add(lblMenuPrincipal);
		
		JLabel ImageHome = new JLabel("");
		Image imageHome = new ImageIcon(this.getClass().getResource("Home.png")).getImage();
		ImageHome.setIcon(new ImageIcon(imageHome));
		ImageHome.setBounds(31, 0, 39, 44);
		BoutonMP.add(ImageHome);
		
		JPanel BoutonAfficher = new JPanel();		
		BoutonAfficher.setLayout(null);
		BoutonAfficher.setBackground(new Color(100, 84, 163));
		BoutonAfficher.setBounds(0, 277, 379, 44);
		MenuDeGauche.add(BoutonAfficher);
		
		JLabel lblAfficher = new JLabel("Afficher...");
		lblAfficher.setForeground(Color.WHITE);
		lblAfficher.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblAfficher.setBounds(80, 0, 147, 44);
		BoutonAfficher.add(lblAfficher);
		
		JLabel ImageLoupe = new JLabel("");
		Image imageLoupe = new ImageIcon(this.getClass().getResource("Loupe.png")).getImage();
		ImageLoupe.setIcon(new ImageIcon(imageLoupe));
		ImageLoupe.setBounds(31, 0, 39, 44);
		BoutonAfficher.add(ImageLoupe);
		
		JPanel BoutonSupprimer = new JPanel();
		BoutonSupprimer.setBounds(0, 320, 379, 44);
		MenuDeGauche.add(BoutonSupprimer);
		BoutonSupprimer.setLayout(null);
		BoutonSupprimer.setBackground(new Color(100, 84, 163));
		
		JLabel lblSupprimer = new JLabel("Supprimer...");
		lblSupprimer.setForeground(Color.WHITE);
		lblSupprimer.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblSupprimer.setBounds(80, 0, 147, 44);
		BoutonSupprimer.add(lblSupprimer);
		
		JLabel ImagePoubelle = new JLabel("");
		ImagePoubelle.setBounds(31, 0, 39, 44);
		BoutonSupprimer.add(ImagePoubelle);		
		Image imagePoubelle = new ImageIcon(this.getClass().getResource("Poubelle.png")).getImage();
		ImagePoubelle.setIcon(new ImageIcon(imagePoubelle));		
		
		JLabel NomsBasDePage = new JLabel("Quentin Chaignaud - Mathieu Aubry");
		NomsBasDePage.setForeground(Color.WHITE);
		NomsBasDePage.setFont(new Font("Segoe UI", Font.BOLD, 11));
		NomsBasDePage.setBounds(90, 588, 194, 14);
		MenuDeGauche.add(NomsBasDePage);
		
		JPanel Trait = new JPanel();
		Trait.setBounds(60, 113, 256, 2);
		MenuDeGauche.add(Trait);
		
		JPanel Parent = new JPanel();
		Parent.setBounds(384, 0, 822, 613);
		Menu.getContentPane().add(Parent);
		Parent.setLayout(new CardLayout(0, 0));
		
		JPanel MenuDeDroite = new JPanel();
		Parent.add(MenuDeDroite, "name_608242427508900");
		MenuDeDroite.setLayout(null);
		JPanel BoutonCreerCompet = new JPanel();
		BoutonCreerCompet.setBounds(45, 32, 357, 268);
		
		BoutonCreerCompet.setBackground(new Color(91,64,153));
		MenuDeDroite.add(BoutonCreerCompet);
		BoutonCreerCompet.setLayout(null);
		
		JLabel Titre1CreerCompet = new JLabel("comp\u00E9tition");
		Titre1CreerCompet.setBounds(112, 70, 152, 30);
		Titre1CreerCompet.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Titre1CreerCompet.setForeground(Color.WHITE);
		BoutonCreerCompet.add(Titre1CreerCompet);
		
		JLabel Titre2CreerCompet = new JLabel("Cr\u00E9er une");
		Titre2CreerCompet.setForeground(Color.WHITE);
		Titre2CreerCompet.setFont(new Font("Segoe UI", Font.BOLD, 22));
		Titre2CreerCompet.setBounds(126, 40, 100, 30);
		BoutonCreerCompet.add(Titre2CreerCompet);
		
		JLabel ImageCoupe = new JLabel("");
		ImageCoupe.setIcon(new ImageIcon(imageCoupe));
		ImageCoupe.setBounds(140, 135, 67, 60);
		BoutonCreerCompet.add(ImageCoupe);
		
		JPanel BoutonCreerParticipant = new JPanel();
		BoutonCreerParticipant.setBounds(45, 323, 357, 268);
		BoutonCreerParticipant.setBackground(new Color(91, 64, 153));
		MenuDeDroite.add(BoutonCreerParticipant);
		BoutonCreerParticipant.setLayout(null);
		
		JLabel TitreCreerParticipant = new JLabel("Cr\u00E9er un partcipant");
		TitreCreerParticipant.setBounds(76, 46, 213, 30);
		TitreCreerParticipant.setForeground(Color.WHITE);
		TitreCreerParticipant.setFont(new Font("Segoe UI", Font.BOLD, 22));
		BoutonCreerParticipant.add(TitreCreerParticipant);
		
		JLabel ImagePersonne = new JLabel("");
		ImagePersonne.setIcon(new ImageIcon(imagePersonne));
		ImagePersonne.setBounds(144, 125, 65, 70);
		BoutonCreerParticipant.add(ImagePersonne);
		
		JPanel BoutonCreerEquipe = new JPanel();
		BoutonCreerEquipe.setBounds(428, 32, 357, 268);
		BoutonCreerEquipe.setBackground(new Color(91, 64, 153));
		MenuDeDroite.add(BoutonCreerEquipe);
		BoutonCreerEquipe.setLayout(null);
		
		JLabel TitreCreerEquipe = new JLabel("Cr\u00E9er une \u00E9quipe");
		TitreCreerEquipe.setBounds(90, 58, 177, 30);
		TitreCreerEquipe.setForeground(Color.WHITE);
		TitreCreerEquipe.setFont(new Font("Segoe UI", Font.BOLD, 22));
		BoutonCreerEquipe.add(TitreCreerEquipe);
		
		JLabel ImageLivre = new JLabel("");		
		ImageLivre.setBounds(145, 126, 94, 81);
		ImageLivre.setIcon(new ImageIcon(imageLivre));
		BoutonCreerEquipe.add(ImageLivre);
		
		JPanel BoutonCreerMatch = new JPanel();
		BoutonCreerMatch.setBounds(428, 323, 357, 268);
		BoutonCreerMatch.setBackground(new Color(91, 64, 153));
		MenuDeDroite.add(BoutonCreerMatch);
		BoutonCreerMatch.setLayout(null);
		
		JLabel TitreCreerMatch = new JLabel("Cr\u00E9er un match");
		TitreCreerMatch.setBounds(99, 46, 175, 30);
		TitreCreerMatch.setForeground(Color.WHITE);
		TitreCreerMatch.setFont(new Font("Segoe UI", Font.BOLD, 22));
		BoutonCreerMatch.add(TitreCreerMatch);
		
		JLabel ImageBallon = new JLabel("");
		ImageBallon.setBounds(147, 117, 94, 81);
		ImageBallon.setIcon(new ImageIcon(imageBallon));
		BoutonCreerMatch.add(ImageBallon);
		
		BoutonCreerCompet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BoutonCreerCompet.setBackground(new Color(100, 84, 163));
				BoutonCreerEquipe.setBackground(new Color(91,64,153));
				BoutonCreerParticipant.setBackground(new Color(91,64,153));
				BoutonCreerMatch.setBackground(new Color(91, 64, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				CreerCompet creerCompet = new CreerCompet();
				creerCompet.setVisible(true);
				cache.setVisible(true);
			}
		});
		BoutonCreerParticipant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BoutonCreerCompet.setBackground(new Color(91,64,153));
				BoutonCreerEquipe.setBackground(new Color(91,64,153));
				BoutonCreerParticipant.setBackground(new Color(100, 84, 163));
				BoutonCreerMatch.setBackground(new Color(91, 64, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {				
				CreerParticipant creerParticipant = new CreerParticipant(listeJoueur, listeArbitre, listeEntrainneur);
				cache.setVisible(true);
				creerParticipant.setVisible(true);
				creerParticipant.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});				
			}
		});
		BoutonCreerEquipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BoutonCreerCompet.setBackground(new Color(91,64,153));
				BoutonCreerEquipe.setBackground(new Color(100, 84, 163));
				BoutonCreerParticipant.setBackground(new Color(91,64,153));
				BoutonCreerMatch.setBackground(new Color(91, 64, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				CreerEquipe creerEquipe = new CreerEquipe(listeCompet, listeJoueurSelec, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch);
				cache.setVisible(true);
				creerEquipe.setVisible(true);
				creerEquipe.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		BoutonCreerMatch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BoutonCreerCompet.setBackground(new Color(91,64,153));
				BoutonCreerEquipe.setBackground(new Color(91,64,153));
				BoutonCreerParticipant.setBackground(new Color(91,64,153));
				BoutonCreerMatch.setBackground(new Color(100, 84, 163));
			
			}
		});
		
		
		JPanel fond = new JPanel();
		fond.setBounds(10, 11, 848, 580);
		MenuDeDroite.add(fond);
		
		JPanel AfficherDroite = new JPanel();
		Parent.add(AfficherDroite, "name_163557389964200");
		AfficherDroite.setLayout(null);
		
		JPanel AfficherLesCompetitions = new JPanel();
		AfficherLesCompetitions.setLayout(null);
		AfficherLesCompetitions.setBackground(new Color(91, 64, 153));
		AfficherLesCompetitions.setBounds(20, 60, 250, 250);
		AfficherDroite.add(AfficherLesCompetitions);
		
		JLabel Titre1AfficherCompet = new JLabel("Afficher les");
		Titre1AfficherCompet.setBounds(66, 36, 133, 30);
		AfficherLesCompetitions.add(Titre1AfficherCompet);
		Titre1AfficherCompet.setForeground(Color.WHITE);
		Titre1AfficherCompet.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel Titre2AfficherCompet = new JLabel("comp\u00E9titions");
		Titre2AfficherCompet.setForeground(Color.WHITE);
		Titre2AfficherCompet.setFont(new Font("Segoe UI", Font.BOLD, 20));
		Titre2AfficherCompet.setBounds(57, 63, 133, 30);
		AfficherLesCompetitions.add(Titre2AfficherCompet);
		
		JLabel AfficherCompet = new JLabel("");
		AfficherCompet.setIcon(new ImageIcon(imageCoupe));
		AfficherCompet.setBounds(92, 130, 67, 60);
		AfficherLesCompetitions.add(AfficherCompet);
		
		JPanel AfficherLesJoueurs = new JPanel();
		AfficherLesJoueurs.setBackground(new Color(91, 64, 153));
		AfficherLesJoueurs.setBounds(289, 60, 250, 250);
		AfficherDroite.add(AfficherLesJoueurs);
		AfficherLesJoueurs.setLayout(null);
		
		JLabel Titre1AfficherJoueur = new JLabel("Afficher les");
		Titre1AfficherJoueur.setBounds(70, 37, 133, 30);
		Titre1AfficherJoueur.setForeground(Color.WHITE);
		Titre1AfficherJoueur.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesJoueurs.add(Titre1AfficherJoueur);
		
		JLabel Titre2AfficherJoueur = new JLabel("joueurs");
		Titre2AfficherJoueur.setBounds(89, 61, 79, 30);
		Titre2AfficherJoueur.setForeground(Color.WHITE);
		Titre2AfficherJoueur.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesJoueurs.add(Titre2AfficherJoueur);
		
		JLabel AfficherJoueur = new JLabel("");
		AfficherJoueur.setBounds(96, 120, 67, 70);
		AfficherJoueur.setIcon(new ImageIcon(imagePersonne));
		AfficherLesJoueurs.add(AfficherJoueur);
		
		JPanel AfficherLesArbitres = new JPanel();
		AfficherLesArbitres.setBackground(new Color(91, 64, 153));
		AfficherLesArbitres.setBounds(557, 60, 250, 250);
		AfficherDroite.add(AfficherLesArbitres);
		AfficherLesArbitres.setLayout(null);
		
		JLabel TitreAfficherArbitre1 = new JLabel("Afficher les");
		TitreAfficherArbitre1.setBounds(71, 37, 118, 30);
		TitreAfficherArbitre1.setForeground(Color.WHITE);
		TitreAfficherArbitre1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesArbitres.add(TitreAfficherArbitre1);
		
		JLabel TitreAfficherArbitre2 = new JLabel("arbitres");
		TitreAfficherArbitre2.setBounds(88, 60, 79, 30);
		TitreAfficherArbitre2.setForeground(Color.WHITE);
		TitreAfficherArbitre2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesArbitres.add(TitreAfficherArbitre2);
		
		JLabel AfficherArbitre = new JLabel("");
		AfficherArbitre.setBounds(96, 121, 62, 70);
		AfficherArbitre.setIcon(new ImageIcon(imageSifflet));
		AfficherLesArbitres.add(AfficherArbitre);
		
		JPanel AfficherLesEntrainneurs = new JPanel();
		AfficherLesEntrainneurs.setBackground(new Color(91, 64, 153));
		AfficherLesEntrainneurs.setBounds(20, 328, 250, 250);
		AfficherDroite.add(AfficherLesEntrainneurs);
		AfficherLesEntrainneurs.setLayout(null);
		
		JLabel TitreAfficherEntrainneur1 = new JLabel("Afficher les");
		TitreAfficherEntrainneur1.setBounds(66, 36, 133, 30);
		TitreAfficherEntrainneur1.setForeground(Color.WHITE);
		TitreAfficherEntrainneur1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesEntrainneurs.add(TitreAfficherEntrainneur1);
		
		JLabel TitreAfficherEntrainneur2 = new JLabel("entra\u00EEneurs");
		TitreAfficherEntrainneur2.setBounds(66, 63, 121, 30);
		TitreAfficherEntrainneur2.setForeground(Color.WHITE);
		TitreAfficherEntrainneur2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesEntrainneurs.add(TitreAfficherEntrainneur2);
		
		JLabel AfficherEntrainneur = new JLabel("");
		AfficherEntrainneur.setIcon(new ImageIcon(imageEntrainneur));
		AfficherEntrainneur.setBounds(92, 120, 67, 70);
		AfficherLesEntrainneurs.add(AfficherEntrainneur);
		
		JPanel AfficherLesEquipes = new JPanel();
		AfficherLesEquipes.setBackground(new Color(91, 64, 153));
		AfficherLesEquipes.setBounds(289, 328, 250, 250);
		AfficherDroite.add(AfficherLesEquipes);
		AfficherLesEquipes.setLayout(null);
		
		JLabel TitreAfficherEquipe1 = new JLabel("Afficher les");
		TitreAfficherEquipe1.setBounds(70, 37, 133, 30);
		TitreAfficherEquipe1.setForeground(Color.WHITE);
		TitreAfficherEquipe1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesEquipes.add(TitreAfficherEquipe1);
		
		JLabel TitreAfficherEquipe2 = new JLabel("\u00E9quipes");
		TitreAfficherEquipe2.setBounds(89, 61, 79, 30);
		TitreAfficherEquipe2.setForeground(Color.WHITE);
		TitreAfficherEquipe2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesEquipes.add(TitreAfficherEquipe2);
		
		JLabel AfficherEquipe = new JLabel("");
		AfficherEquipe.setIcon(new ImageIcon(imageLivre2));
		AfficherEquipe.setBounds(96, 120, 67, 70);
		AfficherLesEquipes.add(AfficherEquipe);
		
		JPanel AfficherLesMatchs = new JPanel();
		AfficherLesMatchs.setBackground(new Color(91, 64, 153));
		AfficherLesMatchs.setBounds(557, 328, 250, 250);
		AfficherDroite.add(AfficherLesMatchs);
		AfficherLesMatchs.setLayout(null);
		
		JLabel TitreAfficherMatch1 = new JLabel("Afficher les");
		TitreAfficherMatch1.setBounds(71, 37, 118, 30);
		TitreAfficherMatch1.setForeground(Color.WHITE);
		TitreAfficherMatch1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesMatchs.add(TitreAfficherMatch1);
		
		JLabel TitreAfficherMatch2 = new JLabel("matchs");
		TitreAfficherMatch2.setBounds(92, 60, 79, 30);
		TitreAfficherMatch2.setForeground(Color.WHITE);
		TitreAfficherMatch2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		AfficherLesMatchs.add(TitreAfficherMatch2);
		
		JLabel AfficherMatch = new JLabel("");
		AfficherMatch.setIcon(new ImageIcon(imageBallon2));
		AfficherMatch.setBounds(96, 121, 68, 70);
		AfficherLesMatchs.add(AfficherMatch);
		
		JPanel fond_1 = new JPanel();
		fond_1.setBounds(10, 11, 812, 591);
		AfficherDroite.add(fond_1);
		
		
		
		AfficherLesCompetitions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(100, 84, 163));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherCompet = new Afficher(1, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherCompet.setVisible(true);
				afficherCompet.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		AfficherLesJoueurs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(100, 84, 163));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherJoueurs = new Afficher(2, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherJoueurs.setVisible(true);
				afficherJoueurs.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		AfficherLesArbitres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(100, 84, 163));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherEntrainneurs = new Afficher(3, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherEntrainneurs.setVisible(true);
				afficherEntrainneurs.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		AfficherLesEntrainneurs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(100, 84, 163));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherEntrainneurs = new Afficher(4, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherEntrainneurs.setVisible(true);
				afficherEntrainneurs.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		AfficherLesEquipes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(100, 84, 163));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherEquipes = new Afficher(5, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherEquipes.setVisible(true);
				afficherEquipes.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		AfficherLesMatchs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(100, 84, 163));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Afficher afficherMatchs = new Afficher(6, listeCompet, listeJoueur, listeEquipe, listeArbitre, listeEntrainneur, listeMatch, listeEquipeSelec, listeJoueurSelec, listeEntrainneurSelec);
				cache.setVisible(true);
				afficherMatchs.setVisible(true);
				afficherMatchs.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						cache.setVisible(false);	
					}
				});
			}
		});
		
		fond_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				AfficherLesCompetitions.setBackground(new Color(91,64,153));
				AfficherLesJoueurs.setBackground(new Color(91,64,153));
				AfficherLesArbitres.setBackground(new Color(91,64,153));
				AfficherLesEntrainneurs.setBackground(new Color(91,64,153));
				AfficherLesEquipes.setBackground(new Color(91,64,153));
				AfficherLesMatchs.setBackground(new Color(91,64,153));
			}
		});
	
		
		JPanel AfficherSupprimer = new JPanel();
		Parent.add(AfficherSupprimer, "name_608660591211400");
		AfficherSupprimer.setLayout(null);
		
		JPanel SupprimerUneCompetition = new JPanel();
		SupprimerUneCompetition.setLayout(null);
		SupprimerUneCompetition.setBackground(new Color(91, 64, 153));
		SupprimerUneCompetition.setBounds(20, 60, 250, 250);
		AfficherSupprimer.add(SupprimerUneCompetition);
		
		JLabel TitreSupprimerCompet1 = new JLabel("Supprimer une");
		TitreSupprimerCompet1.setForeground(Color.WHITE);
		TitreSupprimerCompet1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerCompet1.setBounds(57, 35, 148, 30);
		SupprimerUneCompetition.add(TitreSupprimerCompet1);
		
		JLabel TitreSupprimerCompet2 = new JLabel("comp\u00E9tition");
		TitreSupprimerCompet2.setForeground(Color.WHITE);
		TitreSupprimerCompet2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerCompet2.setBounds(67, 64, 133, 30);
		SupprimerUneCompetition.add(TitreSupprimerCompet2);
		
		JLabel SupprimerCompet = new JLabel("");
		SupprimerCompet.setIcon(new ImageIcon(imageCoupe));
		SupprimerCompet.setBounds(92, 130, 67, 60);
		SupprimerUneCompetition.add(SupprimerCompet);
		
		JPanel SupprimerUnJoueur = new JPanel();
		SupprimerUnJoueur.setLayout(null);
		SupprimerUnJoueur.setBackground(new Color(91, 64, 153));
		SupprimerUnJoueur.setBounds(289, 60, 250, 250);
		AfficherSupprimer.add(SupprimerUnJoueur);
		
		JLabel TitreSupprimerJoueur1 = new JLabel("Supprimer un");
		TitreSupprimerJoueur1.setForeground(Color.WHITE);
		TitreSupprimerJoueur1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerJoueur1.setBounds(70, 37, 133, 30);
		SupprimerUnJoueur.add(TitreSupprimerJoueur1);
		
		JLabel TitreSupprimerJoueur2 = new JLabel("joueur");
		TitreSupprimerJoueur2.setForeground(Color.WHITE);
		TitreSupprimerJoueur2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerJoueur2.setBounds(99, 62, 79, 30);
		SupprimerUnJoueur.add(TitreSupprimerJoueur2);
		
		
		JLabel SupprimerJoueur = new JLabel("");
		SupprimerJoueur.setIcon(new ImageIcon(imagePersonne));
		SupprimerJoueur.setBounds(96, 120, 67, 70);
		SupprimerUnJoueur.add(SupprimerJoueur);
		
		JPanel SupprimerUnArbitre = new JPanel();
		SupprimerUnArbitre.setLayout(null);
		SupprimerUnArbitre.setBackground(new Color(91, 64, 153));
		SupprimerUnArbitre.setBounds(557, 60, 250, 250);
		AfficherSupprimer.add(SupprimerUnArbitre);
		
		JLabel TitreSupprimerArbitre1 = new JLabel("Supprimer un");
		TitreSupprimerArbitre1.setForeground(Color.WHITE);
		TitreSupprimerArbitre1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerArbitre1.setBounds(64, 37, 140, 30);
		SupprimerUnArbitre.add(TitreSupprimerArbitre1);
		
		JLabel TitreSupprimerArbitre2 = new JLabel("arbitre");
		TitreSupprimerArbitre2.setForeground(Color.WHITE);
		TitreSupprimerArbitre2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerArbitre2.setBounds(95, 60, 79, 30);
		SupprimerUnArbitre.add(TitreSupprimerArbitre2);
		
		JLabel SupprimerArbitre = new JLabel("");
		SupprimerArbitre.setIcon(new ImageIcon(imageSifflet));
		SupprimerArbitre.setBounds(96, 121, 62, 70);
		SupprimerUnArbitre.add(SupprimerArbitre);
		
		JPanel SupprimerUnEntrainneur = new JPanel();
		SupprimerUnEntrainneur.setLayout(null);
		SupprimerUnEntrainneur.setBackground(new Color(91, 64, 153));
		SupprimerUnEntrainneur.setBounds(20, 328, 250, 250);
		AfficherSupprimer.add(SupprimerUnEntrainneur);
		
		JLabel TitreSupprimerEntrainneur1 = new JLabel("Supprimer un");
		TitreSupprimerEntrainneur1.setForeground(Color.WHITE);
		TitreSupprimerEntrainneur1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerEntrainneur1.setBounds(60, 36, 133, 30);
		SupprimerUnEntrainneur.add(TitreSupprimerEntrainneur1);
		
		JLabel TitreSupprimerEntrainneur2 = new JLabel("entra\u00EEneur");
		TitreSupprimerEntrainneur2.setForeground(Color.WHITE);
		TitreSupprimerEntrainneur2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerEntrainneur2.setBounds(70, 63, 121, 30);
		SupprimerUnEntrainneur.add(TitreSupprimerEntrainneur2);
		
		JLabel SupprimerEntrainneur = new JLabel("");
		SupprimerEntrainneur.setIcon(new ImageIcon(imageEntrainneur));
		SupprimerEntrainneur.setBounds(92, 120, 67, 70);
		SupprimerUnEntrainneur.add(SupprimerEntrainneur);
		
		JPanel SupprimerUneEquipe = new JPanel();
		SupprimerUneEquipe.setLayout(null);
		SupprimerUneEquipe.setBackground(new Color(91, 64, 153));
		SupprimerUneEquipe.setBounds(289, 328, 250, 250);
		AfficherSupprimer.add(SupprimerUneEquipe);
		
		JLabel TitreSupprimerEquipe1 = new JLabel("Supprimer une");
		TitreSupprimerEquipe1.setForeground(Color.WHITE);
		TitreSupprimerEquipe1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerEquipe1.setBounds(60, 37, 139, 30);
		SupprimerUneEquipe.add(TitreSupprimerEquipe1);
		
		JLabel TitreSupprimerEquipe2 = new JLabel("\u00E9quipe");
		TitreSupprimerEquipe2.setForeground(Color.WHITE);
		TitreSupprimerEquipe2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerEquipe2.setBounds(96, 61, 79, 30);
		SupprimerUneEquipe.add(TitreSupprimerEquipe2);
		
		JLabel SupprimerEquipe = new JLabel("");
		SupprimerEquipe.setIcon(new ImageIcon(imageLivre2));
		SupprimerEquipe.setBounds(96, 120, 67, 70);
		SupprimerUneEquipe.add(SupprimerEquipe);
		
		JPanel SupprimerUnMatch = new JPanel();
		SupprimerUnMatch.setLayout(null);
		SupprimerUnMatch.setBackground(new Color(91, 64, 153));
		SupprimerUnMatch.setBounds(557, 328, 250, 250);
		AfficherSupprimer.add(SupprimerUnMatch);
		
		JLabel TitreSupprimerMatch1 = new JLabel("Supprimer un");
		TitreSupprimerMatch1.setForeground(Color.WHITE);
		TitreSupprimerMatch1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerMatch1.setBounds(64, 37, 147, 30);
		SupprimerUnMatch.add(TitreSupprimerMatch1);
		
		JLabel TitreSupprimerMatch2 = new JLabel("match");
		TitreSupprimerMatch2.setForeground(Color.WHITE);
		TitreSupprimerMatch2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TitreSupprimerMatch2.setBounds(96, 61, 68, 30);
		SupprimerUnMatch.add(TitreSupprimerMatch2);
		
		JLabel SuprimerMatch = new JLabel("");
		SuprimerMatch.setIcon(new ImageIcon(imageBallon2));
		SuprimerMatch.setBounds(96, 121, 68, 70);
		SupprimerUnMatch.add(SuprimerMatch);
		
		JPanel fond_2 = new JPanel();
		fond_2.setBounds(10, 11, 812, 591);
		AfficherSupprimer.add(fond_2);
		
		
		fond.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BoutonCreerCompet.setBackground(new Color(91,64,153));
				BoutonCreerEquipe.setBackground(new Color(91,64,153));
				BoutonCreerParticipant.setBackground(new Color(91,64,153));
				BoutonCreerMatch.setBackground(new Color(91,64,153));
			}
		});
		
		BoutonMP.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BoutonMP.setBackground(new Color(135,122,185));
				BoutonAfficher.setBackground(new Color(100, 84, 163));
				BoutonSupprimer.setBackground(new Color(100, 84, 163));
				Parent.removeAll();
				Parent.add(MenuDeDroite);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		
		BoutonAfficher.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BoutonMP.setBackground(new Color(100, 84, 163));
				BoutonAfficher.setBackground(new Color(135,122,185));
				BoutonSupprimer.setBackground(new Color(100, 84, 163));
				Parent.removeAll();
				Parent.add(AfficherDroite);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		
		BoutonSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				BoutonMP.setBackground(new Color(100, 84, 163));
				BoutonAfficher.setBackground(new Color(100, 84, 163));
				BoutonSupprimer.setBackground(new Color(135,122,185));
				Parent.removeAll();
				Parent.add(AfficherSupprimer);
				Parent.repaint();
				Parent.revalidate();
			}
		});
		
		SupprimerUneCompetition.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(100, 84, 163));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
		
		SupprimerUnJoueur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(100, 84, 163));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
		
		SupprimerUnArbitre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(100, 84, 163));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
		
		SupprimerUnEntrainneur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(100, 84, 163));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
		
		SupprimerUneEquipe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(100, 84, 163));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
		
		SupprimerUnMatch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(100, 84, 163));
			}
		});
		
		fond_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				SupprimerUneCompetition.setBackground(new Color(91,64,153));
				SupprimerUnJoueur.setBackground(new Color(91,64,153));
				SupprimerUnArbitre.setBackground(new Color(91,64,153));
				SupprimerUnEntrainneur.setBackground(new Color(91,64,153));
				SupprimerUneEquipe.setBackground(new Color(91,64,153));
				SupprimerUnMatch.setBackground(new Color(91,64,153));
			}
		});
				
		Menu.setBounds(100, 100, 1226, 653);
		Menu.setResizable(false);
		Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}