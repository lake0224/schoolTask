package schoolClass;

import java.io.*;


public class test3_1 {
	public static void main(String arg[]) {
		  
	    BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	    try {
	    	System.out.println("金額を打ち込んでください。");
	    String	line = reader.readLine();
	    int l = Integer.parseInt(line);
	    int[] satu= {10000,5000,1000,500,100,50,10,5,1};
	    
	    for(int v :satu) {
	    	int a = l / v;
	    	l = l % v;
	    	System.out.println(v +"円札： " + a +"枚");
	    }
	    
	    	
	    }catch(IOException e){
	    	System.out.println(e);
	    	
	    }
	}

}
