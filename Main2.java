import java.io.*;


public class Main2 {
	  public static void main(String[] args) {
	    int n;
	    String line;
	  
	    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	    try {
	      System.out.print("nの値を打ち込んでください: ");
	      line = reader.readLine();
	      n = Integer.parseInt(line);
	      if (n <= 0) {
	        System.out.println("正の整数を打ち込んでください。");
	      } else {
	        System.out.println("1+2+...+nの値は" + n*(n+1)/2 + "です。");
	      }
	    } catch (NumberFormatException e) {
	      System.out.println(e);
	    } catch (IOException e) {
	      System.out.println(e);
	    }
	  }
	

}
