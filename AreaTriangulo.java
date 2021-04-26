import java.util.Scanner;
class AreaTriangulo{
  static Scanner teclado=new Scanner (System.in);
  public static void main(String[]arg){
    //definición de variables
    System.out.println("Ejercicio 01: Hallar Área del Triangulo");
    int b,h,area;
    //datos de entrada
    System.out.println("Ingrese Base: ");
    b=teclado.nextInt();
    System.out.println("Ingrese Base: ");
    h=teclado.nextInt();
    //Proceso
    area=b*h/2;
    System.out.print("El área del trinagulo es: " + area);

  }
}