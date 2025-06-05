
public class FibonacciSeries {
   public FibonacciSeries() {
   }

   public static void main(String[] var0) {
      byte var1 = 30;
      int var2 = 0;
      int var3 = 1;
      System.out.print("Fibonacci Series: " + var2 + ", " + var3);

      for(int var5 = 2; var5 < var1; ++var5) {
         int var4 = var2 + var3;
         System.out.print(", " + var4);
         var2 = var3;
         var3 = var4;
      }

   }
}
