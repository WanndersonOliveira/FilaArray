import java.util.Scanner;

public class Principal{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    FilaArray<String> fila = new FilaArray<String>();

    fila.enqueue("Plácido");
    fila.enqueue("Jorge");
    fila.enqueue("Pedro");
    fila.enqueue("Carlos");
    //fila.mostrarTudo();

    /*for(int i = 0; i < 5; i++){
      System.out.println("Fila -> elemento "+(i+1)+": "+fila.dequeue());
    }*/

    fila.enqueue("Magnólia");
    //fila.mostrarTudo();
    fila.enqueue("João");
    //fila.mostrarTudo();
    fila.enqueue("Yago");

    fila.mostrarTudo();
  }
}
