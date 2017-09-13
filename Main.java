import java.util.*;

public class Main {

  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Ingresa el limite de la serie fibonacci, 1..n");
    int n = scan.nextInt();

    Stack stack = new Stack();
    for (int i = 1; i <= n +1; i++) {
      stack.push(i);
    }

    calcularFib(stack);

  }

  public static void calcularFib(Stack stack) {

    try {
      int n = (int) stack.pop();
      if ((Optional.ofNullable(n).orElse(0).intValue() != 0)) {
        FibThread hilo = new FibThread("Hilo " + n, n);
        hilo.start();
        calcularFib(stack);
      }
    } catch(Exception e) {
      System.out.println("Fibonacci terminado");
    }

  }

}
