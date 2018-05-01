package schoolClass;

import java.io.*;

public class Man3_1 {
	 public static void main(String[] args) {
		 String line;
		 int n;
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     try {
	    	 while(true) {
	    		 
	    		 System.out.print("自然数を入力して下さい: ");
		     line = reader.readLine();
		     n = Integer.parseInt(line);
		     if(n <=0){
		    	 	
		    	 	System.out.println("自然数（正の整数）を打ち込んでください。");
		    	 	continue;
		     } else {
		     	break;
		     }
	    	 }
	    	 int i = 1;
		 int tmp = n;
		 while(true){
			 tmp = tmp * n;
		     i++;
		     if(tmp >= 100000000) {
		        break;
		        }
		      }
		      System.out.println(n + "を" + i + "乗すると1億以上になります");
		    } catch (NumberFormatException e) {
		      System.out.println(e);
		    } catch (IOException e) {
		      System.out.println(e);
		    }
	 } 
}
	


