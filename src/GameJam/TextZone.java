package GameJam;

public enum TextZone {

	//Porte de Métropolis//
	GRILLE("Devant les imposants bâtiments de Metropolis se dressait une grille, fermée,\n" +
			"rouillée et totalement bloquée."),
	PANNEAU_CTRL_S("Shizen : 'Je ne saurais pas quoi en faire !'"),
	PANNEAU_CTRL_T("Teckna : 'Je pense pouvoir ouvrir la porte."),
	FOND_METROPOLIS("Sous les yeux emerveillé des déesses se dessinaient\n" +
			"la mangnifique cité de Metropolis, ou plutôt ce qu'il en restait.\n" +
			"Teckna versa une larme."),
	PM_SOL_Sg("Shizen planta une graine sur le sol fertile devant la grille et grâce à\n" +
			"ses pouvoirs divins un arbre poussa avec une vitesse hallucinante et bientôt\n" +
			"ses branches repoussèrent même le plus solide des aciers. La porte n'était plus."),
	PM_SOL_S("Shizen : 'Ce sol semblait particulièrement fertile. Chose assez rare en ces\n" +
			"lieux.'"),
	PM_SOL_T("Teckna : 'C'est juste le sol..."),
	
	//Serre (exterieur)//
	DOME_SERRE("Imposant et majestueux, le dôme se dressait fièrement, résistant aux ravages\n" +
			"nucléaires déclenchés par les hommes."),
	ROBOT_S("Shizen : 'Je ne comprends pas cette boite de ferraille !"),
		//Dialogue avec le robot
		ROBOT_T(""),
		ROBOT_T1(""),
		ROBOT_T2(""),	
		//
	
	//Serre (intérieur)//
	ARBRISEAU_Sd("Objet obtenu : Graine d'Arbriseau"),
	RONCES_G("Ces ronces étaient énormes et occupaient la quasi-totalitée du dome désormais."),
	RONCES_D("Ces ronces étaient énormes et semblaient cacher quelque chose. Il fallait " +
			"un outil pour dégager le passage."),
	MECANISME("Une fois la grande chaine tirée, le cage se souleva et l'arbriseau semblait\n" +
			"désormais accessible."),
	CAGE("Cette petite cage en acier protégeait un arbriseau en parfaite santée. C'était\n" +
			"peut-être l'un des rares arbres aujourd'hui encore sain."),
	
	//Grand'Place
	STATUE(""),
	BATIMENTS(""),
	
	//Centrale nucléaire (extérieur)
	FACADE("La tour du réacteur de la centrale était en piteuse état. Une partie\n" +
			"non-négligeable de la tour n'était plus et les radiations pouvaient\n" +
			"sortir du réacteur en toute liberté."),
	FACADE_T("Teckna : Il va falloir contenir les radiations qui sortent de ce réacteur !\n" +
			" Pour commencer je devrais trouver un élément en acier ou se rapprochant."),
	FACADE_Tf(""),
	
	//Centrale nucléaire (salle du reacteur)
	COEUR(""),
	COEUR_A(""),
	COEUR_Se(""),
	FIOLE("");

	private String txt;

	private TextZone(String a) {
		this.txt = a;
	}
	
	public String val(){
		return txt;
	}
}
