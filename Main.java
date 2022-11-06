import java.util.Scanner;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    exo36();
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
    for (int j = 0 ; j <tab.length ; j++){
      for (int k = 0 ; k < j ; k++){
        if (tab[j] == tab[k]){
          //supprimer la case du tableau
        }
      }
    }
    System.out.println("tabeau sans doublons : ");
    for (int i = 0 ; i < tab.length ; i++){
      System.out.print(tab[i] + ", ");
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
}