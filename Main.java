import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        

    Integer nilai;
    Scanner input = new Scanner(System.in);
     
    System.out.print("Input Nilai Anda (0 - 100): ");
    nilai = input.nextInt();
     
    if (nilai <= 99 ) {
      System.out.println("A");
    }
    else if (nilai >= 80 && nilai < 89) {
      System.out.println("B");
    }
    else if (nilai >= 70 && nilai < 79) {
      System.out.println("C");
    }
    else if (nilai >= 60 && nilai < 69) {
      System.out.println("D");
    }
    else if (nilai < 50) {
      System.out.println("E");
    }
    else {
      System.out.println("Maaf, format nilai tidak sesuai");
    }
    
  }
}


