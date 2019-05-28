# Rapport de projet Java : <br/>Application de dessin vectoriel (ébauche)

# Pain-t
<!-- ![pain-t](./resources/pain-t.jpg | width=100) -->
<img width="200" alt="pain-t" src="resources/pain-t.jpg">


## Fonctionnalités du prototype
L'application a été développée selon le cahier des charges et les fonctionnalités bonus ont été reprises de l'application Microsoft Paint.

Voici la liste exhaustive des fonctionnalités :
* Sélection :
   * Sélection de la forme au click ;
   * Sélection de plusieurs formes en appuyant sur **Shift** tout en cliquant sur les formes ;
   * Sélection des formes au lasso (click and drag) ;
   * Sélection de toutes les formes via **Ctrl + A** ;
   * Navigation et sélection des formes via **Tab** ;
   * Désélection de toutes les formes sélectionnées via **Echap** ;
* Déplacement :
   *  Déplacement des formes sélectionnées au click and drag ;
   *  Déplacement des formes sélectionnées via les flèches du clavier ;
* Création des formes à la volée ;
* Modification :
   * Modification des attributs des formes à la volée ;
   * Redimensionnement des formes via les *handlers* ;
   * Pivot de 90° des formes sélectionnées ;
   * Changement de plan d'un figure ;
* Sauvegarde :
   * Sauvegarde sous le format d'une image ;
   * Sauvegarde sous l'image d'un script (afin de reprendre l'édition du projet) ;
   * Chargement du script ;
* Outils :
   * Zoom du canevas (pas de modification de la taille des formes)


### Raccourcis clavier :
   * **Ctrl + A** : Sélection de toutes les formes ;
   * **Tab** : Navigation et sélection des formes ;
   * **Echap** : Désélection de toutes les formes sélectionnées ;
   * **Suppr** : Suppression des formes sélectionnées ;
   * **Ctrl + C** : Copie des formes sélectionnées ;
   * **Ctrl + V** : Collage des formes copiées ;
   * **Ctrl + X** : Copie et collage des formes sélectionnées ;
   * **Flèches du clavier** : Déplacement les formes sélectionnées ;
   * **P** : Pivot de 90° des formes sélectionnées ;
   * **1** : Met la dernière forme sélectionnée à un plan plus proche ;
   * **2** : Met la dernière forme sélectionnée à un plan plus éloigné ;


## Choix de l'implantation

**Nico, tu écriras ton bordel.<br/>**
Afin de supporter les nouvelles fonctionnalités, l'interface a subit de nombreux changement (développement par *Nicolas Herr*).

**Manon, tu écriras ton bordel.<br/>**
Les formes retenues sont le **SRectangle**, le **SOval**, le **SText** et la **SCollection**. Le SCircle a été remplacé par le SOval, puisque plus logique au niveau du programme. L'objet **Graphics2D** au niveau du **ShapesDraftman** dessine les formes selon leurs limites, selon le cadre les contenant. Ainsi, en implantant le SOval comme une classe fille de SRectangle, SOval peut hériter de ses comportements (comme le redimensionnement via les handlers).

**JN, tu écriras ton bordel.<br/>**

**Leslie, tu écriras ton bordel.<br/>**

## Créateurs
* Nicolas Herr ;
* Manon Heyser ;
* Jean-Noël Balanche ;
* Leslie Caron.