import java.util.Scanner;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    exo20();
  }

  public static void exo1(){
    System.out.println("Lucas");
  }

  public static void exo6(){
    System.out.print("Saisir le nombre de lignes (moitié du osange) : ");
    Scanner scanner = new Scanner(System.in);
    int nombre = scanner.nextInt();
    for (int i = 1 ; i < nombre+1 ; i++){ //partie haute du losange
      for (int espaces = 1 ; espaces < nombre-i+1 ; espaces++){
        System.out.print(" ");
      }
      for (int etoiles = 1 ; etoiles <= i*2-1 ; etoiles++){
        System.out.print("*"); 
      }
      for (int espaces = 1 ; espaces < nombre-i+1 ; espaces++){
        System.out.print(" ");
      }
    System.out.println();
    }
  
    for (int i = nombre-1 ; i >= 1 ; i--){ //partie basse du losange
      for (int espaces = nombre-i+1 ; espaces > 1 ; espaces--){
        System.out.print(" ");
      }
      for (int etoiles = i*2-1 ; etoiles >= 1 ; etoiles--){
        System.out.print("*"); 
      }
      for (int espaces = nombre-i+1 ; espaces > 1 ; espaces--){
        System.out.print(" ");
      }
    System.out.println();
    }
  }
  
//Exercices sur les tableaux :
  
  public static void exo16(){
    int [] tab = {1, 5, 8, 9 ,12 ,9, 10};
    if (tab.length >= 2){
      if (tab[0] == 10 ) {
        System.out.println("Début");
      }
      if (tab[tab.length - 1] == 10){
        System.out.println("Fin");
      }
    }
  }

  public static void exo17(){
    int [] tab = {12, 5, 9, 8, 12};
    if (tab.length >= 2){
      if (tab[0] == tab[tab.length - 1]){
        System.out.println("Les premier et dernier numéros sont identiques");
      }
    }
  }
  
  public static void exo18(){
    int [] tab = {20, 30, 40};
    int copie = tab[0];
    for (int k = 0 ; k < 2 ; k++){
      tab[0] = tab[2 - k];
      tab[2 - k] = copie;
      copie = tab[k];
    }
    System.out.println("tableau :");
    for (int i = 0 ; i < 3 ; i++){  
      System.out.print(tab[i] + " ");
    }
  }

  public static void exo19(){
    int [] tab = {1, 8, 4, 19, 5, 2};
    if (tab.length % 2 == 0){
      if (tab[0] > tab[1] && tab[0] > tab[tab.length - 1]){
          System.out.println("La valeur la plus grande du tableau se trouve au début.");
        } 
      if (tab[1] > tab[0] && tab[1] > tab[tab.length - 1]){
        System.out.println("La valeur la plus grande du tableau se trouve en deuxième."); 
        }
      if (tab[tab.length - 1] > tab[0] && tab[tab.length - 1] > tab[1]){
        System.out.println("La valeur la plus grande du tableau se trouve à la fin.");
      }
    }  
  }

  public static void exo20(){
    //exemple : 64815 -> 6 + 4 + 8 + 1 + 5 -> la somme est deux trois
    String [] lettre = {"zero", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
    int nombre = 64814, somme = 0, afficher = 0, longueur = 1, j = 1;

    while (longueur > 0){    //calcul du nombre de chiffre dans la variable "nombre"
      longueur = nombre / (10 * j);
      j *= 10 ;     
    }

    for (int i = 1 ; i < j ; i *= 10){
      somme += (nombre % (10 * i) - somme)/(i);
    }

    System.out.print("La somme est ");
    for (int i = 10 ; i >= 1 ; i /= 10){
      //afficher = somme % i;
      System.out.print(lettre[afficher] + " ");
    }
  }

  public static void exo21(){
    int tab [] = {2, 48, 10, 65, 3, 20, 15, 2};
    for (int i = 0 ; i < tab.length - 1 ; i++){
      if (tab[i] == 10){
        for (int k = i + 1; k < tab.length - 1 ; k++){
          if (tab[k] == 20){
            System.out.println("Le tableau contient un 10 puis un 20.");
          }
        }
      }
    }
  }

  public static void exo22(){
    int [] tab = {2, 5, 9, 10, 11, 15, 2};
    for (int i = 0 ; i < tab.length - 1 ; i++){
      if (tab[i] == (tab[i + 1] - 1)){
        if (tab[i + 1] == (tab[i + 2] - 1)){
        System.out.println("Le tableau contient trois nombres croissants adjacents");
        }
      }
    }
  }

  public static void exo23(){
    //additionner deux nombres sans utiliser d’opérateurs arithmétiques
  }

  public static void exo24(){
    for (int i = 1 ; i <= 100 ; i++){
      if (i % 3 == 0 && i % 5 == 0){
        System.out.println("fizz buzz");
      } else {
        if (i % 3 == 0){
          System.out.println("Fizz");
        } else if (i % 5 == 0){
          System.out.println("Buzz");
        } else {
          System.out.println(i);
        }
      }
    }
  }

  public static void exo25(){
    int [] tab = {5, 9, 6, 2, 5, 1, 3};
    int occurence = 0, supprimer = 5;
    for (int i = 0 ; i < tab.length - 1 ; i++){
      if (tab[i] == supprimer){
        occurence++;
      }
    }
    System.out.println("Nouvelle longueur du tableau : " + (tab.length - occurence));
  }

  public static void exo26(){
    //boolean [][] tableau = {true, false, true}, {false, true, false};
  }

  public static void exo27(){
    //Algorithme d’Euclide  
  }

  public static void exo28(){
    
  }
  
  public static void exo30(){
    int [] tab = {23, 45, 9, 22, 16, 18};
    int valeurmin = tab[0];
    int valeurmax = tab[0];
    for (int i = 1 ; i < tab.length ; i++){
      if (tab[i] < valeurmin){
        valeurmin = tab[i];
      }
      if (tab[i] > valeurmax){
        valeurmax = tab[i];
      }
    }
    System.out.println("valeur min : " + valeurmin);
    System.out.println("valeur max : " + valeurmax);
  }

  public static void exo31(){
    int [] tab = {12, 22, 34, 54, 22, 2, 67, 34, 22, 12, 4};
    //int [] tabcoupe = new int[tab.length - 1];
    for (int i = 0 ; i < tab.length ; i++){
      for (int k = 0 ; k < i ; k++){
        if (tab[i] == tab[k]){
          //System.arraycopy(tab, 0, tabcoupe, 0, tab.length - 1);
        }
      }
    }
    System.out.println("tableau sans doublons : ");
    for (int j = 0 ; j < tab.length ; j++){
      System.out.print(tab[j] + ", ");
    }
  }

  public static void exo32(){
    int [] tab = {2, 0, -3, -456, 45, -13, 9, -2, 33, 1, -7};
    int echange = 0;
    int fin = tab.length-1;
    for (int i = 0 ; i < fin ; i++){
      if (tab[i] < 0){
        while (tab[fin] < 0){
          fin--;
        }
        echange = tab[fin];
        tab[fin] = tab[i];
        tab[i] = echange;
        fin--; 
      } 
    }
    System.out.println("tableau : ");
    for (int k = 0 ; k < tab.length ; k++){
      System.out.print(tab[k] + " ,");
    }
  }

  public static void exo33(){
    int [] tab = {2, -8, 7, -6, 5};
    int compteur = 0;
    for (int i = 0 ; i < tab.length - 1 ; i++){
      if (tab[i] > 0 && tab[i+1] < 0 || tab[i] < 0 && tab[i+1] > 0){
        compteur++;
      }
    }
    if (compteur == (tab.length - 1)){
      System.out.println("le tableau d’entiers alterne entre des valeurs positives et négatives.");
    } else {
      System.out.println("le tableau d’entiers n'alterne pas entre des valeurs positives et négatives.");
    }
  }

  public static void exo34(){
    String [] tab = {"ab", "abc", "abcd", "abcde", "abcdef"};  
  }

  public static void exo35(){
      
  }
  
//Exercices sur les chaînes de caratères
  
  public static void exo36(){
    String phrase = "test de phrase une après la fin";
    int fin = phrase.length();
    String phraseinv = "";
    while (fin > 0){
      int index = phrase.lastIndexOf(" "); //detection du dernier espace de la phrase
      String mot = phrase.substring(index+1,fin); //extraction du dernier mot de la phrase
      phraseinv = phraseinv.concat(mot + " "); //insertion du mot dans la phrase qui sera inversé
      if (index > 0){
      phrase = phrase.substring(0,index); //suppression du dernier mot de la pharse inséré dans la phrase inversé
      }
      fin = fin - mot.length() - 1; //réduction de la fin de la phrase 
    } 
    System.out.println("phrase inversé : " + phraseinv);
  }

  public static void exo37(){
    String chaine = "abacbacbacbbace";

    String lettre1 = chaine.substring(0,1);
    String apres1 = chaine.substring(1,chaine.length());
    boolean testapres1 = apres1.contains(lettre1);
    if (testapres1 == false){
      System.out.println("index du premier caractère non répétitif : " + 1);
    } else {
      for (int i = 1 ; i < chaine.length() ; i++){
        String lettre = chaine.substring(i,i+1);
        String apres = chaine.substring(i+1,chaine.length());
        boolean testapres = apres.contains(lettre);
        String avant = chaine.substring(0,i-1);
        boolean testavant = avant.contains(lettre);
        if (testavant == false && testapres == false){
          System.out.println("index du premier caractère non répétitif : " + i);
          i = chaine.length() + 1;
        }
      }
    }
  }
}
