import java.lang.*;

public class FibThread extends Thread {

  private int n;

  public FibThread(String name, int n) {
    super(name);
    this.n = n;
  }

  public int fib(int n) {
    if (n < 2) return n;
    return fib(n - 2) + fib(n - 1);
  }

  @Override
  public void run() {
    System.out.println("Fibonacci " + n + ": " + fib(this.n));
  }

}
