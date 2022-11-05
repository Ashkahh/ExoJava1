import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    exo6();
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
}