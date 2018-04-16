package schoolClass;

import java.util.*;
import java.io.*;



public class Main2_2 {
	public static void main(String[] args) {
		int l,m,n;
	    String line,line1,line2;
	    List<Integer> box= new ArrayList<Integer>();
	  
	    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	    try {
	      System.out.print("第１の数は？: ");
	      line = reader.readLine();
	      l = Integer.parseInt(line);
	      box.add(l);
	      System.out.print("第２の数は？: ");
	      line1 = reader.readLine();
	      m = Integer.parseInt(line1);
	      box.add(m);
	      System.out.print("第３の数は？: ");
	      line2 = reader.readLine();
	      n = Integer.parseInt(line2);
	      box.add(n);
	      Collections.sort(box);
	      
	      
	      System.out.println("最大値は "+ box.get(2) + "、 中間値は" + box.get(1) + "、 最小値は " + box.get(0) + " です。");
	      
	      
	      
	    }catch(NumberFormatException e){
	    	System.out.println(e);
	    }catch(IOException e) {
	    	System.out.println(e);
	    }	
	}

}
