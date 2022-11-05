import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    exo31();
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
          tab[j] = 0;
          //System.out.println("chiffre en double : " + tab[j]);
        }
      }
    }
    System.out.println("tabeau sans doublons : ");
    for (int i = 0 ; i < tab.length ; i++){
      System.out.print(tab[i] + ", ");
    }
  }
}