# Projet El PRESIDENTE :

## Base:

Besoin : Crée un jeu vidéo sous forme de projet Maven(java) où l’on incarne un jeune dictateur d’une île tropical en
suivant une liste de règles et d’instruction donné par le prof.

Règle du projet :

- Projet Maven
- Héberger sur GitHub
- Fournir un ReadMe complet avec l’architecture mise en place, les plans de conception, des annotations et expliquation
  quant aux choix effectuer en terme d’algo etc

Spéc fonctionnelle :
Ref document de cours Consignes projet final - El Presidente! - 3AL - 2020_2021.pdf

## Développement:

## définition des classes:

## Faction :

Une classe pour les factions:

- Elle possède une list de constante (string) qui seront les noms possibles pour les differentes factions(j’ai choisie
  de partir sur le constante pour ça pour éviter d’avoir à saisir à plusieurs reprises les mêmes nom et de faire en
  sorte de set au niveau du code les noms possibles pour les factions. CONST bla = ‘bla’
- Un attribut private name contenant le nom de la faction → string name (en final pour bloquer le changement apres
  creation de la classe).
- Un attribut private partisan contenant le nombre de partisans lié à la faction → int partisan
- Un attribut private satisfaction contenant un indicateur quant à la satisfaction de la faction par rapport aux
  décisions prisent par le parti au pouvoir

Au niveau des méthodes, la classe Faction possèdera :
Un constructeur Un getter pour chaque attribut qui le compose Une methode “isEnnemy” permettant de savoir si la
satisfaction à atteint zero et que la faction est dessormais considéré comme étant “perdu” ou “ennemy” Une méthode Bride
permettant de soudoyer une faction prenant en paramettre l’entite ‘country’ et lui retirera 15$ par partisan de la
Faction et augmentera la satisfaction de 10% Parcontre il faudra faire - (le montant payé/10) dans la satisfaction des
loyalistes

## Country :

Une classe Country representant le pays dirigé par ElPresidente :
Elle possèdera :
Un attribut nom qui sera le nom donner par le joueur en début de partie au pays qui va diriger → final String name Un
attribut citizen qui represente la population du pays → int citizen Un attribut industry qui sera un indicateur du taux
d’industrialisation du pays → int industry Un attibut agriculture qui sera un indicateur du taux d’agriculture du pays →
int agriculture Un attribut food qui representera la quantiter de noourriture stocker Un attribut tresury qui
reprensentera la tresorie disponible du pays.

Au niveau des méthodes, la classe Country possèdera :
Un constructeur Des gettes pour chaque attributs qui la compose Une méthode “modifyNumberOfCitizen” qui monte ou descend
le nombre de citoyen Une méthode “increaseIndustry” qui monte l’indicateur industrie du pays si industry + agriculture >
100 renvoie erreur Une méthode “decreaseIndustry“ qui descend l’indicateur industrie du pays, si l’industrie - la valeur
saisie est négative il renvoie une erreur Une méthode “increaseAgriculture” qui monte l’indicateur agriculture du pays
si industry + agriculture > 100 renvoie erreur Une méthode “decreaseAgriculture“ qui descend l’indicateur agriculture du
pays, si l’agriculture - la valeur saisie est négative il renvoie une erreur Une méthode “generateIndustryGain” qui
monte la tresorie du pays en fonction de ‘l’indicateur industry’ → tresorie += 10 *
indicateur industrie Une méthode “”generateAgricultureGain'“ qui monte la nourriture du pays en fonction de
”l'indicateur agriculture” → food += 40 * indicateur agriculture Une méthode “useTreasury” qui decremente l'a trésorie
de la valeur passé en paramettre si valeur tro élever renvoie erreur Une méthode “importeFood” qui prends en paramettre
la quantité de nouriture que le president souhaite acheter, la méthode utilise la trésorie à hauteur de (8$ par unité de
nourriture) et si la tresorie suffit ajouter la quantité saisie à la nourriture stocké

## Choice :

Une classe Choice representant les choix disponibles pour un evennement :
Elle possèdera (tous en final pour éviter la modification):
Un attribut ‘number’ correspondant au numero du choix (entre 1 et 4) par rapport à l’evennement Un attibut
‘impactOn[FactionName]’ pour chaque faction (voir constante entité faction) qui correspondra à l’effet du choix sur une
faction donnée Un attribut ‘impactOn[sectorName] pour chaque secteur (industry/agriculture) qui correcpondra à l’effet
du choix sur un secteur donnée Un attribut ‘impactOnTreasury"’ qui correspondra à l’effet du choix sur la trésorie Un
attribut ‘impactOnFood"’ qui correspondra à l’effet du choix sur la nourriture

Au niveau des méthodes, la classe Choice possèdera:
Un constructeur Des getters pour chaque attributs

## Event:

Une classe Event represantant un evennement d’une saison :
Elle possèdera :
Un attribut “name” qui correspondra au nom de l’evènemement :
Un attribut “description” qui correspondra a une description de l’évènement:
Une liste de choix pour les choix disponible nommée ‘choiceOption’

Au niveau des méthodes, la classe Event possèdera:
Un constructeur Des getters pour chaque attributs

## Saison:

Une classe Saison represantant la notion de saison :


